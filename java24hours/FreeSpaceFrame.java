package java24hours;

import java.awt.*;
import javax.swing.*;

public class FreeSpaceFrame extends JFrame {
    public FreeSpaceFrame() {
        super("Disk Free Space");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        FreeSpacePanel freePanel = new FreeSpacePanel();
        add(freePanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        FreeSpaceFrame frame = new FreeSpaceFrame();
    }
    }