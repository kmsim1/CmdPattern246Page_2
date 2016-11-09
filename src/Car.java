
public class Car {
	private boolean startOn = false;
	
	public void start() {
		startOn =! startOn;
		
		if(startOn)
			System.out.println("Engine Start");
		else
			System.out.println("Engine Off");
			
	}
}
