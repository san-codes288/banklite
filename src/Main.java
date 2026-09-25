
//BASIC BANKING SYSTEM WITH FEATURES LIKE ACCOUNT CREATION, DEPOSIT WITHDRAW AND BALANCE ENQUIRY
//CREATION,DEPOSIT,WITHDRAW,CHEQUE, TRANSFER FUNDS

public class Main{
    public static void main(String[]args){
        Bank bank=new Bank();
        SavingAccount savings=new SavingAccount("SA1234","Sanidhya",1000000,5);
        CurrentAccount current=new CurrentAccount("CA1234","Rayal",1000000,50000);
        bank.addAccount(current);
        bank.addAccount(savings);

        savings.deposit(1000);

        bank.transfermoney("SA1234", "CA1234", 500);
    }
}