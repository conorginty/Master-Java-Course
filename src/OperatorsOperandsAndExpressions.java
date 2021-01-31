public class OperatorsOperandsAndExpressions {
    public static void main(String[] args){
        // 33. Operators, Operands and Expressions

        // Operators in Java = special symbols that perform specific operations on 1, 2 or 3 operands, and then return a result
        // e.g. + (addition operator), = (assignment operator).
        // Operand = any object that is manipulated by an Operator
        // An Expression is formed by combining variables, literals, method return values and operators

        int result = 1 + 2; // 3
        // = : assignment operator
        // + : addition/plus operator

        // Comments are used to make notes and to temporarily disable code within a program (for testing etc)

        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result -= 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("The value of previousResult is still = " + previousResult);

        // N.B. - result and previousResult are Independent of one another.
        // So even though we updated the value of result, this did NOT affect the value of previousResult

        result *= 10;
        System.out.println("2 * 10 = " + result);

        result /= 6;
        System.out.println("20 / 6 = " + result); // 3 (BECAUSE REMEMBER WE GET THE QUOTIENT!!!!!!)

        result %= 2;
        System.out.println("3 % 2 = " + result); // 1 (because we get the remainder)
        System.out.println("========================");

        // 34. Abbreviating Operators
        int newNum = 5;
        System.out.println(newNum); // 5

        // --- Post-Increment ---
        System.out.println(newNum++); // 5
        System.out.println(newNum); // 6
        // --- Pre-Increment ---
        System.out.println(++newNum); // 7
        System.out.println(newNum); // 7
        System.out.println("==========");

        System.out.println(newNum); // 7
        // --- Post-Decrement ---
        System.out.println(newNum--); // 7
        System.out.println(newNum); // 6
        // --- Pre-Decrement ---
        System.out.println(--newNum); // 5
        System.out.println(newNum); // 5
    }
}
