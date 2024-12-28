package Clonable;

import java.lang.Cloneable;
import java.util.Random;
import java.util.Arrays;

public class RndData implements Cloneable {
	public int[] ary;
	public int size;
	public long seed;
	
	public RndData(int size, long seed) {
		this.size = size;
		this.seed = seed;
		ary = new int[size];
		storeRndData(ary, seed);
	}
	
// Overriding clone() method by calling the clone method.
// We need to fix any reference variable, such as ary.
	@Override
	public Object clone() throws CloneNotSupportedException {
		RndData dup = (RndData) super.clone();
		dup.ary = new int[size];
		copy(dup.ary, ary);
		return dup;
	}
	
	public void copy(int[] dAry, int[] ary) {
		for (int i =0; i < ary.length; i++) {
			dAry[i] = ary[i];
		}
	}


	public void storeRndData(int[] ary, long seed) {
		Random gen = new Random(seed);
		for (int i = 0; i < ary.length; i++) {
			ary[i] = gen.nextInt(101);
		}
	}

	public void displayAry() {
		System.out.println("This object: " + this + "Array Address: " + ary);
		String buffer = Arrays.toString(ary);
		System.out.println(buffer + "\n");
	}
}