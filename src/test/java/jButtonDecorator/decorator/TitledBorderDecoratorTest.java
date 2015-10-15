package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class TitledBorderDecoratorTest {
    private TitledBorderDecorator titledBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        titledBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", titledBorderDecorator);
        assertTrue("Not same", titledBorderDecorator.getClass() == TitledBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final String title = "Decorator pattern";
        titledBorderDecorator.border(title);
        assertEquals(((TitledBorder)button.getBorder()).getTitle(),title);
    }

    private void createInstance() {
        button = new JButton();
        titledBorderDecorator = TitledBorderDecorator.create(button);
    }
}