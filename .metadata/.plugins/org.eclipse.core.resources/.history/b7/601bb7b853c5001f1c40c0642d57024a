package Inheritance;

import java.util.Arrays;
import java.util.Random;

public class Data {
	public int[] ary;
	public int size;
	public int range;
	
	// Constructors
	public Data() {
	}
	
	public Data(int size, int range) {
		ary = new int[size];
		storeRandomData(range);
	}
	
	// Store random data in the array
	public void storeRandomData(int range) {
		Random rndGen = new Random(-1);
		for (int i = 0; i < ary.length; i++) {
			ary[i] = rndGen.nextInt(101);
		}
	}
	
	// Display the data stored in the array
	public void displayData() {
		String buffer = Arrays.toString(ary);
		System.out.println(buffer);
	}

}
