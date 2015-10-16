package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import java.awt.*;

/**
 * Created by vicboma on 14/10/15.
 */
public class ForegroundDecorator extends JButtonDecoratorImpl{

    public static ForegroundDecorator create(final JButton button){
        return new ForegroundDecorator(button);
    }

    public ForegroundDecorator(final JButton button) {
        super(button);
    }

    public ForegroundDecorator set(Color color) {
        abstractButton.setForeground(color);
        return this;
    }

}
