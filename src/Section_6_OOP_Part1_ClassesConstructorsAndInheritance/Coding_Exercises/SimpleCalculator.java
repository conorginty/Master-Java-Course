package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

public class SimpleCalculator {
    // Fields/ Instance Variables
    private double firstNumber;
    private double secondNumber;

    // Instance Methods

    // === Getters ===
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    // === Setters ===
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // === Extras ===
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (isSecondNumberZero()) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    public boolean isSecondNumberZero() {
        return secondNumber == 0;
    }
}
