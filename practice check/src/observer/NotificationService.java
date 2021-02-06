package observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	public List<INotificationObserver> observerList = new ArrayList<>();;
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
		System.out.println("Subscriber Added");
		for(INotificationObserver o : observerList) {
			System.out.println(o.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
		System.out.println("Subscriber Removed");
		for(INotificationObserver o : observerList) {
			System.out.println(o.getName());
		}
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver o : observerList) {
			o.OnServerDown();
		}
	}

}
