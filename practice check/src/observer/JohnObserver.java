package observer;

public class JohnObserver implements INotificationObserver {

	private String name="";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JohnObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(name + " has recevied notification");
	}

}
