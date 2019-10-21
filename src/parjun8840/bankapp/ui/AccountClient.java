package parjun8840.bankapp.ui;

import parjun8840.bankapp.entity.Account;

/**
 * Writting comment on the client is not required as it would be used by non-tech people.
 * @author parjun8840
 * If both the classes are present in the same package import is not required.
 * If classes are in same class then import is not required.
 * Import doesn't blots the code size ( unless and until we don't use it) as in case of C.
 * 
 * Compliation:
 * javac Account.java ==> Account.class [ Bytecode ]
 * javac AccountClient.jva ==> AccountClient.class [ Bytecode ]
 * 
 * Go to RUN ==> RUN AS ==> Java Project
 * 
 * Class loader loads .class files from "Secondary storage to "Primary". The search pattern it follows:
 * a) Loads from current folder
 * b) CLASSPATH [ environment variable] set CLASSPATH=c://mylib;d://storage etc
 * 
 * Functions of classloader:
 * a) findLoaderClass() ( If class is find not find here it returns boolean false, gives control to loadClass(). It checks only  in the RAM)
 * b) loadClass() (If it finds the handle goes to defineClass() else to findSystemClass().)
 * c) findSystemClass() (Like built-in String class is in rt.jar and it would be loaded. Pls don't use same name as built-in as it gets priority.)
 * d) defineClass() (Output of define class is not portable, the output of defineClass is make portable to the machine)
 */
public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account("SBI007"); // First time will be loaded by loadClass(). Compiled code always be fqdn- parjun8840.bankapp.entity.Account no import. 
		Account second = new Account();// Will be find by findLoaderClass(). New is for dynamically memory allocation and goes to heap.
	
		first.deposit(5000);// deposit(first, 5000)
		second.deposit(4500);
		
		System.out.println("First Account details");// System class is loaded
		System.out.println("Balance: "+ first.getBalance());
		
		System.out.println("Secont Account details");
		System.out.println("Balance: "+second.getBalance());
		
		System.out.println("First account number");
		System.out.println("Account Number: "+ first.getAccountNo());
		
		System.out.println("Scond account number");
		System.out.println("Account Number: "+ second.getAccountNo());
		

	}

}
