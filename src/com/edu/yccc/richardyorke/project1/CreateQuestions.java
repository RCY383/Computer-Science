/**
 * 
 */
package com.edu.yccc.richardyorke.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author srichardyorke
 *
 */
public class CreateQuestions {

	

		public static List<Questions> loadQuestions(){

			List<Questions> question = new ArrayList<Questions>();
			

			File fileName = new File("Questions.txt");
			Scanner scan = null;

			
			try {
				scan = new Scanner(fileName);

				while(scan.hasNextLine())
				{
					Questions q = new Questions ();
					q.setQuestions(scan.nextLine());
					question.add(q);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			return question;

		}
		
		}

