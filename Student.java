import java.util.Scanner;

public class Student {
    private String courses = null, firstName, lastName, studentID;
    private int tuitionBalance = 0, gradeYear;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor to prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();
        System.out.print("1 - FRESHMAN\n2 - SOPHMORE\n3 - JUNIOR\n4 - SENIOR\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    // Generate a student id
    private void setStudentID() {
        // grade level plus id
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
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
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        tuitionBalance = tuitionBalance - pay;
        System.out.println("Thank you for your payment of $" + pay);
        viewBalance();
    }

    // print status of student 
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nStudent ID: " + studentID + "\nGrade year: " + gradeYear
                + "\nCourses enrolled: " + courses + "\nBalance: $" + tuitionBalance;

                
    }

}