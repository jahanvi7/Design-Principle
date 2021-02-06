package observer;

public interface INotificationObserver {

	public String name = "";
	
	public void OnServerDown();
	
	public String getName();
}
