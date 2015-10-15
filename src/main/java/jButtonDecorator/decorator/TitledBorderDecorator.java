package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Created by vicboma on 15/10/15.
 */
public class TitledBorderDecorator extends JButtonDecoratorImpl {

    public static TitledBorderDecorator create(final JButton abstractButton) {
        return new TitledBorderDecorator(abstractButton);
    }

    public TitledBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public TitledBorderDecorator border(String title) {
        abstractButton.setBorder(new TitledBorder(title));
        return this;
    }
}
