package ro.zynk.futureup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.zynk.futureup.controllers.responses.ListTransactionResponse;
import ro.zynk.futureup.controllers.responses.TransactionResponse;
import ro.zynk.futureup.domain.dtos.Transaction;
import ro.zynk.futureup.domain.repositories.TransactionRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public ListTransactionResponse getTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();

        List<TransactionResponse> transactionResponses = new ArrayList<>();

        for(Transaction t : transactions) {
            transactionResponses.add(new TransactionResponse(t));
        }

        return new ListTransactionResponse(transactionResponses);
    }

    public ListTransactionResponse getTransactionsGreaterThan(float totalPrice) {
        List<Transaction> transactions = transactionRepository.findAllGreaterThan(totalPrice);

        List<TransactionResponse> transactionResponses = new ArrayList<>();

        for(Transaction t : transactions) {
            transactionResponses.add(new TransactionResponse(t));
        }

        return new ListTransactionResponse(transactionResponses);
    }
}
