package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int menuSelection = 0;
		double quantity;
	

		do {
			try {
				promptSelectionMenu();
				menuSelection = myScanner.nextInt();
				if (menuSelection == 4)
					break;
				if (menuSelection < 1 | menuSelection > 4)
				{
					System.out.println("Please enter a number 1-4");
					continue;
				}
				promptQuantity();
				quantity = myScanner.nextDouble();
				collectInput(menuSelection, quantity);
			} catch (InputMismatchException e) {
				System.out.println("Eror: Please enter a valid option");

			}
			myScanner.nextLine();

		} while (menuSelection != 4);

	}

	public static void promptSelectionMenu() {
		System.out.printf(
				"\nPlease select an option: \n1. Cups to Teaspoons\n2. Miles to Kilometers\n3. US Gallons to Imperial Gallons\n4. Quit\n");
	}

	public static void promptQuantity() {
		System.out.println("Enter the quantity: ");
	}

	public static void collectInput(int selection, double quantity) {

		switch (selection) {
		case 1:
			convertCupsToTeaspoons(quantity);
			break;
		case 2:
			convertMilesToKilometers(quantity);
			break;
		case 3:
			convertGallonsToImperialGallons(quantity);

		}
	}

	public static void convertCupsToTeaspoons(double cups) {
		System.out.println(cups + "c = " + cups * 48 + "tsp");
	}

	public static void convertMilesToKilometers(double miles) {
		System.out.println(miles + "mi = " + miles * 1.609344 + "km");
	}

	public static void convertGallonsToImperialGallons(double gallons) {
		System.out.println(gallons + "gal = " + gallons * 0.83267384 + "imp");
	}
}
