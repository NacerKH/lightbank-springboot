package bank.bank.services;

import bank.bank.entities.Bank;
import bank.bank.repositries.BankRespository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class BankService implements BankServiceInterface {

    BankRespository _BankRespository;
     @Override
   public  Bank store(Bank bank){
         System.out.println(bank);
       return _BankRespository.save(bank);
    }


}
