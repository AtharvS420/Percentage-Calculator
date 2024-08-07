
import java.util.Scanner;

public class JavaPercentageCalculator {
    public static void main(String[] args) {
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for subject 1:");
        int marks1 = sc.nextInt();

        System.out.println("Enter marks for subject 2:");
        int marks2 = sc.nextInt();

        System.out.println("Enter marks for subject 3:");
        int marks3 = sc.nextInt();

        System.out.println("Enter marks for subject 4:");
        int marks4 = sc.nextInt();

        System.out.println("Enter marks for subject 5:");
        int marks5 = sc.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (totalMarks / 500.0) * 100;

        System.out.println("The total marks are: " + totalMarks);
        System.out.println("The percentage is: " + percentage + "%");

        sc.close();
    }
}

