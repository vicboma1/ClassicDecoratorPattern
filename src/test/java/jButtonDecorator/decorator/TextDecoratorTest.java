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
public class TextDecoratorTest {

    private TextDecorator textDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        textDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", textDecorator);
        assertTrue("Not same", textDecorator.getClass() == TextDecorator.class);
    }

    @Test
    public void testText() throws Exception {
        final String text = "Test Button";
        textDecorator.set(text);

        Assert.assertEquals(button.getText().toString(), text);
    }

    private void createInstance() {
        button = new JButton();
        textDecorator = TextDecorator.create(button);
    }

}