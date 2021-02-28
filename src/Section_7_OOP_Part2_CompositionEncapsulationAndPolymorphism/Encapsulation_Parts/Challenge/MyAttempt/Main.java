package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts.Challenge.MyAttempt;

public class Main {
    // 92. Composition Part 2 (+ Challenge)

    // *** Challenge ***
    // Create a class and demonstrate proper encapsulation techniques
    // The class will be called Printer (it'll simulate a real computer printer)
    // It should have fields for the toner level, number of pages printed and if it's a duplex printer

    // Add methods to fill up the toner (up to a maximum of 100%) and another to simulate printing a page (should increase pages printed)
    // Decide on Scope, whether to use Constructors etc

    public static void main(String[] args) {
        // === Single-Page Computer ===
        Printer printer = new Printer();

        printer.printPrinterDetails();
        printer.printPage();
        printer.fillToner(120);
        printer.fillToner(80);
        printer.printPrinterDetails();
        for (int i=0; i < 5; i++) {
            printer.printPage();
        }
        printer.printPrinterDetails();
        System.out.println("=================");

        // === Duplex Computer ===
        Printer duplexPrinter = new Printer(true);

        duplexPrinter.printPrinterDetails();
        duplexPrinter.printPage();
        duplexPrinter.fillToner(120);
        duplexPrinter.fillToner(80);
        duplexPrinter.printPrinterDetails();
        for (int i=0; i < 5; i++) {
            duplexPrinter.printPage();
        }
        duplexPrinter.printPrinterDetails();
    }
}
