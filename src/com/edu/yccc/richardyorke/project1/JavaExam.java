package com.edu.yccc.richardyorke.project1;

import java.util.*;



/**
 * @author Richard Yorke
 * Spring 2018 semester
 * CIS 174- Algorithms in Programming
 * Instructor: Michael Bourgeious
 */
public class JavaExam {



	public static void main(String[] args) {
		CreateQuestions q = new CreateQuestions();
		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter your first name: ");
		;
		console.nextLine();
		System.out.println();

		System.out.print("Enter your last name: ");
		console.nextLine();
		System.out.println();
		System.out.print("Enter your student ID Number: ");
		console.nextLine();
		System.out.println();
		System.out.println("The following questions will test your knowledge in Java. Good luck to you on your Exam and try to do your best!");

		System.out.println();

		List<Questions> ListQuestions =  CreateQuestions.loadQuestions();

		for (Questions question:ListQuestions ) {
			System.out.println(question.getQuestions());
			console.nextLine();
		}
	}
	

}

