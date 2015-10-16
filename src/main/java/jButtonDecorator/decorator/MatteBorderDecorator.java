package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class MatteBorderDecorator extends JButtonDecoratorImpl {

    public static MatteBorderDecorator create(final JButton abstractButton) {
        return new MatteBorderDecorator(abstractButton);
    }

    public MatteBorderDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public MatteBorderDecorator set(final int top, final int left, final int bottom, final int right, final Color matteColor) {
        abstractButton.setBorder(new MatteBorder(top, left, bottom, right, matteColor));
        return this;
    }
}
