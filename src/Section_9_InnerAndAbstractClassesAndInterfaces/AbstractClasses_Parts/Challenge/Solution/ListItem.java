package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.Solution;

public abstract class ListItem {
    // protected so concrete subclasses can access them
    // Could've left the access modifier off (would've made the member variables package-private), so subclasses
    // in the same package would be able to access them, BUT not subclasses in other classes (potential problem)
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    // Constructor to be used by subclasses
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
