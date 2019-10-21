/**
 * 
 */
package parjun8840.bankapp.entity;

/**
 * This is API user comment
 * This is an entity class to represent account business data
 * @author parjun8840
 * @version 1.0
 *
 */
public class Account {
private double balance;// Variable to store  account balance- Devloper comment
private String accNo;

public Account() {
}

public Account(String no) {
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
	return balance;// return this.balance;
}

public String getAccountNo() {
	return this.accNo;
}

}
