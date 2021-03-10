package Section_9_InnerAndAbstractClassesAndInterfaces.AbstractClasses_Parts.Challenge.MyAttempt;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        rightLink = item;
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        leftLink = item;
        return leftLink;
    }

    @Override
    int compareTo(ListItem other) {
        if (other != null) {
            String strValue = (String) super.getValue();
            String otherValue = (String) other.getValue();
            return (strValue.compareTo(otherValue));
        } else {
            return -1;
        }
    }
}
