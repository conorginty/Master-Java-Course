package Section_9_InnerAndAbstractClassesAndInterfaces.Interface_Parts.Challenge.Solution;

import java.util.List;

public interface ISaveable {
    public List<String> write();
    public void read(List<String> savedValues);
}
