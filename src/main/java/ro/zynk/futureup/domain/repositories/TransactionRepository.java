package ro.zynk.futureup.domain.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ro.zynk.futureup.domain.dtos.Transaction;

import java.util.List;

@Repository
public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
    List<Transaction> findAll();

    @Query(value = "select * from transactions t where t.total_value > :totalPrice", nativeQuery = true)
    List<Transaction> findAllGreaterThan(@Param("totalPrice")float totalPrice);

}
