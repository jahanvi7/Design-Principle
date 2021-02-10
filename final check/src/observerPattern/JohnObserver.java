package observerPattern;

public class JohnObserver implements INotificationObserver {

	private String name = "";

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public void moreThan100Tickets(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " has booked more than 100 tickets");
	}

	public JohnObserver(String name) {
		super();
		this.name = name;
	}


}
