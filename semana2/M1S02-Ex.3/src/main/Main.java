package main;
import models.FinalGradeCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your first grade: ");
        double gradeOne = keyboard.nextDouble();
        System.out.println("Please enter your second grade: ");
        double gradeTwo = keyboard.nextDouble();
        System.out.println("Please enter your third grade: ");
        double gradeThree = keyboard.nextDouble();

        FinalGradeCalculator finalGrade  = new FinalGradeCalculator(gradeOne, gradeTwo, gradeThree);
        System.out.printf("Your final grade is %.2f%n", finalGrade.getFinalGrade());
    }
}
