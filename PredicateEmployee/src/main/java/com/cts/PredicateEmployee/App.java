package com.cts.PredicateEmployee;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.cts.PredicateEmployee.templates.Employee;

/**
 * Hello world!
 *
 */
public class App {
	private static ArrayList<Employee> employees = new ArrayList<Employee>();

	static {
		employees.add(new Employee("Ritesh", "Programmer", 30000.0, "kol"));
		employees.add(new Employee("Ramu", "Annalyst", 30000.0, "kol"));
		employees.add(new Employee("Souvik", "Manager", 30000.0, "kol"));
		employees.add(new Employee("Shyam", "Security", 30000.0, "kol"));
		employees.add(new Employee("Sahanawaj", "Manager", 30000.0, "kol"));
	}

	public static void main(String[] args) {
		// predicate to check for list of managers
		Predicate<Employee> ifmanager = emp -> emp.getDesignation().equalsIgnoreCase("Manager");
		printEmp(ifmanager, employees);

	}

	// This method will print elements by checking against the predicate supplied
	public static void printEmp(Predicate<Employee> pe, ArrayList<Employee> al) {

		for (Employee e : al) {
			if (pe.test(e)) {
				System.out.println(e);
			}
		}

	}
}
