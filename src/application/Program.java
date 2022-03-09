package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;



public class Program {

	public static void main(String[] args) {

		Map<Product, Double> stock = new HashMap<>();

		Product prod1 = new Product("Tv", 900.0);
		Product prod2 = new Product("Notebook", 1200.0);
		Product prod3 = new Product("Tablet", 400.0);

		stock.put(prod1, 10000.0);
		stock.put(prod2, 20000.0);
		stock.put(prod3, 15000.0);

		Product ps = new Product("Tv", 900.0);

		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}
}