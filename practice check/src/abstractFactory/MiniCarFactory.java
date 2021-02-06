
package abstractFactory;

public class MiniCarFactory extends CarFactory {

	@Override
	public Car buildCar(CarType carType, Location location) {
		// TODO Auto-generated method stub
		return new MiniCar(location);
	}

}
