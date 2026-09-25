import java.util.*;

public class Bank {
    private List<account> accounts=new ArrayList<>();

    public void addAccount(account account){
        accounts.add(account);
        System.out.println("Account added");
    }
    public account search(String accountnumber) {
        for(int i = 0; i< accounts.size();i++) {
            account acc = accounts.get(i);
            if (acc.getAccountNumber().equals(accountnumber)) {
                return acc;
            }
        }
        System.out.println("Account not found");
        return null;
    }

    public void transfermoney(String fromAccountnumber ,String toAccountnumber, double amount) {
        account fromAccount = search(fromAccountnumber);
        account toAccount = search(toAccountnumber);

        if (fromAccount!=null && toAccount!=null){
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("transferred"+amount+"from"+fromAccountnumber+"to"+toAccountnumber);
        }
    }}

//if withrdraw amount is insufficient when transferring money we need to use excpetion handling