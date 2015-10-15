package jButtonDecorator;

import org.junit.Test;

import javax.swing.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by vicboma on 15/10/15.
 */
public class JButtonDecoratorImplTest {
    @Test
    public void create() throws Exception {
        final JButton buttonMock = mock(JButton.class);
        final JButtonDecoratorImpl jButtonDecorator = new JButtonDecoratorImpl(buttonMock);
        assertNotNull("Is null", jButtonDecorator);
        assertTrue("Not same class", jButtonDecorator.getClass() == JButtonDecoratorImpl.class);
    }

}