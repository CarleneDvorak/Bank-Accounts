package bankaccounts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlene
 */
public class Account {
   double acctBalance = 0;

    
        

    public Account(double initialBalance) {
        // included if statement to check if the balance is greater than zero first
        if (initialBalance >= 0) {
            this.acctBalance = initialBalance;
        } else {
            System.out.println("Cannot have an intial balance of " + initialBalance);
        }
    }
  
     public void credit(double amount){
        acctBalance += amount;
        System.out.println("You have a credit of " + amount 
                + "  your balance is " + acctBalance);
     }
     
     public boolean debit(double amount){        
        if (this.acctBalance - amount <= 0.0) {
            System.out.println("Withdraw amount has exceeeded account balance");
            return false;
        } else {
            this.acctBalance -= amount;
            System.out.println("You have withdrew " + amount + "and your remaining balance is " + this.acctBalance);
            return true;
        }
       
     }

    public double getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }  
}
