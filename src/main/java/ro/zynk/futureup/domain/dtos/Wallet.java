package ro.zynk.futureup.domain.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.zynk.futureup.controllers.responses.WalletResponse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "wallets")
public class Wallet extends BaseEntity {
    @Column
    private String name;

    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CoinAmount> coinAmounts = new ArrayList<>();

    public Wallet(String name) {
        this.name = name;
    }

    public Wallet(WalletResponse walletResponse) {
        this.name = walletResponse.getName();
    }

//    public Wallet() {
//    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<CoinAmount> getCoinAmounts() {
//        return coinAmounts;
//    }
//
//    public void setCoinAmounts(List<CoinAmount> coinAmounts) {
//        this.coinAmounts = coinAmounts;
//    }
}
