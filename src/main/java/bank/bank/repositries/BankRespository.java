package bank.bank.repositries;

import bank.bank.entities.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRespository extends CrudRepository<Bank,Long> {
}
