package com.cts.ConsumerGen;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.cts.ConsumerGen.templates.Student;

/**
 * Hello world!
 *
 */
public class App {
	private static ArrayList<Student> sl = new ArrayList<Student>();

	static {
		sl.add(new Student("Ritesh Singh", 87));
		sl.add(new Student("Topper", 785));
		sl.add(new Student("Avinsh Patel", 65));
		sl.add(new Student("mukesh Bhati", 78));
		sl.add(new Student("Extra Topper", -75));
		sl.add(new Student("harsh Chaudhari", 45));

	}

	public static void main(String[] args) {

		// Consumer to print Student data
		Consumer<Student> stdConsume = std -> {
			System.out.println("Student name: " + std.getName());
			System.out.println("Student Marks: " + std.getMarks());
			System.out.println();
		};

		// To call Consumer for ArrayList
		System.out.println("*** Details of All Student ***\n");
		for (Student s : sl) {
			stdConsume.accept(s);
		}

		// To Validate Marks and Populate grade Based for the student.

		// Predicate to validate marks
		Predicate<Student> ifMarksValid = std -> std.getMarks() >= 0 && std.getMarks() <= 100;

		// Function to Add grades
		Function<Student, String> decideGrade = student -> {

			// Using Predicate to validate marks
			if (ifMarksValid.test(student)) {
				if (student.getMarks() >= 80) {
					return "A [Distinction]";
				} else if (student.getMarks() >= 60) {
					return "B [1st Division]";
				} else if (student.getMarks() >= 50) {
					return "C [2nd Division]";
				} else if (student.getMarks() >= 35) {
					return "D [3rd Division]";
				} else {
					return " failed";
				}
			} else
				return " Invalid Marks";
		};

		// Consumer to print Student data
		Consumer<Student> printStudent = std -> {

			System.out.println("Student Name: " + std.getName());
			System.out.println("Student Marks: " + std.getMarks());

			// Using function to determine Grade of student
			System.out.println("Student Grade: " + decideGrade.apply(std));
		};

		// Calling Consumer to print all Elements of ArrayList
		System.out.println("*** Use of Consuler ***");
		for (Student s : sl) {
			System.out.println();
			printStudent.accept(s);
		}
	}
}
