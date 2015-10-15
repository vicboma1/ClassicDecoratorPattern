package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class BevelBorderDecorator extends JButtonDecoratorImpl {

    public static BevelBorderDecorator create(final JButton abstractButton) {
        return new BevelBorderDecorator(abstractButton);
    }

    public BevelBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public BevelBorderDecorator border(final int border, final Color upper, final Color lower) {
        abstractButton.setBorder(new BevelBorder(border,upper,lower));
        return this;
    }
}
