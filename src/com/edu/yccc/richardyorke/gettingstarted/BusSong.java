/**
 * 
 */
package com.edu.yccc.richardyorke.gettingstarted;

/**
* @author Richard Yorke
 * Spring 2018 semester
 * CIS 174- Algorithms in Programming
 * Instructor: Michael Bourgeious
 */
public class BusSong {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verse("wheels", "go",  "round and round");
		verse("wipers",  "go", "swish, swish, swish");
		verse("horn",  "goes", "beep, beep, beep"); 

	}
	public static void verse(String item, String verb, String sound) {
		System.out.println("The " + item + " on the bus " + verb + " " + sound + ",");
		System.out.println(sound + ",");
		System.out.println(sound + ".");
		System.out.println("The " + item + " on the bus " + verb + " " + sound + ",");
		System.out.println("All through the town.");
		System.out.println();

	}
}
