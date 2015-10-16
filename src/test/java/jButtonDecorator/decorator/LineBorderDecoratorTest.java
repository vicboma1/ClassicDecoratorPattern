package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class LineBorderDecoratorTest {

    private LineBorderDecorator lineBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        lineBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", lineBorderDecorator);
        assertTrue("Not same", lineBorderDecorator.getClass() == LineBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final Color color = Color.GREEN;
        final int thickness = 4;
        final boolean isRounder = true;

        lineBorderDecorator.set(color, thickness, isRounder);
        final LineBorder line = new LineBorder(color, thickness, isRounder);

        assertEquals(button.getBorder().getClass(), line.getClass());
        final LineBorder border = (LineBorder) button.getBorder();
        assertEquals(border.getLineColor(), line.getLineColor());
        assertEquals(border.getRoundedCorners(), line.getRoundedCorners());
        assertEquals(border.getThickness(), line.getThickness());
        assertEquals(border.isBorderOpaque(), line.isBorderOpaque());
    }

    private void createInstance() {
        button = new JButton();
        lineBorderDecorator = LineBorderDecorator.create(button);
    }

}