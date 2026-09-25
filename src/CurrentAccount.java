public class CurrentAccount extends account {
    private double overdraft_limit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraft_limit) {
        super(accountNumber, accountHolder, balance);
        this.overdraft_limit = overdraft_limit;
    }


    public void withdraw(double amount) {
        if(amount <= balance + overdraft_limit) {
            balance-=amount;
            System.out.println(amount+"withdrawn");
            System.out.println("updated balance amount is "+balance);
        }else{
            System.out.println("requested withdrawn amount too high");
        }
    }

}