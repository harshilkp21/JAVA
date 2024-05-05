package Unit2;

import java.util.Scanner;

class Student {
    String name;
    String city;
    int age;

    // Method to input data
    public void addData(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    // Method to print data
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create first student object
        System.out.println("Enter details for student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("City: ");
        String city1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Student s1 = new Student();
        s1.addData(name1, city1, age1);

        // Create second student object
        System.out.println("\nEnter details for student 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("City: ");
        String city2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Student s2 = new Student();
        s2.addData(name2, city2, age2);

        scanner.close();

        // Print details of both students
        System.out.println("\nDetails of student 1:");
        s1.printData();
        System.out.println("\nDetails of student 2:");
        s2.printData();
    }
}

