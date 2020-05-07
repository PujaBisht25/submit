package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers = new ArrayList<>();

	public void AddSubscriber(INotificationObserver observer) {
		observers.add(observer);

	}

	public void RemoveSubscriber(INotificationObserver observer) {
		observers.remove(observer);
	}

	public void NotifySubscriber() {

		for (INotificationObserver observer : observers) {
			observer.OnBooking();
		}

	}

}
