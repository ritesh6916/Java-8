package com.cts.FunctionGen.templates;

public class Student {

	private String name;
	private String course;
	private double percent;

	public Student() {
		super();
	}

	public Student(String name, String course, double percent) {
		super();
		this.name = name;
		this.course = course;
		this.percent = percent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", percent=" + percent + "]";
	}

}
