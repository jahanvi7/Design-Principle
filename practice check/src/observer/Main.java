package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SteveObserver steve = new SteveObserver("Steve");
		JohnObserver john = new JohnObserver("John");
		
		INotificationService notificationService = new NotificationService(); 
		notificationService.addSubscriber(john);
		notificationService.addSubscriber(steve);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(john);
	}

}
