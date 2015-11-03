package bucky;

import java.util.Scanner;

public class Addition {

	public static void main(String args[]) {

		// String welcome = "Enter a message";
		//
		// System.out.println(welcome);
		// Scanner bucky = new Scanner(System.in);
		// System.out.println(bucky.nextLine());

		Scanner fiddy = new Scanner(System.in);
		double fnum, snum, answer;

		System.out.println("Enter first number: ");
		fnum = fiddy.nextDouble();
		System.out.println("Enter second number: ");
		snum = fiddy.nextDouble();
		answer = fnum + snum;
		System.out.println("This is the answer: " + answer);

	}
}
