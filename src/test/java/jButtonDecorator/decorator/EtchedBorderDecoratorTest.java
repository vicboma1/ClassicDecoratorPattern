package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vicboma on 15/10/15.
 */
public class EtchedBorderDecoratorTest {

    private EtchedBorderDecorator etchedBorderDecorator;
    private JButton button;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        etchedBorderDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        assertNotNull("Is null", etchedBorderDecorator);
        assertTrue("Not same", etchedBorderDecorator.getClass() == EtchedBorderDecorator.class);
    }

    @Test
    public void testBorder() throws Exception {
        final int borderStyle = BevelBorder.LOWERED;
        final Color upper = Color.GREEN;
        final Color lower = Color.CYAN;

        etchedBorderDecorator.set(borderStyle, upper, lower);
        final EtchedBorder etchedBorder = new EtchedBorder(borderStyle, upper, lower);

        final Border border = button.getBorder();
        assertEquals(border.getClass(), etchedBorder.getClass());
        assertEquals(((EtchedBorder) border).getEtchType(), etchedBorder.getEtchType());
        assertEquals(((EtchedBorder) border).getHighlightColor(), etchedBorder.getHighlightColor());
        assertEquals(((EtchedBorder) border).getShadowColor(), etchedBorder.getShadowColor());
        assertEquals(border.isBorderOpaque(), etchedBorder.isBorderOpaque());

    }

    private void createInstance() {
        button = new JButton();
        etchedBorderDecorator = EtchedBorderDecorator.create(button);
    }
}