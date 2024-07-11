package com.cts.ConsumerGen;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.cts.ConsumerGen.templates.Student;

/**
 * Hello world!
 *
 */
public class App {
	private static ArrayList<Student> sl = new ArrayList<Student>();

	static {
		sl.add(new Student("Ritesh Singh", 87));
		sl.add(new Student("Avinsh Patel", 65));
		sl.add(new Student("mukesh Bhati", 78));
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
	}
}
