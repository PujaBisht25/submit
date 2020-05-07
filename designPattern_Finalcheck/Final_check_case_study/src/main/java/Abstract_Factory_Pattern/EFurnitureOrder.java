package Abstract_Factory_Pattern;

public class EFurnitureOrder extends Order {

	public EFurnitureOrder() {
		this.channel = "E-commerce website";
		this.productType = "Furniture";
	}

	@Override
	public void processOrder() {
		System.out.println("The order is placed by :: " + channel + " for :: " + productType);
	}

}
