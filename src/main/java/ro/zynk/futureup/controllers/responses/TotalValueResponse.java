package ro.zynk.futureup.controllers.responses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class TotalValueResponse extends BaseResponse {
    private float totalValue;

    public TotalValueResponse(ListCoinTransactionResponse listCoinTransactionResponse) {
        totalValue = 0;
        List<CoinTransactionResponse> coinTransactionResponses =
                listCoinTransactionResponse.getCoinTransactionResponses();
        for(CoinTransactionResponse c : coinTransactionResponses) {
            totalValue += c.getAmount() * c.getCoinResponse().getValue();
        }
    }
}
