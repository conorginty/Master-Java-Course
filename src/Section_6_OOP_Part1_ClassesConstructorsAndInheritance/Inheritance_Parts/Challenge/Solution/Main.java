package Section_6_OOP_Part1_ClassesConstructorsAndInheritance.Inheritance_Parts.Challenge.Solution;

public class Main {
    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.accelerate(30);
        outlander.steer(45);
        outlander.accelerate(20);
        outlander.accelerate(-45);
    }
}
