package org.pro;

public class Employee implements Student{

	@Override
	public void studentId() {
		System.out.println("student id is 23456");
	}

	@Override
	public void studentName() {
		System.out.println("student name is ravi");
	}

	@Override
	public void studentAddress() {
		System.out.println("student address is omr");
	}

	@Override
	public void studentRank() {
		System.out.println("student rank is 1");
	}

	public static void main(String[] args) {
		Employee a = new Employee();
		a.studentAddress();
		a.studentId();
		a.studentName();
		a.studentRank();
	}

	
}
