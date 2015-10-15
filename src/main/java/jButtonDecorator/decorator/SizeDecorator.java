package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vicboma on 14/10/15.
 */
public class SizeDecorator extends JButtonDecoratorImpl{

    public static SizeDecorator create(final JButton abstractButton){
        return new SizeDecorator(abstractButton);
    }

    public SizeDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public SizeDecorator size(final int w,final int h) {
        final Dimension preferredSize = new Dimension(w, h);
        abstractButton.setPreferredSize(preferredSize);
        return this;
    }

}
