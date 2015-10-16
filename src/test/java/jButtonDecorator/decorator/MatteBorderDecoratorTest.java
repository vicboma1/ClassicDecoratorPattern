package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class MatteBorderDecoratorTest {

    private MatteBorderDecorator matteBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        matteBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", matteBorderDecorator);
        assertTrue("Not same", matteBorderDecorator.getClass() == MatteBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final int top = 9;
        final int left = 3;
        final int bottom = 1;
        final int right = 6;
        final Color matteColor = new Color(174, 2, 126);

        matteBorderDecorator.set(top, left, bottom, right, matteColor);
        final MatteBorder matte = new MatteBorder(top, left, bottom, right, matteColor);

        assertEquals(button.getBorder().getClass(), matte.getClass());
        final MatteBorder border = (MatteBorder) button.getBorder();
        assertEquals(border.getBorderInsets(), matte.getBorderInsets());
        assertEquals(border.getMatteColor(), matte.getMatteColor());
    }

    private void createInstance() {
        button = new JButton();
        matteBorderDecorator = MatteBorderDecorator.create(button);
    }

}