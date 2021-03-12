package Section_11_NamingConventions_Packages_Static_Final_KWs.Packages.awtSample;

// Continued from 142. Packages...

// awt = Abstract Window Toolkit
import java.awt.*;
// N.B. - java.awt is a SEPARATE package to java.awt.event (that's why * doesn't also import .event), even
//        though event is a sub-package of awt
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            // Called when the window is in the process of being closed
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) { // THIS COMES FROM WINDOW - Which is extended by Frame
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("By Tim Buchalka", 60, 100);
    }
}
