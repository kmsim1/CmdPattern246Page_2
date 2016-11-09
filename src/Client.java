
public class Client {
	public static void main(String[] args) {
		TV tv  = new TV();
		Car car = new Car();
		PowerCommand pc = new PowerCommand(tv);
		MuteCommand mc = new MuteCommand(tv);
		StartCommand sc = new StartCommand(car);
		
		TwoButtonController rc = new TwoButtonController(pc, pc);
		
		rc.button1Pressed();
		rc.button2Pressed();
		
		rc.button2Pressed();
		rc.button1Pressed();
	}
}
