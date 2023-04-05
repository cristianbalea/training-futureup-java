package ro.zynk.futureup.controllers.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.zynk.futureup.domain.dtos.Coin;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CoinResponse extends BaseResponse {
    private Long id;
    private String name;
    private Double value;

    public CoinResponse(Coin coin) {
        this.id = coin.getId();
        this.name = coin.getName();
        this.value = coin.getValue();
    }

//    public CoinResponse() {
//    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Double getValue() {
//        return value;
//    }
//
//    public void setValue(Double value) {
//        this.value = value;
//    }
}
