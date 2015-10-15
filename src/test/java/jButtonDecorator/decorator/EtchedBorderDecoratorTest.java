package jButtonDecorator.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.border.BevelBorder;
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

        etchedBorderDecorator.border(borderStyle, upper, lower);
        final EtchedBorder etchedBorder = new EtchedBorder(borderStyle, upper, lower);

        assertEquals(button.getBorder().getClass(), etchedBorder.getClass());
        assertEquals(((EtchedBorder)button.getBorder()).getEtchType(), etchedBorder.getEtchType());
        assertEquals(((EtchedBorder)button.getBorder()).getHighlightColor(), etchedBorder.getHighlightColor());
        assertEquals(((EtchedBorder)button.getBorder()).getShadowColor(), etchedBorder.getShadowColor());
        assertEquals((button.getBorder()).isBorderOpaque(), etchedBorder.isBorderOpaque());

    }

    private void createInstance() {
        button = new JButton();
        etchedBorderDecorator = EtchedBorderDecorator.create(button);
    }
}