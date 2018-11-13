/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;
import java.util.ArrayList;
/**
 *
 * @author Carlene
 */
public class BankAccounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Account Class
        Account account = new Account(300.00);
        System.out.println(account.getAcctBalance());
        account.credit(200);
        System.out.println(account.getAcctBalance());
        account.debit(200);
        System.out.println(account.getAcctBalance());
        // For output cleanup
        System.out.printf("%n%n%n");
         

         
        // Savings Account
        SavingsAccount sAccount = new SavingsAccount(500);
        System.out.println(sAccount.getAcctBalance());
        sAccount.credit(200);
        System.out.println(sAccount.getAcctBalance());
        sAccount.debit(200);
        System.out.println(sAccount.getAcctBalance());
        // For output cleanup
        System.out.printf("%n%n%n");

        // Checking Account                         intial balance and fee
        CheckingAccount cAccount = new CheckingAccount(500, 2);
        System.out.println(cAccount.getAcctBalance());
        cAccount.credit(200);
        System.out.println(cAccount.getAcctBalance());
        cAccount.debit(200);
        System.out.println(cAccount.getAcctBalance());
    }

}
    

