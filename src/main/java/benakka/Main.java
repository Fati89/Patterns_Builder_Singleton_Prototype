package benakka;

import benakka.enums.AccountStatus;
import benakka.enums.AccountType;
import benakka.model.BankAccount;
import benakka.model.BankDirector;
import benakka.repository.AccountRepositoryImpl;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        AccountRepositoryImpl accountRepository=new AccountRepositoryImpl();
        accountRepository.populateData();
        List<BankAccount> bankAccounts = accountRepository.findAll();
        bankAccounts.forEach(System.out::println);
    }
}
