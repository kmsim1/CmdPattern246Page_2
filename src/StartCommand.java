
public class StartCommand implements Command {
	private Car car;
	
	public StartCommand(Car car) {
		this.car = car;
	}

	@Override
	public void excute() {
		car.start();

	}

}
