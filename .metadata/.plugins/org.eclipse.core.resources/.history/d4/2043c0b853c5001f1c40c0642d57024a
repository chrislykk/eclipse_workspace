package MultiInterfaceClassesClone;

import java.util.Arrays;

public class Data implements DataInterface, StatsInterface, Cloneable {
	public int[] ary;
	public int max;
	public int min;
	
	public Data(int size) {
		ary= storeRndNbrs(size);
		max = findMax(ary);
		min = findMin(ary);
		
	}
	
	public Data duplicate(Data d) {
		Data dup;
		try {
			dup = (Data) d.clone();
			dup.ary = new int[dup.ary.length];
			for(int i = 0; i < dup.ary.length; i++) {
				dup.ary[i] = d.ary[i];
			}
		} catch (CloneNotSupportedException ex) {
			System.out.println("No");
			return null;
		}
		return dup;
	}
	
	public void displayStats(int[] ary) {
		System.out.println("max = " + max + " min = " + min + " \n");
	}
	
	public void sortData(int[] ary) {
		Arrays.sort(ary);
	}

}
