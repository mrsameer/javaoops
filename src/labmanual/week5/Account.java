/*
Create a class Account with an instance variable balance (double). It should contain a
constructor that initializes the balance, ensure that the initial balance is greater than 0.0.
Acct details: Acct_Name, Acct_acctno, Acct_Bal, Acct_Address.
Create two methods namely credit and debit, getBalance. The Credit adds the amount
(passed as parameter) to balance and does not return any data. Debit method withdraws
money from an Account. GetBalance displays the amount. Ensure that the debit amount
does not exceed the Account’s balance. In that case the balance should be left unchanged
and the method should print a message indicating
“Debit amount exceeded account
balance”
 */
package labmanual.week5;

import java.util.Scanner;

public class Account {
    private Double balance;
    private String accountName;
    private long acccountNo;
    private String accountAddress;

    public Account(Double balance, String accountName, long acccountNo, String accountAddress) {
        if (balance > 0.0)
            this.balance = balance;
        this.accountName = accountName;
        this.acccountNo = acccountNo;
        this.accountAddress = accountAddress;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAcccountNo() {
        return acccountNo;
    }

    public void setAcccountNo(long acccountNo) {
        this.acccountNo = acccountNo;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }

    // credit (add) amount to the account
    public void credit(double amount) {
        this.setBalance(balance + amount);
    }

    // debit or withdraw (subtract an amount from the balance)
    public boolean debit(double amount) {
        if (balance >= amount)
            this.setBalance(balance-amount);
        else
            return false;
        return true;
    }
}

class AccountDemo {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Account account1 = new Account(1000.0, "sameer sbi account", 1, "hyderabad");
        Account account2 = new Account(12000.0, "roy andhra bank account", 34, "new york");

        // display initial balance of each object.
        System.out.printf("account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account2 balance: %.2f\n", account2.getBalance());

        double depositAmount;  // deposit amount read from the user
        double withDrawAmount; // withdraw amount read from the user

        System.out.print("Enter the deposit amount for account1: "); // prompt
        depositAmount = sc.nextDouble();
        account1.credit(depositAmount);
        System.out.printf("Deposited %.2f rupees into account1\n", depositAmount);

        // display current balances
        System.out.printf("account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account2 balance: %.2f\n", account2.getBalance());

        System.out.print("Enter the deposit amount for account2: "); // prompt
        depositAmount = sc.nextDouble();
        account2.credit(depositAmount);
        System.out.printf("Deposited %.2f rupees into account2\n", depositAmount);

        // display current balances
        System.out.printf("account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account2 balance: %.2f\n", account2.getBalance());

        System.out.print("Enter withdraw amount for account1: "); // prompt
        withDrawAmount = sc.nextDouble();
        if (account1.debit(withDrawAmount) == true)
            System.out.println("Succesfully withdrawn");
        else
            System.out.println("Insufficient funds");

        // display current balances
        System.out.printf("account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account2 balance: %.2f\n", account2.getBalance());

        System.out.print("Enter withdraw amount for account2: "); // prompt
        withDrawAmount = sc.nextDouble();
        if (account2.debit(withDrawAmount) == true)
            System.out.println("Succesfully withdrawn");
        else
            System.out.println("Insufficient funds");

        // display current balances
        System.out.printf("account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("account2 balance: %.2f\n", account2.getBalance());
    }
}