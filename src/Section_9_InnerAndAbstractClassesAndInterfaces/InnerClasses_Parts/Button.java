package Section_9_InnerAndAbstractClassesAndInterfaces.InnerClasses_Parts;

// 3. local class (inner class that's defined inside of a scope block - usually a method)
// - Their scope is restricted completely to that block
// - Used very seldom

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Use this setter to assign an object to the button in order to be able to handle clicks
    // This is passed an OnClickListener parameter, and then we set the field to the value that's passed to it
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // We're passing on the fact that there's been a click, which is using the OnClickListener field,
    // calling the onClick method itself
    public void onClick() {
        this.onClickListener.onClick(title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
