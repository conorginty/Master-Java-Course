package Section_6_OOP_Part1_ClassesConstructorsAndInheritance;

public class UsingSuper {
    public class Shape {
        private int x;
        private int y;

        public Shape(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public class Rectangle extends Shape {
        private int width;
        private int height;

        // 1st Constructor
        public Rectangle(int x, int y, int width, int height) {
            super(x, y); // Calls the parent (Shape's) Constructor
            this.width = width;
            this.height = height;
        }

        // 2nd Constructor
        public Rectangle(int x, int y) {
            this(x, y, 0, 0); // Calls the 1st Constructor
        }
    }
}
