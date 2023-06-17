package com.one;

public class Student {
	
	private String studentName;
	private int studentRollNo;
	private int studentAge;
	
	public Student(String studentName,int studentRollNo,int studentAge) {
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentAge = studentAge;
	}
	

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}

	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public int getStudentAge() {
		return studentAge;
	}
	
	
	public static void main(String[] args) {
		
		Student student = new Student("Gana",13759,21);
		
		//student.setStudentName("Gana");
		System.out.println("Student Name : " + student.getStudentName());
		
		
		//student.setStudentRollNo(13759);
		System.out.println("Student Roll No : " + student.getStudentRollNo());
		
		//student.setStudentAge(21);
		System.out.println("Student Age : " + student.getStudentAge());
	}

}
