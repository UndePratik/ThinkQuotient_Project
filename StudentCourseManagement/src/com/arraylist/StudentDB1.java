package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDB1 {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> studentList = new ArrayList<Student>();

	public static void addStudent(Student stud) {

		System.out.println("Enter student id: ");
		stud.setId(sc.nextInt());
		System.out.println("Enter Student Name: ");
		stud.setNameString(sc.next());
		System.out.println("Enter Student age: ");
		stud.setAge(sc.nextInt());
		System.out.println("_________________________________");
	}

	public void updateStudent(int sid) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == sid) {
				System.out.println(studentList.get(i).getName() + " :" + studentList.get(i).getId() + ": " + studentList.get(i).getAge());

				System.out.println("Enter student  Name: ");
				String name = sc.next();
				studentList.get(i).setNameString(name);

				break;
			}
		}
	}

	public void deletestudent(int sid) {
		boolean flag = false;

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == sid) {
				flag = true;
				System.out.println(studentList.get(i).getId() + " " + studentList.get(i).getName() + " " + studentList.get(i).getAge());
				studentList.remove(i);
				System.out.println("Student " + sid + " delete successfully");

				if (!flag) {
					System.out.println("Student not found");
				}
				break;
			}
		}
	}

	public void viewStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
	}

	public void viewStudentByID(int cid) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == cid)
				System.out.println(studentList.get(i).toString());
		}
	}

	public static void main(String[] args) {

		StudentDB1 sdb = new StudentDB1();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("****Choose Following Options:**** ");
			System.out.println("1.Add student");
			System.out.println("2.Update student");
			System.out.println("3.View student");
			System.out.println("4.View Student By Id");
			System.out.println("5.Delete student");
			System.out.println("-------------------------");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (studentList.size() < 10) {
					Student stud = new Student();
					sdb.addStudent(stud);
					studentList.add(stud);
				} else {
					System.out.println("you have already added maximum Student");
				}
				break;

			case 2:
				System.out.println("Enter Student Id to update :");
				int id = sc.nextInt();
				sdb.updateStudent(id);
				System.out.println("Student updated successfully!");
				break;

			case 3:
				sdb.viewStudent();
				break;

			case 4:
				System.out.println("Enter Id for View Student");
				int sid = sc.nextInt();
				sdb.viewStudentByID(sid);
				break;

			case 5:
				System.out.println("Enter Id for delete");
				int sid1 = sc.nextInt();
				sdb.deletestudent(sid1);
				break;

			case 6:
				System.out.println("Invalid Input");

			}
			System.out.println("Do you want to perform more operation Yes-1/No-0");
			choice = sc.nextInt();
		} while (choice == 1);

	}

}