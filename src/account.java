public class account{
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    public account(String accountNumber,String accountHolder,double balance){
        this.accountNumber= accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " has been deposited");
        System.out.println("balance amount is " + balance);
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("insufficient balance");
        }else{
            balance-=amount;
            System.out.println("withdrawn "+ amount +"from bank");
            System.out.println("updated balance amount is " + balance);
        }
    }
    public void CheckBalance(){
        System.out.println("balance is"+ balance);
    }
}

