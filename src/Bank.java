import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = 0;
		double[] accountBalances = new double[250];
		String[] accountNames = new String[250];
		for(;true;) {
		System.out.println("==========================");
		System.out.println("WELCOME TO DEEKU'S BANKING");
		System.out.println("==========================");
		System.out.println("Bank Admin Menu");
		System.out.println("Please Enter a Menu option");
		System.out.println("(1): Add Customer to Bank");
		System.out.println("(2): Change Customer Name");
		System.out.println("(3): Check Account Balance");
		System.out.println("(4): Modify Account Balance");
		System.out.println("(5): Summary of All Accounts");
		System.out.println("(-1): Quit");
		
		int deek = input.nextInt();
		if (deek == 1) {
			System.out.println("Deeku's Banking Menu");
			System.out.println("Please Enter Account Balance");
			double balance = input.nextDouble();
			accountBalances[size] = balance;
			input.nextLine();
			System.out.println("Please Enter Account Holder Name:");
			String name = input.nextLine();
			accountNames[size] = name;
			System.out.println("Coustomer Id is: " +size);
			size = size + 1;
		}
		else if(deek ==2) {
			System.out.println("Deeku's Bank Customer Name Changing Menu");
			System.out.println("Please enter Customer ID to change their Name:");
			int index = input.nextInt();
			System.out.println("What's the customer new name:");
			input.nextLine();
			accountNames[index] = input.nextLine();
		}
		else if(deek ==3) {
			System.out.println("Deeku's Bank Check Account Balance Menu");
			System.out.println("Please enter Customer ID to check bank balance:");
			int index = input.nextInt();
			double balance = accountBalances[index];
			System.out.println("This customer has $" + balance + "in their account");
		}
		else if(deek ==4) {
			System.out.println("Deeku's Bank Modify Account Balance Menu");
			System.out.println("Please enter Customer ID to Modify bank balance:");
			int index = input.nextInt();
			accountBalances[index] = input.nextDouble();
		}
		else if(deek ==5) {
			System.out.println("Deeku's Banking Summary of All Accounts");
			double total = 0;
			for (int i = 0; i<size;i++) {
				total = total + accountBalances[i];
				System.out.println(accountNames[i] + "has $" + accountBalances[i] + "in bank");
			}
			System.out.println("In total, there is $" + total + "in the bank");
		}
		else if(deek == -1) {
			System.exit(-1);
		}
		else {
			System.out.println("Invalid Input!");
		}
	}
	}

}
