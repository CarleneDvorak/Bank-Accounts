
package bankaccounts;

/**
 *
 * @author Carlene
 */
public class SavingsAccount extends Account{
    // Static Global Variable
    public final static double interestRate = 0.8;

    public SavingsAccount (double initialBalance) {
        super(initialBalance);
    }
    
    public double CalculateInterest(double interest){
        return interestRate * acctBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
