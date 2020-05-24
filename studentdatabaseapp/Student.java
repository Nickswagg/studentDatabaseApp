package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = " ";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor prompts user to enter a name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student firstname: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student lastname: ");
        this.lastName = in.nextLine();

        System.out.print("1 -Freshmen\n2 -Sophmore\n3- Junior\n4- Senior\n Enter Student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        // System.out.println(firstName + " " + lastName + " " + gradeYear + " " +
        // studentID);

    }

    // Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0 to quit
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

        // System.out.println("ENROLLED IN: " + courses);
        // System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    // View Balance
    public void viewBalance() {
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for payment of $" + payment);
        viewBalance();
    }

    // Status
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudent ID: " + studentID
                + "\nCourses ENROLLED :" + courses + "\nBalance is : $" + tuitionBalance;
    }

}