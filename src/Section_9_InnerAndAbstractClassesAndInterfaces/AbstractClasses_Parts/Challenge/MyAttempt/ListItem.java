package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.MyAttempt;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem other);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
