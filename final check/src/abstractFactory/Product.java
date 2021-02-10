package abstractFactory;

enum ProductType {
	Toys, Electronic_Products, Furniture
}

enum Channel {
	E_Commerce, Tele_Caller
}

public abstract class Product {

	private Channel channel;
	private ProductType productType;

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Product(Channel channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [channel=" + channel + ", productType=" + productType + "]";
	}
	
	public abstract void processOrder();
}
