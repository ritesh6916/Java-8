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
		employees.add(new Employee("Ritesh", "Programmer", 30000.0, "kolkata"));
		employees.add(new Employee("Ramu", "Annalyst", 30000.0, "hydrabad"));
		employees.add(new Employee("Souvik", "Manager", 120000.0, "kolkata"));
		employees.add(new Employee("Shyam", "Security", 30000.0, "Pune"));
		employees.add(new Employee("Sahanawaj", "Manager", 150000.0, "Kolkata"));
	}

	public static void main(String[] args) {

		String msg;

		// predicate to check for list of managers
		Predicate<Employee> ifmanager = emp -> emp.getDesignation().equalsIgnoreCase("Manager");
		msg = "list of managers";
		printEmp(ifmanager, employees, msg);

		// Predicate to check the employees from kolkata
		Predicate<Employee> empkol = emp -> emp.getCity().equalsIgnoreCase("Kolkata");
		msg = "Employees from kolkata";
		printEmp(empkol, employees, msg);

		// Predicate to check the employees whose salary is getter then 50K
		Predicate<Employee> kolsal = emp -> emp.getCity().equalsIgnoreCase("Kolkata") && emp.getSalary() > 50000;
		msg = "Employee from kolkata with more then 50K salary";
		printEmp(kolsal, employees, msg);

		// To check the managers form Kolkata
		msg = "managers from kolkata (predicate joining)";
		printEmp(ifmanager.and(empkol), employees, msg);

		// To get Employee who are not manager
		msg = "Employees who are not manager";
		printEmp(ifmanager.negate(), employees, msg);

	}

	// This method will print elements by checking against the predicate supplied
	public static void printEmp(Predicate<Employee> pe, ArrayList<Employee> al, String msg) {

		System.out.println(msg);
		for (Employee e : al) {
			if (pe.test(e)) {
				System.out.println(e);
			}
		}

	}
}
