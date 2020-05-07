package Abstract_Factory_Pattern;

import java.util.Scanner;

public class Abstract_Factory_Pattern_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Enter the means you want to order through:[Tele Caller Agents Application/E-commerce website]: ");
		String channel = sc.nextLine();
		System.out.println("Enter the products you would like to purchase[Electronic/Toys/Furniture]:");
		String productType = sc.nextLine();

		AbstractFactory factory = FactoryProducer.getFactory(channel);
		Order order = factory.getOrder(productType);
		order.processOrder();
		
		System.out.println("\n");

		System.out.println(
				"Enter the means you want to order through:[Tele Caller Agents Application/E-commerce website]: ");
		String channel2 = sc.nextLine();

		System.out.println("Enter the products you would like to purchase[Electronic/Toys/Furniture]:");
		String productType2 = sc.nextLine();

		AbstractFactory factory2 = FactoryProducer.getFactory(channel2);
		Order order2 = factory2.getOrder(productType2);
		order2.processOrder();

		sc.close();

	}

}
