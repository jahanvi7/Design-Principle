package observerPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotificationObserver john = new JohnObserver("John");
		INotificationObserver steve = new JohnObserver("Steve");
		
		NotificationService notificationService = new NotificationService();
		notificationService.addSubscriber(steve);
		notificationService.addSubscriber(john);
		notificationService.notifySubscriber(150, steve);
		notificationService.notifySubscriber(50, john);
		notificationService.removeSubscriber(steve);
	}

}
