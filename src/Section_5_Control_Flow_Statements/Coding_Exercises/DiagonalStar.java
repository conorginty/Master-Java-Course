package Section_5_Control_Flow_Statements.Coding_Exercises;

public class DiagonalStar {
    public static void printSquareStar(int num) {
        if (num < 5) {
            System.out.println("Invalid Value");
        }

        for (int row=1; row <= num; row++) {
            for (int col=1; col <= num; col++) {
                if (row == 1 || row == num) {
                    System.out.print("*");
                }
                else if (col == 1 || col == num) {
                    System.out.print("*");
                }
                else if (row == col) {
                    System.out.print("*");
                }
                else if (col == (num - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
