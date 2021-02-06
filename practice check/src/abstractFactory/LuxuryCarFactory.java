package abstractFactory;

public class LuxuryCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType, Location location) {
		// TODO Auto-generated method stub
		return new LuxuryCar(location);
	}

}
