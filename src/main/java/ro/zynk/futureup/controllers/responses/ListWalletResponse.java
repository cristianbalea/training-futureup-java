package ro.zynk.futureup.controllers.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ListWalletResponse extends BaseResponse {
    private List<WalletResponse> walletResponses;

//    public ListWalletResponse(List<WalletResponse> coinTransactionResponses) {
//        this.walletResponses = coinTransactionResponses;
//    }
//
//    public List<WalletResponse> getWalletResponses() {
//        return walletResponses;
//    }
//
//    public void setWalletResponses(List<WalletResponse> walletResponses) {
//        this.walletResponses = walletResponses;
//    }
}
