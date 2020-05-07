package Abstract_Factory_Pattern;

public class TeleOrderFactory extends AbstractFactory {

	@Override
	Order getOrder(String productType) {
		if (productType.equalsIgnoreCase("Electronic")) {
			return new TeleElectronicOrder();
		} else if (productType.equalsIgnoreCase("Furniture")) {
			return new TeleFurnitureOrder();
		} else {
			return new TeleToysOrder();
		}
	}

}
