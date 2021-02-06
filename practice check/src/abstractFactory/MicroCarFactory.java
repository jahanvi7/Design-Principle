package abstractFactory;

public class MicroCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType, Location location) {
		// TODO Auto-generated method stub
		return new MicroCar(location);
	}

}
