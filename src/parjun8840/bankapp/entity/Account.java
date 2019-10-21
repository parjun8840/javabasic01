/**
 * 
 */
package parjun8840.bankapp.entity;

/**
 * This is API user comment
 * This is an entity class to represent account business data
 * @author parjun8840
 * @version 1.0
 * Without account number no question of deposit or withdraw. So initialization has to happen in the constructor.
 *
 */
public class Account {
private double balance;// Variable to store  account balance- Devloper comment.
private String accNo; // Instance variable go in the heap.
private static int count;// Static variable is created as soon as the class is loaded in metaspace.

public Account() {
	count++;
}

public Account(String no) {
	count++;
	this.accNo = no;
}
	
/**
 * API comment
 * This method is used to credit amount into account.
 * @param amt amount to be credited into account.
 */
public void deposit (double amt) { // deposit (Account this, doiuble amt)
	balance +=amt; // this.balance +=amt;
}

/**
 * This method returns current balance in account.
 * @return amount in account.
 */
public double getBalance() { //getBalance(Account this)
	return this.balance;// return this.balance;
}

public String getAccountNo() {
	return this.accNo;
}

public static int getCount() {
	return count;
	
}

}
