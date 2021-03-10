package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.Solution;

public class Main {
    public static void main(String[] args) {
        MyLinkedList listOfCities = new MyLinkedList();
        listOfCities.traverse(listOfCities.getHead());
        System.out.println("-----");

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String city: data) {
            // Create a new item with value set to the string city
            listOfCities.addItem(new Node(city));
        }

        listOfCities.traverse(listOfCities.getHead());
        System.out.println("==========================================================");

        MyLinkedList listOfInts = new MyLinkedList();
        listOfInts.traverse(listOfInts.getHead());
        System.out.println("-----");

        String stringInts = "5 7 3 8 9 8 2 1 0 4 2 6";
        String[] intsArray = stringInts.split(" ");
        for (String integer: intsArray) {
            // Create a new item with value set to the string city
            listOfInts.addItem(new Node(integer));
        }

        listOfInts.traverse(listOfInts.getHead());

        listOfInts.removeItem(new Node("3"));
        listOfInts.traverse(listOfInts.getHead());

        listOfInts.removeItem(new Node("5"));
        listOfInts.traverse(listOfInts.getHead());

        listOfInts.removeItem(new Node("0"));
        listOfInts.removeItem(new Node("4"));
        listOfInts.removeItem(new Node("2"));
        listOfInts.traverse(listOfInts.getHead());

        listOfInts.removeItem(new Node("9"));
        listOfInts.traverse(listOfInts.getHead());
        listOfInts.removeItem(new Node("8"));
        listOfInts.traverse(listOfInts.getHead());
        listOfInts.removeItem(new Node("6"));
        listOfInts.traverse(listOfInts.getHead());
        listOfInts.removeItem(listOfInts.getHead());
        listOfInts.traverse(listOfInts.getHead());
        listOfInts.removeItem(listOfInts.getHead());
        listOfInts.traverse(listOfInts.getHead());
        System.out.println("===========================================");

        SearchTree tree = new SearchTree();
        tree.traverse(tree.getHead());
        System.out.println("-----");

        stringInts = "5 7 3 8 9 8 2 1 0 4 2 6";
        intsArray = stringInts.split(" ");
        for (String integer: intsArray) {
            // Create a new item with value set to the string city
            tree.addItem(new Node(integer));
        }

        tree.traverse(tree.getHead());

        // THERE'S A BUG SOMEWHERE, NOT EXACTLY SURE WHERE!!!
        tree.removeItem(new Node("3"));
        tree.traverse(tree.getHead());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getHead());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getHead());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getHead());
        tree.removeItem(new Node("8"));
        tree.traverse(tree.getHead());
        tree.removeItem(new Node("6"));
        tree.traverse(tree.getHead());
        tree.removeItem(tree.getHead());
        tree.traverse(tree.getHead());
        tree.removeItem(tree.getHead());
        tree.traverse(tree.getHead());
    }
}
