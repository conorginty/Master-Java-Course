package Section_5_Control_Flow_Statements.Coding_Exercises;

public class NumberToWords {
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversed_num = reversedNum(num);
        int total_digits = getDigitCount(num);

        String output = "";

        for (int i = total_digits; i > 0; i--) {
            int least_sig_digit = reversed_num % 10;

            switch (least_sig_digit) {
                case 1:
                    output += "One "; break;
                case 2:
                    output += "Two "; break;
                case 3:
                    output += "Three "; break;
                case 4:
                    output += "Four "; break;
                case 5:
                    output += "Five "; break;
                case 6:
                    output += "Six "; break;
                case 7:
                    output += "Seven "; break;
                case 8:
                    output += "Eight "; break;
                case 9:
                    output += "Nine "; break;
                default:
                    output += "Zero "; break;
            }

            reversed_num /= 10;
        }
        System.out.println(output);
    }

    public static int reversedNum(int num) {
        int reversed = 0;

        int copy_num = num > 0 ? num : Math.abs(num);

        while (copy_num > 0) {
            reversed *= 10;

            int least_sig_num = copy_num % 10;
            reversed += least_sig_num;

            copy_num /= 10;
        }
        reversed = num > 0 ? reversed : -reversed;
        return reversed;
    }

    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 1;
        }

        int digit_count = 0;

        while (num > 0) {
            digit_count++;
            num /= 10;
        }
        return digit_count;
    }
}
