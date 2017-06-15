import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    public Crisis() {
        super("Crisis");
        setLookAndFeel();
        setSize(300, 200);
        //BorderLayout crisisLayout = new BorderLayout();
        //setLayout(crisisLayout);
        //GridLayout grid = new GridLayout(3, 2);
        //setLayout(grid);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //FlowLayout flo = new FlowLayout();
        //setLayout(flo);


        panicButton = new JButton("Panic");
        dontPanicButton = new JButton("Don't panic");
        blameButton = new JButton("Blame others");
        mediaButton = new JButton("Nofify the media");
        saveButton = new JButton("Save Yourself");

        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
        pane.setLayout(box);
        pane.add(panicButton);
        pane.add(dontPanicButton);
        pane.add(blameButton);
        pane.add(mediaButton);
        pane.add(saveButton);
        add(pane);
        setVisible(true);

    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            //ignore error
        }
    }

    public Insets getInsets() {
        Insets squeeze = new Insets(50, 15, 50, 15);
        return squeeze;
    }

    public static void main(String[] args) {
        Crisis frame = new Crisis();
    }

}