package Abstract_Factory_Pattern;

public class TeleFurnitureOrder extends Order {

	public TeleFurnitureOrder() {
		this.channel = "Tele caller Agents Application";
		this.productType = "Furniture";
	}

	@Override
	public void processOrder() {
		System.out.println("The order is placed by :: " + channel + " for :: " + productType);
	}

}
