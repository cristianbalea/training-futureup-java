package ro.zynk.futureup.controllers.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CoinExchangeRequest {
    private Long coinId;
    // coin amount entity from which you use funds to buy the coin
    private Long coinAmountId;
    private Float amount;
}
