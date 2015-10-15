package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class SofBevelBorderDecoratorTest {

    private SofBevelBorderDecorator sofBevelBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        sofBevelBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", sofBevelBorderDecorator);
        assertTrue("Not same", sofBevelBorderDecorator.getClass() == SofBevelBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final int borderStyle = SoftBevelBorder.LOWERED;
        final Color upper = Color.GREEN;
        final Color lower = Color.CYAN;

        final SoftBevelBorder softBevelBorder = new SoftBevelBorder(borderStyle, upper, lower);
        sofBevelBorderDecorator.border(borderStyle, upper, lower);

        final SoftBevelBorder border = (SoftBevelBorder)button.getBorder();
        assertEquals(border.getClass(), SoftBevelBorder.class);
        assertEquals(border.getBevelType(), softBevelBorder.getBevelType());
        assertEquals(border.getHighlightInnerColor(), softBevelBorder.getHighlightInnerColor());
        assertEquals(border.getHighlightOuterColor(), softBevelBorder.getHighlightOuterColor());
        assertEquals(border.getShadowInnerColor(), softBevelBorder.getShadowInnerColor());
        assertEquals(border.getShadowOuterColor(), softBevelBorder.getShadowOuterColor());
    }

    private void createInstance() {
        button = new JButton();
        sofBevelBorderDecorator = SofBevelBorderDecorator.create(button);
    }


}