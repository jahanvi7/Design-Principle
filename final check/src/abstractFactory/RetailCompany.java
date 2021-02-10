package abstractFactory;

public class RetailCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order order = new ElectronicOrder();
		System.out.println(order.processOrder(Channel.E_Commerce, ProductType.Toys));
		order = new ToysOrder();
		System.out.println(order.processOrder(Channel.Tele_Caller, ProductType.Furniture));
		order = new FurnitureOrder();
		System.out.println(order.processOrder(Channel.E_Commerce, ProductType.Electronic_Products));
	}

}
