package ro.zynk.futureup.controllers.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
public class ListTransactionResponse extends BaseResponse {
    private List<TransactionResponse> transactionResponses;
}
