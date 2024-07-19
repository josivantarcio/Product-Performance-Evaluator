package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> products = new ArrayList<>();

		String path = "/home/josivan/eclipse-workspace/productperformance/produtos.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
	
				String[] brockLine = line.split(",");
				String name = brockLine[0];
				Double price = Double.parseDouble(brockLine[1]);
				products.add(new Product(name, price));

				line = br.readLine();
			}

			for (Product prod : products) {
				System.out.println(prod);
			}
			
			
			System.out.println();
			System.out.println("Most expensive is: ");
			System.out.println(CalculationService.max(products));
			

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
