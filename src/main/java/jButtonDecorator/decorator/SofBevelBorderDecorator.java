package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class SofBevelBorderDecorator extends JButtonDecoratorImpl {

    public static SofBevelBorderDecorator create(final JButton abstractButton) {
        return new SofBevelBorderDecorator(abstractButton);
    }

    public SofBevelBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public SofBevelBorderDecorator set(final int border, final Color upper, final Color lower) {
        abstractButton.setBorder(new SoftBevelBorder(border,upper,lower));
        return this;
    }
}
