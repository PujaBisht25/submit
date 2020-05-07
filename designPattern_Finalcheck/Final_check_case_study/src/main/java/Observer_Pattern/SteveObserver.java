package Observer_Pattern;

public class SteveObserver implements INotificationObserver {

	private String name;

	public SteveObserver() {
		this.name = "Steve";
	}

	public void OnBooking() {
		System.out.println("Admin [" + this.name +"]: " +" More than 100 Tickets have been booked");
	}

}
