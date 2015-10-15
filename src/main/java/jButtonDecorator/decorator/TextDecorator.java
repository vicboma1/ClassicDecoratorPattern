package jButtonDecorator.decorator;

import jButtonDecorator.JButtonDecoratorImpl;

import javax.swing.*;

/**
 * Created by vicboma on 14/10/15.
 */
public class TextDecorator extends JButtonDecoratorImpl{

    public static TextDecorator create(final JButton abstractButton){
        return new TextDecorator(abstractButton);
    }

    public TextDecorator(final JButton abstractButton) {
        super(abstractButton);
    }

    public TextDecorator text(String text) {
        this.abstractButton.setText(text);
        return this;
    }
}
