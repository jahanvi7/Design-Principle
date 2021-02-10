package abstractFactory;

public class ToysOrder extends Order {

	@Override
	public Product processOrder(Channel channel, ProductType productType) {
		// TODO Auto-generated method stub
		return new Toys(channel);
	}

}
