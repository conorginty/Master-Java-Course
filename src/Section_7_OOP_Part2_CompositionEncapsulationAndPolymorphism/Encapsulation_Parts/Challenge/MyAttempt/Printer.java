package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts.Challenge.MyAttempt;

import java.lang.Class;

public class Printer {
    private int tonerLevel = 0;
    private int totalPagesPrinted = 0;
    private boolean duplex;

    private int tonerToPrintPage = 2;

    // === Constructors ===
    public Printer(int tonerLevel, int totalPagesPrinted, boolean duplex) {
        if (validTonerLevel(tonerLevel)) {
            this.tonerLevel = tonerLevel;
        } // else, tonerLevel will be set to 0
        this.totalPagesPrinted = totalPagesPrinted;
        this.duplex = duplex;
    }

    public Printer(boolean duplex) {
        this.duplex = duplex;
    }

    public Printer() {
        duplex = false;
    }

    // === Methods ===
    public boolean validTonerLevel(int amount) {
        return tonerLevel + amount <= 100;
    }

    public void fillToner(int amount) {
        if (validTonerLevel(amount)) {
            System.out.println("Increasing Toner Level from: " + tonerLevel + " to " + (tonerLevel + amount));
            tonerLevel += amount;
        } else {
            System.out.println("Try again with a smaller amount. Toner Level unchanged and remains at: " + tonerLevel);
        }
    }

    private boolean enoughToner() {
        if (duplex) {
            return tonerLevel > tonerToPrintPage * 2;
        }
        return tonerLevel > tonerToPrintPage;
    }

    public void printPage() {
        if (enoughToner()) {
            totalPagesPrinted++;
            printAmountOfPagesPrinted();

            int costPerPage = duplex ? tonerToPrintPage * 2 : tonerToPrintPage;

            tonerLevel -= costPerPage;
        } else {
            System.out.println("Toner Levels are too low to print page. Please fill it up and try again");
        }
    }

    private void printTonerLevel() {
        System.out.println("Toner Level = " + tonerLevel);
    }

    private void printAmountOfPagesPrinted() {
        System.out.println("Number of Pages printed = " + totalPagesPrinted);
    }

    private void printTypeOfPrinter() {
        String type = duplex ? "Duplex" : "Single-Page";
        System.out.println("Type of Printer = " + type);
    }

    public void printPrinterDetails() {
        System.out.println("*********");
        printTonerLevel();
        printAmountOfPagesPrinted();
        printTypeOfPrinter();
        System.out.println("*********");
    }
}
