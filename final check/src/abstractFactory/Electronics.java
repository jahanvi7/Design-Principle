package abstractFactory;

public class Electronics extends Product {

	public Electronics(Channel channel) {
		super(channel, ProductType.Electronic_Products);
		// TODO Auto-generated constructor stub
		this.processOrder();
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Electronic Prosycts order is being processed");
	}

}
