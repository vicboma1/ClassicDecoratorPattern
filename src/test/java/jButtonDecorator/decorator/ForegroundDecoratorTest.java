package jButtonDecorator.decorator;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 17/10/15.
 */
public class ForegroundDecoratorTest {

    private ForegroundDecorator foregroundDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        foregroundDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", foregroundDecorator);
        assertTrue("Not same", foregroundDecorator.getClass() == ForegroundDecorator.class);
    }

    @Test
    public void testForeground() throws Exception {
        final Color orange = Color.orange;
        foregroundDecorator.set(orange);

        Assert.assertEquals(button.getForeground(), orange);
    }

    private void createInstance() {
        button = new JButton();
        foregroundDecorator = ForegroundDecorator.create(button);
    }

}