package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class GoodConstructorsExample {
    // Meant to represent a Rectangle class...

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st Constructor (Standard All Arg Constructor)
    public GoodConstructorsExample(int x, int y, int width, int height) {
        // Initialises the variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 2nd Constructor (GOOD)
    public GoodConstructorsExample() {
        this(0, 0); // Calls the 3rd Constructor
    }

    // 3rd Constructor (GOOD)
    public GoodConstructorsExample(int width, int height) {
        this(0, 0, width, height); // Calls the 1st Constructor
    }
}
