package com.perscholas;

import java.util.Scanner;

public class MiniProjectCoffeeMachine {
	
	//Author @ Jenny Finch
	// MiniProject
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Stage 1
		
//		System.out.println("Starting to make a coffee");
//		System.out.println("Grinding coffee beans");
//		System.out.println("Boiling water");
//		System.out.println("Mixing boiled water with crushed coffee beans");
//		System.out.println("Pouring coffee into the cup");
//		System.out.println("Pouring some milk into the cup");
//		System.out.println("Coffee is ready!");

	
		// declaring the variables. Water and milk are ml, coffee beans is g, coffee cup is 1 unit.
		// Stage 2
		
		
		int waterpercup = 200;
		int milkpercup = 50;
		int beanspercup = 15;   //coffee beans
		int cupsneeded = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		/*
		 * // Stage 2
		 * System.out.println("How many cups of coffee do you need?"); 
		 * int cupsNeeded = input.nextInt();
		 * 
		 * System.out.println("For " + cupsNeeded + " cups of coffee you will need:");
		 * System.out.println((cupsNeeded* waterpercup) + "ml of water");
		 * System.out.println((cupsNeeded* milkpercup) + "ml of milk");
		 * System.out.println((cupsNeeded* beanspercup) + "g of coffee beans");
		 */
		
		// Stage 3
		// r= resource
		
		System.out.println("Write how many ml of water the coffee machine has:");
		int rwater = input.nextInt();
		System.out.println("Write how many ml of milk the coffee machine has:");
		int rmilk = input.nextInt();
		System.out.println("Write how many grams of coffee beans the coffee machine has:");
		int rbeans = input.nextInt();
		System.out.println("Write how many cups of coffee you will need:");
		cupsneeded = input.nextInt();
		
	
//			if ((rwater>= (cupsneeded *waterpercup)) && (rmilk >= (cupsneeded * milkpercup))&& (rbeans >= (cupsneeded*beanspercup ))) {
//					System.out.println("Yes, I can make that amount of coffee.");
//			}
//			else {
//				System.out.println("You are going to have to go to the store.");
//			}
//	
			
		int possiblecups = rwater/waterpercup; 
		 if (rmilk/milkpercup < possiblecups)
			 possiblecups = rmilk/milkpercup;
		 if (rbeans/beanspercup < possiblecups)
			 possiblecups = rbeans/beanspercup;
		 
		 if (cupsneeded<possiblecups) {
			 System.out.println("Yes, I can make that amount of coffee (and even " + (possiblecups - cupsneeded) + " more than that.)" );
		 }
		 else if (cupsneeded == possiblecups) {
			 System.out.println("Yes, I can make that amount of coffee.");
		 }
		 else {
		 System.out.println("No, I can only make " + possiblecups + " cup(s) of coffee.");
		 }

input.close();
}
}