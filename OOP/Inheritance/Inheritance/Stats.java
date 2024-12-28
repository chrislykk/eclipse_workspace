package Inheritance;

public class Stats extends Data {
	public int sum;
	
	public Stats() {
	}
	
	public Stats(int size, int range) {
		// Pass the data to the Data Constructor
		super (size, range);
	}
	
	// Calculate the sum of the array
	public int calculateSum() {
		sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
	return sum;
	}
	
	// Display the array and statistics
	public void displayData() {
		super.displayData();
		System.out.println("sum = " + sum);
	}
	

}
