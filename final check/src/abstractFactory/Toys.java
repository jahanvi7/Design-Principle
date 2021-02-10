package abstractFactory;

public class Toys extends Product {

	public Toys(Channel channel) {
		super(channel, ProductType.Toys);
		this.processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Toys order is being processed");
	}

}

