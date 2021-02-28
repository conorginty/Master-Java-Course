package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Polymorphism_Parts.Challenge.Solution;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("===========");

        Mitsubishi mitsubishi = new Mitsubishi("Outlander VRW 4WD", 6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("===========");

        Ford ford = new Ford("Micra", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
