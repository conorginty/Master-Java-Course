package Section_11_NamingConventions_Packages_Static_Final_KWs.Packages.com.example.game;

import java.util.List;

public interface ISaveable {
    public List<String> write();
    public void read(List<String> savedValues);
}
