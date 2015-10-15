package window.listener;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.awt.event.WindowEvent;
import java.lang.reflect.Field;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class WindowAdapterBaseTest {

    public static final String CURRENT_RUNTIME = "currentRuntime";
    private WindowAdapterBase windowAdapterBase;

    @Before
    public void setUp() throws Exception {
        windowAdapterBase = WindowAdapterBase.create();
    }

    @After
    public void tearDown() throws Exception {
        windowAdapterBase = null;
    }

    @Test
    public void testCreate() throws Exception {
        windowAdapterBase = new WindowAdapterBase();
        assertNotNull("Is null",windowAdapterBase);
    }

    @Test
    public void testWindowClosing() throws Exception {
        final Runtime spyRuntime = magiaCincoEstrellas();

        final WindowAdapterBase _spy = spy(windowAdapterBase);
        final WindowEvent winClosingEvent = mock(WindowEvent.class);

        doNothing().when(spyRuntime).exit(anyInt());

        _spy.windowClosing(winClosingEvent);
        verify(_spy).windowClosing(winClosingEvent);
    }

    private Runtime magiaCincoEstrellas() throws NoSuchFieldException, IllegalAccessException {
        final Runtime originalRuntime = Runtime.getRuntime();
        final Runtime spyRuntime  = spy(originalRuntime);
        final Field currentRuntime = Runtime.class.getDeclaredField(CURRENT_RUNTIME);
        currentRuntime.setAccessible(true);
        currentRuntime.set(originalRuntime, spyRuntime);
        currentRuntime.setAccessible(false);
        return spyRuntime;
    }
}