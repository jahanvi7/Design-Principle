package observerPattern;

public interface INotificationObserver {
	
	String name = "";

	public void moreThan100Tickets(String name);
	
	public String getName();
}
