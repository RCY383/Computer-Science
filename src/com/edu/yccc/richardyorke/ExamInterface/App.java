package com.edu.yccc.richardyorke.ExamInterface;

import java.util.ArrayList;
import java.util.List;

public class App {
	List<Exam> exams = new ArrayList<Exam>();

	public void loadExams() {
		exams.add(new GeographyExam());
		exams.add( new NetworkExam());
	}
	public void runExams() {
		for( Exam exam: exams) {
			exam.ExamResults();
			exam.TakeExam();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
