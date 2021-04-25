package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Sakthi");

	}

	public void studentDpt() {
		System.out.println("Computer Science");
	}

	public void studentID() {
		System.out.println("345213");
	}

	public static void main(String[] args) {
		Student ss=new Student();
		ss.collegeCode();
		ss.collegeName();
		ss.collegeRank();
		ss.deptName();
		ss.studentDpt();
		ss.studentID();
		ss.studentName();

	}

}
