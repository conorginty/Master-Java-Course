package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class BadConstructorsExample {
    // Meant to represent a Rectangle class...

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st Constructor (Standard All Arg Constructor)
    public BadConstructorsExample(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 2nd Constructor (BAD)
    public BadConstructorsExample() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    // 3rd Constructor (BAD)
    public BadConstructorsExample(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }
}
