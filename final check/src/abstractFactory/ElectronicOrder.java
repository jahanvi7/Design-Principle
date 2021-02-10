package abstractFactory;

public class ElectronicOrder extends Order {

	@Override
	public Product processOrder(Channel channel, ProductType productType) {
		// TODO Auto-generated method stub
		return new Electronics(channel);
	}

}
