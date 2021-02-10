package observerPattern;

import java.util.ArrayList;
import java.util.List;


public class NotificationService implements INotificationService {

	private List<INotificationObserver> subscribers = new ArrayList<>();
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		subscribers.add(observer);
		System.out.println("Subscriber Added");
		for(INotificationObserver o : subscribers) {
			System.out.println(o.getName());
		}
	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		subscribers.remove(observer);
		System.out.println("Subscriber Removed");
		for(INotificationObserver o : subscribers) {
			System.out.println(o.getName());
		}
	}

	@Override
	public void notifySubscriber(int ticketCount, INotificationObserver observer) {
		// TODO Auto-generated method stub
		if(ticketCount > 100) {
				observer.moreThan100Tickets(observer.getName());
		}
	}

}
