
public class SavingAccount extends account{
    private double interest_rate;
    public SavingAccount(String accountNumber, String accountHolder, double balance, double interest_rate){
        super(accountNumber, accountHolder,balance);
        this.interest_rate=interest_rate;
    }
    public void addInterest(){
        double interest=balance*(interest_rate/100);
        deposit(interest);
    }

}

