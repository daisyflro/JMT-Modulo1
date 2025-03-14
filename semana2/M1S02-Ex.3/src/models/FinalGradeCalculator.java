package models;

public class FinalGradeCalculator {

    public double finalGrade;
    private double gradeOne;
    private double gradeTwo;
    private double gradeThree;

    public FinalGradeCalculator(double gradeOne, double gradeTwo, double gradeThree) {
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
        this.gradeThree = gradeThree;
    }

    public double getFinalGrade() {
        return finalGrade = (gradeOne + gradeTwo + gradeThree)/3;
    }

}