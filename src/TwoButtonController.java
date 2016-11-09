
public class TwoButtonController {
	private Command cmd1, cmd2;
	
	public TwoButtonController(Command cmd1, Command cmd2) {
		this.cmd1 = cmd1;
		this.cmd2 = cmd2;
	}
	
	public void button1Pressed() {
		cmd1.excute();
	}
	
	public void button2Pressed() {
		cmd2.excute();
	}
}
