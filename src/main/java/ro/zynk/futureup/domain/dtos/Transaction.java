package ro.zynk.futureup.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @Column
    private LocalDateTime transactionDate;
    @Column
    private Double amount;
    @Column
    private float totalValue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="coin_id", referencedColumnName = "id")
    private Coin coin;
}
