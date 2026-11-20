package benakka;

import benakka.enums.AccountStatus;
import benakka.enums.AccountType;
import benakka.model.BankAccount;
import benakka.model.BankDirector;
import benakka.repository.AccountRepositoryImpl;
import benakka.util.JsonSerializer;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    static void main() throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        // ---------------SINGLOTTON ----------------
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        // ------------------------------------------

        // ---------------- les threads ------------------------
        for (int i = 0; i <10 ; i++) {
            new Thread(()->{
                accountRepository.populateData();
            }).start();
        }

        System.out.print("Tape a character:"); // pour blocker car les thread ne block pas
        System.in.read();


        // =========================================================================

        List<BankAccount> bankAccounts = accountRepository.findAll();

//        List<BankAccount> bankAccounts = accountRepository.searchAccounts(new Predicate<BankAccount>() {
//            @Override
//            public boolean test(BankAccount bankAccount) {
//                return bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT);
//            }
//        });
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

//        System.out.println("=================");
//        BankAccount account = accountRepository.findById(1L).orElse(null);
//        if(account!=null){
//            System.out.println(bankAccountJsonSerializer.toJson(account));
//        }
    }


}
