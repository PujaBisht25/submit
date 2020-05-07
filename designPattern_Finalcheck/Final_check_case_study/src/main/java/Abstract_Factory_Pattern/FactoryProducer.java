package Abstract_Factory_Pattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String channel) {
		if (channel.equalsIgnoreCase("Tele caller Agents Application")) {
			return new TeleOrderFactory();
		}

		else {
			return new EOrderFactory();
		}
	}

}
