package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionListener;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Created by vicboma on 15/10/15.
 */
public class ActionListenerDecoratorTest {

    private ActionListenerDecorator actionlistenerDecorator;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        actionlistenerDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", actionlistenerDecorator);
        assertTrue("Not same", actionlistenerDecorator.getClass() == ActionListenerDecorator.class);
    }

    @Test
    public void testActionListener() throws Exception {
        final ActionListener listener = (event) -> {};
        final ActionListenerDecorator actionListenerDecoratorSpy = spy(actionlistenerDecorator);
        actionListenerDecoratorSpy.actionListener(listener);
        verify(actionListenerDecoratorSpy).actionListener(listener);
    }

    private void createInstance() {
        final JButton button = mock(JButton.class);
        actionlistenerDecorator = ActionListenerDecorator.create(button);
    }
}