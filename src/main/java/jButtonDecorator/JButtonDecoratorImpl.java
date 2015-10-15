package jButtonDecorator;

import javax.swing.*;

/**
 * Created by vicboma on 14/10/15.
 */
public class JButtonDecoratorImpl extends JButton {

    protected JButton abstractButton;

    public JButtonDecoratorImpl(final JButton abstractButton) {
        this.abstractButton = abstractButton;
    }
}
