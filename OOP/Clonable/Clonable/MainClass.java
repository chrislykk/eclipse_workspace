package Clonable;

public class MainClass {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// Create object with array size 15.
		// Use seed -1 for random generator
		RndData rd1 = new RndData(15, -1);
		rd1.displayAry();
		
		// Create 2nd object with array size 10.
		// Use seed -2 for random generator
		RndData rd2 = new RndData(10, -2);
		rd2.displayAry();
		
		// Clone rd1. Modify the array by creating a deep copy.
		RndData replica = (RndData)rd1.clone();
		replica.displayAry();
	}

}
