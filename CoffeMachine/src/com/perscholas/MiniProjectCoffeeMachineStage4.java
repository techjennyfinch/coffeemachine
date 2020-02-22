package com.perscholas;

import java.util.Scanner;

//Author @ Jenny Finch
// Mini Project Coffee Machine
// Stage 4 &5
//Stages 1-3 are in MiniProjectCoffeeMachine.java

public class MiniProjectCoffeeMachineStage4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create opening choices to buy, fill, or take
		// Starting materials r = resource

	
	//	int [] inventory = new int [5];
		int [] inventory = {1200, 540, 120, 9, 550};
		// inventory order is water, milk, beans,cups, cash
		int rwater = inventory [0]; // ml
		int rmilk = inventory [1]; // ml
		int rbeans = inventory [2]; // g coffee beans
		int rcups = inventory [3]; // disposable cups
		int cash = inventory [4]; // $$	
		
//		int rwater = 1200; // ml
//		int rmilk = 540; // ml
//		int rbeans = 120; // g coffee beans
//		int rcups = 9; // disposable cups
//		int cash = 550; // $$
		// Starting materials
	
		boolean shutdown = false; 
		Scanner input = new Scanner(System.in);	
	
		while (shutdown == false) {
		System.out.println("Write the word for what you would like to do.");
		System.out.println(
				"buy -Buy coffee drink; fill - fill machine; take - withdraw machine cash; \n remaining -System inventory; exit -Exit program. ");
		
//		while (shutdown != true) {
			
		String action = input.next();
	//	String action = input.nextLine();
		System.out.println();

		switch (action) {
		case "buy": // same issue with buy not sure how to return all the values to main method to
					// update inventory.
			System.out.println("You choose to buy.");
			inventory = buyCoffee (rwater, rmilk, rbeans, rcups, cash);
			rwater =inventory [0]; //this has to be updated to update inventory.
			rmilk = inventory [1];
			rbeans = inventory [2];
			rcups = inventory [3];
			cash = inventory [4];
//			System.out.println("What do you want to buy? \n1- espresso, 2- latte, 3- cappuccino: ");
//			int coffeeType = input.nextInt();
//
//			switch (coffeeType) {
//			case 1: // espresso
//				System.out.println("Making Espresso.");
//				rwater -= 250;
//				rbeans -= 16;
//				rcups -= 1;
//				cash += 4;
//				break;
//
//			case 2: // latte
//				System.out.println("Making Latte.");
//				rwater -= 350;
//				rmilk -= 75;
//				rbeans -= 20;
//				rcups -= 1;
//				cash += 7;
//				break;
//
//			case 3: // cappuccino
//				System.out.println("Making cappuccino.");
//				rwater -= 200;
//				rmilk -= 100;
//				rbeans -= 12;
//				rcups -= 1;
//				cash += 6;
//				break;
//
//			default:
//				System.out.println("Unknown coffee type");
//				break;
//			}

			break;

		case "fill":
			System.out.println("You choose to fill the machine.");
			// Couldn't get the method to return the data.
			inventory = machineFill(rwater, rmilk, rbeans, rcups, cash);
			rwater =inventory [0]; //this has to be updated to update inventory.
			rmilk = inventory [1];
			rbeans = inventory [2];
			rcups = inventory [3];
			// rwater =
//			System.out.println("How much water do you want to add to the machine?");
//			rwater += input.nextInt();
//			System.out.println("How much milk do you want to add to the machine?");
//			rmilk += input.nextInt();
//			System.out.println("How much coffee beans do you want to add to the machine?");
//			rbeans += input.nextInt();
//			System.out.println("How many cups do you want to add to the machine?");
//			rcups += input.nextInt();
			break;

		case "take":
			System.out.println("You choose to withdraw cash.");
			cash = takeCash(cash);

			break;

		case "remaining":
			// print machine state using a method
			machineState(rwater, rmilk, rbeans, rcups, cash);
			break;

		case "exit":
			System.out.println("Shutting down.");
			shutdown = true; 
		}


		//System.out.println("test");
	
		System.out.println("Status Report ---------");
		System.out.println("The coffee machine has:");
		System.out.println(rwater + " ml of water");
		System.out.println(rmilk + " ml of milk");
		System.out.println(rbeans + " g of beans");
		System.out.println(rcups + "  disposable cups");
		System.out.println("$" + cash + " cash in receipts.");
		System.out.println("End Report _________________");
		//to run the machine state anyway for testing.
		}

		System.out.println();
	
		
	
	}

	private static int[] buyCoffee (int rwater, int rmilk, int rbeans, int rcups, int cash) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What do you want to buy? \n1- espresso, 2- latte, 3- cappuccino, 4- back : ");
		int coffeeType = in.nextInt();
		
		if (rcups==0)
			System.out.println("Sorry, not enough cups.");
		// reporting cups here since it is needed for all coffees. 

		switch (coffeeType) {
		case 1: // espresso
			
			if (rwater<250) 
				System.out.println("Sorry, not enough water.");
			if (rbeans<16)
				System.out.println("Sorry, not enough coffee beans.");
			if (rwater>=250 && rbeans>=16 && rcups>0)
			{
			System.out.println("Making Espresso.");
			rwater -= 250;
			rbeans -= 16;
			rcups -= 1;
			cash += 4;
			}
			break;

		case 2: // latte
			if (rwater<350) 
				System.out.println("Sorry, not enough water.");
			if (rmilk<75)
				System.out.println("Sorry, not enough milk.");
			if (rbeans<20)
				System.out.println("Sorry, not enough coffee beans.");
			if (rwater>=350 && rmilk >=75 && rbeans>=20 && rcups>0)
			{
				System.out.println("Making Latte.");
			rwater -= 350;
			rmilk -= 75;
			rbeans -= 20;
			rcups -= 1;
			cash += 7;
			}
			break;

		case 3: // cappuccino
			if (rwater<200) 
				System.out.println("Sorry, not enough water.");
			if (rmilk<100)
				System.out.println("Sorry, not enough milk.");
			if (rbeans<12)
				System.out.println("Sorry, not enough coffee beans.");
			if (rwater>=200 && rmilk >=100 && rbeans>=12 && rcups>0)
			{
				System.out.println("Making cappuccino.");
			rwater -= 200;
			rmilk -= 100;
			rbeans -= 12;
			rcups -= 1;
			cash += 6;
			}
			break;
		
		case 4:  //back
			break;

		default:
			System.out.println("Unknown coffee type");
			break;
		}
		
	//	in.close();
		int[] inventory = { rwater, rmilk, rbeans, rcups, cash };
		return inventory; // this line doesn't work can only get 1 to return
		
	}

	// method to fill machine

	public static int[] machineFill(int rwater, int rmilk, int rbeans, int rcups, int cash) {
		// This method is not passing back the fill info. not sure how to resolve. One
		// possible suggestion is an array.
		Scanner in = new Scanner(System.in);
		System.out.println("How much water do you want to add to the machine?");
		rwater += in.nextInt();
		System.out.println("How much milk do you want to add to the machine?");
		rmilk += in.nextInt();
		System.out.println("How much coffee beans do you want to add to the machine?");
		rbeans += in.nextInt();
		System.out.println("How many cups do you want to add to the machine?");
		rcups += in.nextInt();

		System.out.println("Right now we've got water ml = " + rwater + " and milk " + rmilk);
//		in.close();
		// this is to show the bad info passing.
		int[] inventory = { rwater, rmilk, rbeans, rcups, cash };
		return inventory; // this line doesn't work can only get 1 to return
	}

	// method to withdraw cash

	public static int takeCash(int cash) {

		System.out.println("Withdrawing $" + cash);
		cash = 0;
		return cash;

	}

	// method to print machine state
	public static void machineState(int rwater, int rmilk, int rbeans, int rcups, int cash) {

		System.out.println("Status Report ---------");
		System.out.println("The coffee machine has:");
		System.out.println(rwater + " ml of water");
		System.out.println(rmilk + " ml of milk");
		System.out.println(rbeans + " g of beans");
		System.out.println(rcups + "  disposable cups");
		System.out.println("$" + cash + " cash in receipts.");

	}

}
