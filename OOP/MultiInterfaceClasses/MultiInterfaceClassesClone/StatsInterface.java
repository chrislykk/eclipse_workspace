package MultiInterfaceClassesClone;

public interface StatsInterface {
	
	public default int findMax(int[] ary) {
		int max = ary[0];
		for(int i = 0; i < ary.length; i++) {
			if(ary[i] > max) {
				max = ary[i];
			}
		}
		return max;
	}
	
	public default int findMin(int[] ary) {
		int min = ary[0];
		for(int i = 0; i < ary.length; i++) {
			if(ary[i] < min) {
				min = ary[i];
			}
		}
		return min;
	}
	
	public void displayStats(int[] ary);

}
