package com.mt;

import com.mt.abstracts.AbstractRegression;
import com.mt.abstracts.ArithmeticRegression;
import com.mt.interfaces.Item;

/**
 * Hello world!
 */
public class InheritanceApp {

	public static void main(String[] args) {

		System.out.println("================= Interfaces");
		Item item = new Item("Book", 4);
		item.sell();
		item.transfer();

		System.out.println("================= Abstracts");
		AbstractRegression abstractRegression = new ArithmeticRegression();
		abstractRegression.printRegression(10);
	}
}
