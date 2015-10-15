package window.display;

import window.listener.WindowAdapterBase;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vicboma on 14/10/15.
 */
public class Display {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 800;
    public static final String DECORATOR_PATTERN = "Decorator Pattern";
    public static final Color BLUE = Color.blue;
    public static final boolean False = Boolean.FALSE;
    public static final boolean TRUE = Boolean.TRUE;
    public static final Component NULLABLE = null;

    private JPanel panel;

    public static Display create(final JFrame frame,final JPanel panel, final WindowAdapterBase windowAdapterBase) {
        return new Display(frame,panel,windowAdapterBase);
    }

    public Display(final JFrame frame, final JPanel panel, final WindowAdapterBase windowAdapterBase){
        this.panel = panel;
        frame.setVisible(False);
        frame.getContentPane().add(panel);
        frame.addWindowListener(windowAdapterBase);
        frame.setSize(WIDTH, HEIGHT);
        frame.setBackground(BLUE);
        frame.setResizable(False);
        frame.setLocationRelativeTo(NULLABLE);
        frame.validate();
        frame.setVisible(TRUE);
    }

    public Display addComponentPanel(final JComponent component){
        this.panel.add(component);
        return this;
    }

    public Display validate(){
        this.panel.validate();
        return this;
    }
}
