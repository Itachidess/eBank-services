package org.sid.ebankservice.web;

import org.sid.ebankservice.entities.BankAccount;
import org.sid.ebankservice.entities.repository.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class BankAccountRestController {
   // @Autowired // injection d'une dependance  ou bien on utilise constructeur avec parametre
                // Affecte des valeurs aux objets


    private BankAccountRepository bankAccountRepository;

    public BankAccountRestController(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @PutMapping("/bankAccounts/{id}")
    public BankAccount update(@RequestBody BankAccount bankAccount, @PathVariable String id)
    {
        bankAccount.setId(id);
        return bankAccountRepository.save(bankAccount);
    }

    @DeleteMapping("/bankAccounts/{id}")
    public void delete(@PathVariable String id)
    {
        bankAccountRepository.deleteById(id);
    }

    @GetMapping("/bankAccounts") // format JSON
    public List<BankAccount> bankAccounts()
    {
        return bankAccountRepository.findAll();
    }
    @GetMapping("/bankAccounts/{id}") // format JSON
    public BankAccount getAccount(@PathVariable String id)
    {
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException("Account not found"));
    }
    @PostMapping("/bankAccounts")
    public BankAccount save(@RequestBody/*Enregistre*/ BankAccount bankAccount)
    {
        bankAccount.setId(UUID.randomUUID().toString());
        return        bankAccountRepository.save(bankAccount);

    }

    /*Mise a jour ( update) */








}
