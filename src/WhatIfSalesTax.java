import java.util.Scanner;

public class WhatIfSalesTax {

	public static void main(String[] args) {
		
		System.out.println("Enter Customer number");
		Scanner keyboard = new Scanner(System.in);

		String custNumber, name, taxCode;
		double salesAmount, taxPercent, salesTax, total;
		taxPercent = 0;

		custNumber = keyboard.next();
		System.out.println("Enter name");
		name = keyboard.next();
		System.out.println("Enter sales amount");
		salesAmount = keyboard.nextDouble();

		System.out.println("Enter Tax Code");
		taxCode = keyboard.next();

		if (taxCode.equals("NRM"))
			taxPercent = .06;
		else if (taxCode.equals("NPF"))
			taxPercent = 0;
		else if (taxCode.equals("BIZ"))
			taxPercent = .045;

		salesTax = salesAmount * taxPercent;
		total = salesAmount + salesTax;

		System.out.println(custNumber + " " + name + " " + salesAmount + " " + taxCode);
		System.out.println("Sales Tax = " + salesTax + " " + "Total = " + total);

		keyboard.close();

	}

}
