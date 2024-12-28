package MultiInterfaceClasses;

import java.util.Random;
import java.util.Arrays;

public interface DataInterface {
	
	// Create an array and store random numbers
	public default int[] storeRndNbrs(int size) {
		int[] ary = new int[size];
		Random rnd = new Random(-1);
		for (int i = 0; i < size; i++) {
			ary[i] = rnd.nextInt(101);
		}
		return ary;
	}
	
	// Display the array
	public default void displayAry(int[] ary) {
		String buffer = Arrays.toString(ary);
		System.out.println(buffer);
	}

}
