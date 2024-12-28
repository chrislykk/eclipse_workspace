package ThrottlePr;

public class MainClass {
	
	public static void main(String[] args) {
		Throttle throttle = new Throttle(3);
		
		while (throttle.is_on()) {
			
			System.out.println("The  throttle is on." + " flow = " + throttle.flow());
			throttle.shift(-1);
		}
		
		System.out.println("The throttle is off.");
	}

}