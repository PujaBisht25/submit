package Abstract_Factory_Pattern;

public class TeleElectronicOrder extends Order {

	public TeleElectronicOrder() {
		this.channel="Tele caller Agents Application";
		this.productType = "Electronic";
	}

	@Override
	public void processOrder() {
		
		System.out.println("The order is placed by :: "+ channel + " for :: " + productType);
		
	}

}
