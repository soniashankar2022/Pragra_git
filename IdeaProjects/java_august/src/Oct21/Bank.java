package Oct21;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Bank {
    private String accountHolderName;
    private String accountType;
    private String accountNumber;
    private double accountBalance;

    // Constructor
    public Bank(String accountHolderName, String accountType, String accountNumber, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    //setter
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    //getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;

    }
 public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
 public double getaccountbalance() {
        return accountBalance;
    }
    public void withdraw ( double amount){

                //accountBalance-=amount;
        accountBalance = accountBalance - amount;

        System.out.println("Withdrawal successful "  +  accountBalance);

            }
        public void deposit ( double amount){
            //accountBalance += amount;
            accountBalance = accountBalance + amount;

            System.out.println("after deposit  " + accountBalance);
        }

    public void checkBalance() {
        System.out.println("Current Balance: " + accountBalance);
    }
    public void printStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + accountBalance);

    }

    public static void main(String[] args) {

        Bank account = new Bank("Sonia","checking","123456789",1000.90);
       Scanner scan=new Scanner(System.in);
        System.out.println("enter the deposit amount");
        double dep= scan.nextDouble();
        System.out.println("enter the withdrawal amount");
        double withdrawalamount= scan.nextDouble();
        account.checkBalance();
       account.deposit(dep);
       account.getaccountbalance();
       account.printStatement();
       account.withdraw(withdrawalamount);

    }
    }




