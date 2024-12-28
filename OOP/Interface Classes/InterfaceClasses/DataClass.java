package InterfaceClasses;

import java.util.Arrays;

public class DataClass implements DataInterface {
	int[] ary;
	
	DataClass(int size) {
		ary = new int[size];
	}
	
	public void initializeAry(int nbr) {
		for (int i = 0; i < ary.length; i++) {
			ary[i] = nbr;
		}
	}
	
	public void displayData() {
		String buffer = Arrays.toString(ary);
		System.out.println(buffer);
	}

}
