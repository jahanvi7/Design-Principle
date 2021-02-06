package observer;

public class SteveObserver implements INotificationObserver {

	private String name = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SteveObserver(String name) {
		super();
		this.name = name;
	}

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(name + " has received notificaton");
	}

}
