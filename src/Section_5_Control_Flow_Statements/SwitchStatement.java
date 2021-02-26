package Section_5_Control_Flow_Statements;

import java.util.Locale;

public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 4;

//        if (switchValue == 1) {
//            System.out.println("Value was 1");
//        } else if (switchValue == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Every other case was not satisfied");
//        }

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            // Multiple cases in 1 go;
            case 3: case 4: case 5:
                System.out.println("Value was 3, 4, or 5");
                break;
            default:
                System.out.println("Every other case was not satisfied");
        }

        // Generally Switch Statements are good if you want to test the same Variable and test different values for that variables

        String month = "jAnUarY";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("1st month of the year");
                break;
            case "december":
                System.out.println("Last month of the year");
                break;
            default:
                System.out.println("Neither month...");
        }
    }
}
