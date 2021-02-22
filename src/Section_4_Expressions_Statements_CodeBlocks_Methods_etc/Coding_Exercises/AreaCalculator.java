package Section_4_Expressions_Statements_CodeBlocks_Methods_etc.Coding_Exercises;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1d;
        }

        double area_of_circle = Math.pow(radius, 2d) * Math.PI;

        return area_of_circle;
    }

    public static double area(double x, double y) {
        boolean valid_params = x > 0 && y > 0;

        if (!valid_params) {
            return -1d;
        }

        double area_of_rectangle = x * y;

        return area_of_rectangle;
    }
}
