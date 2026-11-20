package benakka;

import benakka.enums.AccountStatus;
import benakka.enums.AccountType;
import benakka.model.BankAccount;
import benakka.model.Costumer;
import benakka.repository.AccountRepositoryImpl;
import benakka.util.JsonSerializer;

import java.io.IOException;
import java.util.List;

public class Test {
    static void main() throws IOException, CloneNotSupportedException {
        BankAccount account1=new BankAccount();
        account1.setAccountId(1L);
        account1.setCurrency("MAD");
        account1.setType(AccountType.CURRENT_ACCOUNT);
        account1.setBalance(1000);
        account1.setStatus(AccountStatus.ACTIVATED);
        account1.setCostumer(new Costumer(1L, "fati"));


        BankAccount account2=account1.clone();

        System.out.println("ACC1 = "+account1);
        System.out.println("ACC2 = "+account2);

        account2.getCostumer().setNom("imane");

        System.out.println("ACC1 = "+account1);
        System.out.println("ACC2 = "+account2);
    }
}
