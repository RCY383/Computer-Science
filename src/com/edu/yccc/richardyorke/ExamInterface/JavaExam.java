package com.edu.yccc.richardyorke.ExamInterface;

import java.util.*;

import com.edu.yccc.richardyorke.project1.Answers;
import com.edu.yccc.richardyorke.project1.CreateQuestions;
import com.edu.yccc.richardyorke.project1.MultipleChoiceAnswers;
import com.edu.yccc.richardyorke.project1.Questions;



/**
 * @author Richard Yorke
 * Spring 2018 semester
 * CIS 174- Algorithms in Programming
 * Instructor: Michael Bourgeious
 */
public class JavaExam implements Exam {
	



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

		List<Questions> ListQuestions = CreateQuestions.loadQuestions();

		for (Questions question:ListQuestions ) {
			System.out.println(question.getQuestions());
			
			
			List<Answers> ListAnswers = MultipleChoiceAnswers.loadAnswers();
			
			for (Answers answer:ListAnswers ) {
				System.out.println(answer.getAnswers());
				console.next();
				
			}
			
		}
		console.close();
	}

	@Override
	public void TakeExam() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void questions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void answers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculateScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ExamResults() {
		// TODO Auto-generated method stub
		
	}


}

