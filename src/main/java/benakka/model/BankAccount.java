package benakka.model;

import benakka.enums.AccountStatus;
import benakka.enums.AccountType;

public class BankAccount implements Cloneable {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;
    private Costumer costumer;

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", costumer=" + costumer +
                '}';
    }

    public BankAccount() {
    }

    public BankAccount(Long accountId, double balance, String currency, AccountType type, AccountStatus status) {
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public AccountType getType() {
        return type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public static class AccountBuilder {

        private BankAccount bankAccount=new BankAccount();

        public AccountBuilder accountId(Long id){
            bankAccount.accountId= id;
            return this;
        }

        public AccountBuilder currency(String currency){
            bankAccount.currency=currency;
            return this;
        }

        public AccountBuilder balance(double balance){
            bankAccount.balance=balance;
            return this;
        }

        public AccountBuilder type(AccountType type){
            bankAccount.type=type;
            return this;
        }

        public AccountBuilder status(AccountStatus status){
            if(bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT))
                bankAccount.status=status;
            else bankAccount.status=AccountStatus.ACTIVATED;
            return this;
        }

        public BankAccount build(){
            return this.bankAccount;
        }
    }

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount bankAccount = (BankAccount) super.clone();
        bankAccount.setCostumer(this.costumer.clone());
        return  bankAccount;
    }
}