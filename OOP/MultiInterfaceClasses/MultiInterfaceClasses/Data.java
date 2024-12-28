package MultiInterfaceClasses;

import java.util.Arrays;

public class Data implements DataInterface, StatsInterface {
	public int[] ary;
	public int max;
	public int min;
	
	public Data(int size) {
		ary= storeRndNbrs(size);
		max = findMax(ary);
		min = findMin(ary);
		
	}
	
	public void displayStats(int[] ary) {
		System.out.println("max = " + max + " min = " + min + " \n");
	}
	
	public void sortData(int[] ary) {
		Arrays.sort(ary);
	}

}
