package Abstract_Factory_Pattern;

public class EToyOrder extends Order {

	public EToyOrder() {
		this.channel = "E-commerce website";
		this.productType = "Toy";
	}

	@Override
	public void processOrder() {
		System.out.println("The order is placed by :: " + channel + " for :: " + productType);
	}
}