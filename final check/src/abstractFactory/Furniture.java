package abstractFactory;

public class Furniture extends Product {

	public Furniture(Channel channel) {
		super(channel, ProductType.Furniture);
		this.processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Furniture order is being processed");
	}

}
