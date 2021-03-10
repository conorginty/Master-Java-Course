package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts;

import java.util.Scanner;

public class Main2 {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        // We can create a local class that implements the OnClickListener interface, and assign an
        // instance of it to our button;
        // Makes sense to have it here, as we're not using it in a shared environment, and could be applied
        // to several different buttons
//        class ClickListener implements Button.OnClickListener {
//            // Constructor
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
//        listen();

        // It's likely that if we did have several buttons, that each would require a different on-click method
        // Therefore, using a local class may not be the best solution
        // i.e. if you have 4 buttons on the screen, chances are you don't want the exact same functionality
        // to be called each time a given button is clicked (e.g. one button for printing, another for saving etc)
        // Rather than define a class for each button, we could use an anonymous inner class to declare an object
        // and assign it to a button in the one expression
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("the button: " + title + " was clicked");
            }
        });
        listen();
    }

    // Simulating what would happen with some sort of Graphical User Interface
    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
