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
        setSize(600, 150);
        BorderLayout crisisLayout = new BorderLayout();
        setLayout(crisisLayout);
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
        add(panicButton, BorderLayout.NORTH);
        add(dontPanicButton, BorderLayout.SOUTH);
        add(blameButton, BorderLayout.EAST);
        add(mediaButton, BorderLayout.WEST);
        add(saveButton, BorderLayout.CENTER);
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

    public static void main(String[] args) {
        Crisis frame = new Crisis();
    }

}