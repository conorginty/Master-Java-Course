package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts.Challenge.Solution;

public class Main {
    // 92. Composition Part 2 (+ Challenge)

    // *** Challenge ***
    // Create a class and demonstrate proper encapsulation techniques
    // The class will be called Printer (it'll simulate a real computer printer)
    // It should have fields for the toner level, number of pages printed and if it's a duplex printer

    // Add methods to fill up the toner (up to a maximum of 100%) and another to simulate printing a page (should increase pages printed)
    // Decide on Scope, whether to use Constructors etc

    // Solution

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Number of physical sheets of pages printed was: " + pagesPrinted
                + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Number of physical sheets of pages printed was: " + pagesPrinted
                + " new total print count for printer = " + printer.getPagesPrinted());
        System.out.println("===================");

        printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(4);
        System.out.println("Number of physical sheets of pages printed was: " + pagesPrinted
                + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Number of physical sheets of pages printed was: " + pagesPrinted
                + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
