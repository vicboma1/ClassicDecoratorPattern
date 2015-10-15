package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class LineBorderDecorator extends JButtonDecoratorImpl {

    public static LineBorderDecorator create(final JButton abstractButton) {
        return new LineBorderDecorator(abstractButton);
    }

    public LineBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public LineBorderDecorator border(final Color color,final int thickness, final boolean isRounder) {
        abstractButton.setBorder(new LineBorder(color, thickness, isRounder));
        return this;
    }
}
