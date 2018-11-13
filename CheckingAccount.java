/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounts;

/**
 *
 * @author Carlene
 */
public class CheckingAccount extends Account{
   private static double fee;

    public CheckingAccount(double initialBalance, double fee) {
        super(initialBalance);
        this.fee = fee;
    }

    @Override public boolean debit(double amount) {
        boolean t = super.debit(amount);
        if (t = true) {
            acctBalance -= fee;
            System.out.println("you have a fee of " + fee);
            return true;
        }
        return false;
    }
    
    @Override public void credit(double amount){
        if (acctBalance - amount <=0){
                acctBalance -= fee;
                System.out.println("you have a fee of " + fee);
            }
        }
     }

 
    
      
       
          
    
    
    
