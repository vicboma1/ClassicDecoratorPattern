package jButtonAction;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.util.stream.IntStream;

import static junit.framework.Assert.*;

/**
 * Created by vicboma on 15/10/15.
 */
public class ActionListDecoratorTest {

    public static final int START_INCLUSIVE = 0;
    public static final int END_EXCLUSIVE = 24;

    private ActionListDecorator actionListDecorator;

    @Before
    public void setUp() throws Exception {
        createInstance();
    }

    @After
    public void tearDown() throws Exception {
        actionListDecorator = null;
    }

    @Test
    public void testCreate() throws Exception {
        createInstance();
        assertNotNull("Is null", actionListDecorator);
    }

    @Test
    public void testGet() throws Exception {
        IntStream
                .range(START_INCLUSIVE, END_EXCLUSIVE)
                .boxed()
                .forEach(i -> {
                    final JButton button = new JButton();
                    runDecorator(i,button);
                });
    }

    @Test
    public void testGetAndActionCallBack() throws Exception {

        JButton buttonOnClick = new JButton();
        assertNotSame(buttonOnClick.getForeground(),ActionListDecorator.COLOR_FOREGROUND_LINE);
        runDecorator(0, buttonOnClick);
        buttonOnClick.doClick();
        assertEquals(buttonOnClick.getForeground(),ActionListDecorator.COLOR_FOREGROUND_LINE);
    }

    private void runDecorator(Integer i,final JButton button) {
        final JButton decoratedButton = getActionButton(i, button);
        Assert.assertEquals(button, decoratedButton);
    }

    private JButton getActionButton(Integer i, JButton button) {
        final ActionButton actionButton = actionListDecorator.get(i);
        return actionButton.run(button, i);
    }

    private void createInstance() {
        actionListDecorator = ActionListDecorator.create();
    }

}