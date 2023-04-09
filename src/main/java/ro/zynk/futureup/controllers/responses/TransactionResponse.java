package ro.zynk.futureup.controllers.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.zynk.futureup.domain.dtos.Coin;
import ro.zynk.futureup.domain.dtos.Transaction;

import java.sql.Date;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class TransactionResponse extends BaseResponse {
    private Long id;

    private LocalDateTime transactionDate;

    private Double amount;

    private float totalValue;

    private Long coinId;

    public TransactionResponse(Transaction transaction) {
        this.id = transaction.getId();
        this.transactionDate = transaction.getTransactionDate();
        this.amount = transaction.getAmount();
        this.totalValue = transaction.getTotalValue();
        this.coinId = transaction.getCoin().getId();
    }
}
