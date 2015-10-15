package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class CompoundBorderDecoratorTest {

    private CompoundBorderDecorator compoundBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        compoundBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", compoundBorderDecorator);
        assertTrue("Not same", compoundBorderDecorator.getClass() == CompoundBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final int borderStyle = BevelBorder.LOWERED;
        final Color upper = Color.GREEN;
        final Color lower = Color.CYAN;
        final BevelBorder bevel = new BevelBorder(borderStyle, upper, lower);

        compoundBorderDecorator.border(bevel);

        assertEquals(button.getBorder().getClass(), CompoundBorder.class);
        assertEquals(((CompoundBorder)button.getBorder()).getInsideBorder(),bevel );
    }

    private void createInstance() {
        button = new JButton();
        compoundBorderDecorator = CompoundBorderDecorator.create(button);
    }


}