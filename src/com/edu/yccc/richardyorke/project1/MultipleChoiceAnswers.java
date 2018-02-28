
package com.edu.yccc.richardyorke.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Richard Yorke
 * Spring 2018 semester
 * CIS 174- Algorithms in Programming
 * Instructor: Michael Bourgeious
 */
public class MultipleChoiceAnswers {


		public static List<Answers> loadAnswers(){

			List<Answers> answer = new ArrayList<Answers>();


			File fileName = new File("Answers.txt");
			Scanner scan = null;


			try {
				scan = new Scanner(fileName);

				while(scan.hasNextLine())
				{
					Answers a = new Answers ();
					a.setAnswers(scan.nextLine());
					answer.add(a);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			return answer;

		}

	}


