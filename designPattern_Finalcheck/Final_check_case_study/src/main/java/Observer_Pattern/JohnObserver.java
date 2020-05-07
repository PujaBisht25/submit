package Observer_Pattern;

public class JohnObserver implements INotificationObserver {

	private String name;

	public JohnObserver() {
		this.name = "John";
	}

	public void OnBooking() {
		System.out.println("Admin [" + this.name +"]: " +" More than 100 Tickets have been booked");
		
	}

}
