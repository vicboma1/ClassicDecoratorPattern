package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class EtchedBorderDecorator extends JButtonDecoratorImpl {

    public static EtchedBorderDecorator create(final JButton abstractButton) {
        return new EtchedBorderDecorator(abstractButton);
    }

    public EtchedBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public EtchedBorderDecorator border(final int border, final Color upper, final Color lower) {
        abstractButton.setBorder(new EtchedBorder(border,upper,lower));
        return this;
    }
}
