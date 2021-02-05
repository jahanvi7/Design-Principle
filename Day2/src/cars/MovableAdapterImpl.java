package cars;

public class MovableAdapterImpl implements MovableAdapter {
	private Movable luxuryCars;

	// standard constructors
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}
	
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUsdToEuro(luxuryCars.getPrice());
	}
	
	private double convertUsdToEuro(double usd) {
		return usd * 0.84;
	}
}