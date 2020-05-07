package Abstract_Factory_Pattern;

public abstract class Order {

	protected String channel;
	protected String productType;

	
	public abstract void processOrder();
}
