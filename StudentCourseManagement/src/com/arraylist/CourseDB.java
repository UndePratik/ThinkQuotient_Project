package com.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseDB {

    static Scanner sc = new Scanner(System.in);

    public void addCourse(ArrayList<Course> courses) {
        System.out.println("Enter course Id:");
        int cid = sc.nextInt();
        System.out.println("Enter course Name:");
        String cname = sc.next();
        System.out.println("Enter fees:");
        float fees = sc.nextFloat();
        courses.add(new Course(cid, cname, fees));
        System.out.println("____________________________");
    }

    public void updateCourse(ArrayList<Course> courses, int cid) {
        boolean found = false;
        for (Course course : courses) {
            if (course.getCid() == cid) {
                System.out.println(course.getCname() + " " + course.getFees());
                System.out.println("Enter Course Name");
                String name = sc.next();
                course.setCname(name);
                System.out.println("Enter Fees");
                float fees = sc.nextFloat();
                course.setFees(fees);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found");
        }
    }

    public void deleteCourse(ArrayList<Course> courses, int cid) {
        boolean found = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCid() == cid) {
                found = true;
                System.out.println(courses.get(i).getCid() + " " + courses.get(i).getCname() + " " + courses.get(i).getFees());
                courses.remove(i);
                System.out.println("Course " + cid + " deleted successfully");
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found");
        }
    }

    public void viewCourse(ArrayList<Course> courses) {
        for (Course course : courses) {
            System.out.println(course.toString());
        }
    }

    public void viewCourseByID(ArrayList<Course> courses, int cid) {
        boolean found = false;
        for (Course course : courses) {
            if (course.getCid() == cid) {
                System.out.println(course.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found");
        }
    }

    public static void main(String[] args) {
        CourseDB cdb = new CourseDB();
        ArrayList<Course> courses = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("__________CourseDB________________");
            System.out.println("****Choose Following Options:**** ");
            System.out.println("1.Add Course");
            System.out.println("2.Update Course");
            System.out.println("3.View Course");
            System.out.println("4.View Course By Id");
            System.out.println("5.Delete Course");
            System.out.println("-------------------------");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cdb.addCourse(courses);
                    break;
                case 2:
                    System.out.println("Enter Course Id to update :");
                    int id = sc.nextInt();
                    cdb.updateCourse(courses, id);
                    System.out.println("Course updated successfully!");
                    break;
                case 3:
                    cdb.viewCourse(courses);
                    break;
                case 4:
                    System.out.println("Enter Id for View Course");
                    int cid1 = sc.nextInt();
                    cdb.viewCourseByID(courses, cid1);
                    break;
                case 5:
                	System.out.println("Enter Id for delete");
    				int cid = sc.nextInt();
    				cdb.deleteCourse(courses, cid);
    				break;

    			case 6:
    				System.out.println("Invalid Input");

    			}
    			System.out.println("Do you want to perform more operation Yes-1/No-0");
    			choice = sc.nextInt();
    		} while (choice == 1);

    }
}