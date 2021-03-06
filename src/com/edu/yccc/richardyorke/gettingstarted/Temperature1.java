package com.edu.yccc.richardyorke.gettingstarted;

/**
 * @author Richard Yorke
 *
 */

//Reads a series of high temperatures and reports the average.

import java.util.*;

public class Temperature1 {

	/**
	 * @author Richard Yorke
	 * Spring 2018 semester
	 * CIS 174- Algorithms in Programming
	 * Instructor: Michael Bourgeious* @param args
	 */
	
	// In this example from the book, I am using a Scanner to display arrays.
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many days' temperatures?  ");
		int numDays = console.nextInt();
		int sum = 0;
		for (int i = 1; i<numDays; i++ ) {
			System.out.print("Day " + i + "'s high temp: ");
			int next = console.nextInt();
			sum += next;
		}

		double average = (double) sum / numDays;
		System.out.println();

		System.out.println("Average = " + average);


	}

}
