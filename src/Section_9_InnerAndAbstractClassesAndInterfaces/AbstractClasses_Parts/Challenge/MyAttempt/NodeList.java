package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.MyAttempt;

public interface NodeList {
    abstract ListItem getRoot();
    abstract boolean addItem(ListItem item);
    abstract void removeItem();
    abstract void traverse();
}
