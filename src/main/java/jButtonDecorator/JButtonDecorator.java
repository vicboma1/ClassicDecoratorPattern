package jButtonDecorator;

import java.awt.event.ActionListener;

/**
 * Created by vicboma on 14/10/15.
 */
public interface JButtonDecorator {
    JButtonDecorator size(final int w,final  int h);
    JButtonDecorator text(final String text);
    JButtonDecorator actionListener(final ActionListener action);
}
