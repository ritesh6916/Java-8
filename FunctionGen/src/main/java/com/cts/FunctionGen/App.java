package com.cts.FunctionGen;

import java.util.ArrayList;
import java.util.function.Function;

import com.cts.FunctionGen.templates.Student;

public class App {

	private static ArrayList<Student> students = new ArrayList<Student>();

	static {
		students.add(new Student("Ritesh Singh", "B.C.A", 86.23));
		students.add(new Student("minakshi Singh", "12th", 59));
		students.add(new Student("Vikash Singh", "12th", 88.56));
		students.add(new Student("gaurav Kr", "10th", 45));
		students.add(new Student("Aman Singh", "12th", 65));
		students.add(new Student("Suresh kushwaha", "B.Com", 34));
		students.add(new Student("Beauti Singh", "12th", 43));
	}

	public static void main(String[] args) {
		String ritesh = "Ritesh Singh is a Java Developer";

		// To remove spaces from a String
		Function<String, String> removeAllSpace = s -> s.replaceAll(" ", "");
		System.out.println("Original String: " + ritesh + "\n");
		System.out.println("After removing spaces: " + removeAllSpace.apply(ritesh) + "\n");

		// To Count Spaces in the String
		Function<String, Integer> countSpace = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println("Space Count: " + countSpace.apply(ritesh));

		// To give Grades to Students based on their marks
		Function<Student, String> findGrade = student -> {

			if (student.getPercent() >= 80) {
				return "A [Distinction]";
			} else if (student.getPercent() >= 60) {
				return "B [1st Division]";
			} else if (student.getPercent() >= 50) {
				return "C [2nd Division]";
			} else if (student.getPercent() >= 35) {
				return "D [3rd Division]";
			} else {
				return "failed";
			}
		};

		System.out.println("\n********** Student **********");
		printStudent(findGrade, students);

	}

	// To print Student data
	public static void printStudent(Function<Student, String> findGrade, ArrayList<Student> students) {
		for (Student std : students) {
			// To call Function
			String grade = findGrade.apply(std);
			System.out.println("\nName: " + std.getName() + " Grade: " + grade + " with " + std.getPercent() + "%");
		}
	}

}
