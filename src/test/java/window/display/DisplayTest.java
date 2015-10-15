package window.display;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import window.listener.WindowAdapterBase;

import javax.swing.*;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * Created by vicboma on 15/10/15.
 */
public class DisplayTest {

    private Display display;

    @Before
    public void setUp() throws Exception {
        createDisplay();
    }

    @After
    public void tearDown() throws Exception {
        display = null;
    }

    @Test
    public void testCreate() throws Exception {
        createDisplay();
        assertNotNull("Is null", display);
    }

    @Test
    public void testAddComponentPanel() throws Exception {
        final JPanel panel = new JPanel();
        final Display displaySpy = spy(display);
        displaySpy.addComponentPanel(panel);
        verify(displaySpy).addComponentPanel(panel);
    }

    @Test
    public void testValidate() throws Exception {
        final Display displaySpy = spy(display);
        displaySpy.validate();
        verify(displaySpy).validate();
    }

    private void createDisplay() {
        final JPanel jpanel = new JPanel();
        final WindowAdapterBase windowAdapterBase = WindowAdapterBase.create();
        final JFrame frame = new JFrame(Display.DECORATOR_PATTERN);
        display = Display.create(frame, jpanel, windowAdapterBase);
    }
}