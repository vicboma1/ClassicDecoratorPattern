package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

/**
 * Created by vicboma on 15/10/15.
 */
public class CompoundBorderDecorator extends JButtonDecoratorImpl {

    public static CompoundBorderDecorator create(final JButton abstractButton) {
        return new CompoundBorderDecorator(abstractButton);
    }

    public CompoundBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public CompoundBorderDecorator border(final Border border2) {
        abstractButton.setBorder(new CompoundBorder(abstractButton.getBorder(),border2));
        return this;
    }
}
