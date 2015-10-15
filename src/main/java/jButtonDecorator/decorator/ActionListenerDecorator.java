package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by vicboma on 14/10/15.
 */
public class ActionListenerDecorator extends JButtonDecoratorImpl{

    public static ActionListenerDecorator create(final JButton abstractButton){
        return new ActionListenerDecorator(abstractButton);
    }

    public ActionListenerDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public ActionListenerDecorator actionListener(final ActionListener action) {
        abstractButton.addActionListener(action);
        return this;
    }

}
