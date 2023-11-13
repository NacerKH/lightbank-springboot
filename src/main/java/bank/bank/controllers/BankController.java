package bank.bank.controllers;

import bank.bank.entities.Bank;
import bank.bank.services.BankService;
import bank.bank.services.BankServiceInterface;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/bank")
@ResponseBody
public class BankController {
    @Autowired

   private  BankService _bankService;

@PostMapping("/store")
@ResponseBody
    public  Bank add(@RequestBody Bank bank){
    System.out.println(bank);
        return _bankService.store(bank);
    }
}
