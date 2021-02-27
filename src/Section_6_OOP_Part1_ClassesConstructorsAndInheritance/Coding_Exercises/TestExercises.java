package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Coding_Exercises;

import Section_5_Control_Flow_Statements.Coding_Exercises.ExerciseSeparator;

public class TestExercises {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.5);
        calculator.setSecondNumber(4);
        System.out.println("Result of Addition = " + calculator.getAdditionResult());
        System.out.println("Result of Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Result of Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Result of Division = " + calculator.getDivisionResult());
        calculator.setSecondNumber(0);
        System.out.println("Result of Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Result of Division = " + calculator.getDivisionResult());
        ExerciseSeparator.separate_exercises(20);

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Are they a Teenager?: " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("Full name = " + person.getFullName());
        System.out.println("Are they a Teenager?: " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full name = " + person.getFullName());
        ExerciseSeparator.separate_exercises(20);

        Wall wall = new Wall(5, 4);
        System.out.println("Wall area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Wall width = " + wall.getWidth());
        System.out.println("Wall height = " + wall.getHeight());
        System.out.println("Wall area = " + wall.getArea());
        ExerciseSeparator.separate_exercises(20);

        TwoDPoint first = new TwoDPoint(6, 5);
        TwoDPoint second = new TwoDPoint(3, 1);

        System.out.println("Distance of first from (0,0) = " + first.distance());
        System.out.println("Distance of first from (2,2) = " + first.distance(2, 2));
        System.out.println("Distance of first from second = " + first.distance(second));
        ExerciseSeparator.separate_exercises(20);

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
