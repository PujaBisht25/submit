package Abstract_Factory_Pattern;

public class TeleToysOrder extends Order {

	public TeleToysOrder() {
		this.channel = "Tele caller Agents Application";
		this.productType = "Toys";
	}

	@Override
	public void processOrder() {
		System.out.println("The order is placed by :: " + channel + " for :: " + productType);
	}

}
