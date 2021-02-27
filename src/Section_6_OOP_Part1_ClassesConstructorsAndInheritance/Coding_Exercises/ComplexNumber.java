package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

/*
* A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers,
* and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called
* an imaginary number. For the complex number a + bi, a is called the real part, and b is called the imaginary
* part. To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.
* For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
 */

public class ComplexNumber {
    // Instance Variables
    private double real;
    private double imaginary;

    // == Constructors ===

    // All-Arg Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Instance Methods

    // === Getters ===
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // === Setters ===

    // === Extras ===

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();

        // --- Or should it be this? ---
        // this.real += complexNumber.real;
        // this.imaginary += complexNumber.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();

        // --- Or should it be this? ---
        // this.real -= complexNumber.real;
        // this.imaginary -= complexNumber.imaginary;
    }
}
