package jButtonDecorator.decorator;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class SizeDecoratorTest {

    private SizeDecorator sizeDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        sizeDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", sizeDecorator);
        assertTrue("Not same", sizeDecorator.getClass() == SizeDecorator.class);
    }

    @Test
    public void testSize() throws Exception {
        final int h = 190;
        final int w = 200;
        sizeDecorator.size(w, h);

        Assert.assertTrue((int) button.getPreferredSize().getHeight() == h);
        Assert.assertTrue((int) button.getPreferredSize().getWidth() == w);
    }

    private void createInstance() {
        button = new JButton();
        sizeDecorator = SizeDecorator.create(button);
    }
}