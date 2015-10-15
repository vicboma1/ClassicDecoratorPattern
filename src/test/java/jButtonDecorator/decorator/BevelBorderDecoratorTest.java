package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class BevelBorderDecoratorTest {

    private BevelBorderDecorator bevelBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        bevelBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", bevelBorderDecorator);
        assertTrue("Not same", bevelBorderDecorator.getClass() == BevelBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final int borderStyle = BevelBorder.LOWERED;
        final Color upper = Color.GREEN;
        final Color lower = Color.CYAN;

        bevelBorderDecorator.border(borderStyle, upper, lower);
        final BevelBorder bevel = new BevelBorder(borderStyle, upper, lower);

        assertEquals(button.getBorder().getClass(), bevel.getClass());
        assertEquals(((BevelBorder)button.getBorder()).getBevelType(), bevel.getBevelType());
        assertEquals(((BevelBorder)button.getBorder()).getHighlightInnerColor(), bevel.getHighlightInnerColor());
        assertEquals(((BevelBorder)button.getBorder()).getShadowInnerColor(), bevel.getShadowInnerColor());
        assertEquals(((BevelBorder)button.getBorder()).getHighlightOuterColor(), bevel.getHighlightOuterColor());
        assertEquals(((BevelBorder)button.getBorder()).getShadowOuterColor(), bevel.getShadowOuterColor());

    }

    private void createInstance() {
        button = new JButton();
        bevelBorderDecorator = BevelBorderDecorator.create(button);
    }

}