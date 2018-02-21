package com.edu.yccc.richardyorke.project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {

	public static List<Questions> loadQuestions(){

		List<Questions> questions = new ArrayList<Questions>();
		Questions q = new Questions ();

		File fileName = new File("Questions.txt");
		Scanner scan = null;

		try {
			scan = new Scanner(fileName);

			while(scan.hasNextLine())
			{
				q.setQuestions(scan.nextLine());
				questions.add(q);
			};
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return questions;

	}
	
	}




