package Section_5_Control_Flow_Statements;

public class WhileAndDoWhileStatements {
    public static void main(String[] args) {
        // 68. The while and do while statements (and Challenge)

        int count = 0;
        while (count < 5) {
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("**********");

        // *** Equivalent in a for loop ***
        for (count = 0; count < 5; count++) {
            System.out.println("Count value is " + count);
        }
        System.out.println("**********");

        // *** Another way of writing that while loop:
        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        System.out.println("===================");

        // Do While loops will ALWAYS execute once (as long as you have your test expressions set up properly)
        count = 3;
        do {
            System.out.println("Currently on count: " + count);
            count--;
        } while (count > 0);
        System.out.println("**********");

        // So this will execute once, EVEN THOUGH the condition in the while portion is false;
        count = 3;
        do {
            System.out.println("Currently on count: " + count);
            count--;
        } while (count > 10);

        // *** Challenge ***
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is even or not
        // return true if an even number, otherwise return false

        int number = 4;
        int finishNumber = 20;
        int even_count = 0;

        while (number <= finishNumber) {
            number++; // num will start as 5, NOT 4 within the code
            if (!isEvenNumber(number)) {
                continue;
            }
            even_count++;
            System.out.println("Even number " + number);
            if (even_count == 5) {
                break;
            }
        }
        System.out.println("Total even count: " + even_count);
        System.out.println("===================");
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
