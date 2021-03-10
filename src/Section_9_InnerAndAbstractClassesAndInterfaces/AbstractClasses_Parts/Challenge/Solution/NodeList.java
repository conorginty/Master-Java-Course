package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.Solution;

public interface NodeList {
    ListItem getHead();
    boolean addItem(ListItem newItem);
    boolean removeItem(ListItem itemToDelete);
    void traverse(ListItem head);
}
