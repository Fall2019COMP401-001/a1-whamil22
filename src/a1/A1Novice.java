package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int count = scan.nextInt();

		// Set up for loop to scan in name, item number, sum of items

		for (int i = 0; i < count; i++) {
			String fname = scan.next();
			String lname = scan.next();
			int itemnum = scan.nextInt();
			double sumofitems = 0;
			//String actualsum = "";

			// Set up for loop to scan in quantities for each item, item name,
			// and the price of each. Subsequently setting up total price

			for (int x = 0; x < itemnum; x++) {
				int itemquant = scan.nextInt();
				String itemname = scan.next();
				double price = scan.nextDouble();
				double tot = itemquant * price;

				// Establishing the sum and converting to string

				sumofitems += tot;

			}

			// Print statement

			System.out.println(fname.charAt(0) + ". " + lname + ": " + String.format("%.2f", sumofitems));
		}
		scan.close();
		}

}
