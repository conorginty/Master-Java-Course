package Section_7_OOP_Part2_CompositionEncapsulationAndPolymorphism.Encapsulation_Parts.Challenge.Solution;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // === Constructors ===
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1; // Toner level hasn't been set correctly
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // === Methods ===
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount <= 100) {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        // pages = number of pages we want to print
        // We'll assume pages is the number of physical pieces of paper that are going through the printer
        // Therefore in Duplex mode, we divide the number of pages printed by 2
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in Duplex Mode");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
