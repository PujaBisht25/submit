package Abstract_Factory_Pattern;

public class EElectronicOrder extends Order {

	public EElectronicOrder() {
		this.channel = "E-commerce website";
		this.productType = "Electronic";
	}

	@Override
	public void processOrder() {
		System.out.println("The order is placed by :: " + channel + " for :: " + productType);
	}

}
