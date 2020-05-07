package Abstract_Factory_Pattern;

public class EOrderFactory extends AbstractFactory {

	@Override
	Order getOrder(String productType) {
		if (productType.equalsIgnoreCase("Electronic")) {
			return new EElectronicOrder();
		} else if (productType.equalsIgnoreCase("Furniture")) {
			return new EFurnitureOrder();
		} else {
			return new EToyOrder();
		}
	}

}
