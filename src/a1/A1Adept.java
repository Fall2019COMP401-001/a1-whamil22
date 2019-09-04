package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Set up scanner for amount of store items then set up arrays for
		// their corresponding item names and their prices
		
		int storeitems = scan.nextInt();
		String[] itemnames = new String[storeitems];
		double[] itemprices = new double [storeitems];
		
		// For loop set up to scan in item names and prices, then they are placed
		// into the arrays to fill out the previously established arrays
		
		for (int i = 0; i < storeitems; i++) {
			String nameofitem = scan.next();
			double itemprice = scan.nextDouble();
			
			itemnames[i] = nameofitem;
			itemprices[i] = itemprice;
		}
		
		// Then doing the same as part one of the store items, just for customers
		
		int customernumb = scan.nextInt();
		String[] totalcustomers = new String[customernumb];
		double[] itemsbought = new double[customernumb];
		
		// Then do for loop to scan names and items into arrays like above
		
		for (int j = 0; j < customernumb; j++) {
			String fname = scan.next();
			String lname = scan.next();
			int newitems = scan.nextInt();
			
			totalcustomers[i] = fname + " " + lname;
			
			// For loop to scan in items and quantities
			
			for (int k = 0; k < newitems; k++) {
				int quant = scan.nextInt();
				String nameofitem = scan.next();
				
				itemsbought[i] += convertNameToPrice(nameofitem, itemnames, itemprices) * quant;
			}
		}
		
		// Establish the maximum method reference in order to discern biggest spender
		double maximum = max(itemsbought);
		String numbermax = String.format("%.2f", maximum);
		String maximumname = matchNameToSpender(maximum, itemsbought, totalcustomers);
		System.out.println("Biggest: " + maximumname + " (" + numbermax + ")");
		
		// Establish the minimum reference in order to discern smallest spender
		double minimum = min(itemsbought);
		String numbermin = String.format("%.2f", minimum);
		String minimumname = matchNameToSpender(minimum, itemsbought, totalcustomers);
		System.out.println("Smallest: " + minimumname + " (" + numbermin + ")");
		
		// Establish the average reference in order to discern the average amount spent
		double average = average(itemsbought);
		String averagebought = String.format("%.2f", average);
		System.out.println("Average: " + averagebought);
	}
	// Set up for convertNameToPrice method
	public static double convertNameToPrice(String name, String[] names, double[] prices) {
		for (int x = 0; x < names.length; x++) {
			if (name.equals(names[i])) {
				return prices[i];
			}
		}
		
		return 0;
	}
	// Set up matchNameToSpender method 
	public static String matchNameToSpender(double max, double[] prices, String[] names) {
		for (int y = 0; y < prices.length; y++) {
			double price = prices[i];
			
			if (max == price) {
				return names[i];
			}
		}
		
		return null;
	}
	// Set up max method
	public static double max(double[] prices) {
		double biggest = 0;
		
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > biggest) {
				biggest = prices[i];
			}
		}
		
		return biggest
	}
	
	public static double min(double[] prices) {
		double smallest = prices[0];
		
		for (int z = 0; z < prices.length; z++) {
			if (prices[z] < smallest) {
				smallest = prices[i];
			}
		}
		
		return smallest;
	}
	
	public static double average(double[] prices) {
		double avg = 0;
		for (n = 0; n < prices.length; n++) {
			avg += prices[i];
		}
		
		avg /= prices.length;
		return avg;
	}
}
