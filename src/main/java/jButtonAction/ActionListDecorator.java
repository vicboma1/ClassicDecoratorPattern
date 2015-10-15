package jButtonAction;

import jButtonDecorator.decorator.*;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vicboma on 15/10/15.
 */
public class ActionListDecorator {

    public static final String DECORATOR = "Decorator";
    public static final String PRESSED_BR_CHANGED_MY_FOREGROUND_COLOR_CENTER_HTML = " Pressed <br/>Decorated my foreground color</center></html>";
    public static final String HTML_CENTER_BUTTON = "<html><center>Button ";

    private List<ActionButton> listActions;

    public static ActionListDecorator create() {
        return new ActionListDecorator(_listActions);
    }

    public ActionListDecorator(final List<ActionButton> listActions) {
        this.listActions = listActions;
    }

    public ActionButton get(final int index) {
        return this.listActions.get(index);
    }

    public static final Color COLOR_FOREGROUND_LINE = new Color(158, 89, 0);
    private static List<ActionButton> _listActions = new ArrayList<ActionButton>() {
        {
            add((button, index) ->
                            lineBorder(button, index, new Color(4, 199, 216), 7, false)
            );
            add((button, index) ->
                            tiledBorder(button, index, DECORATOR)
            );
            add((button, index) ->
                lineBorder(button, index, new Color(255, 182, 5), 4, true)
            );
            add((button, index) ->
                matterBorder(button, index, 9, 3, 1, 6, new Color(174, 2, 126))
            );
            add((button, index) ->
                sofBevelBorder(button, index)
            );
            add((button, index) ->
                lineBorder(button, index, Color.MAGENTA, 4, true)
            );
            add((button, index) ->
                matterBorder(button, index, 5, 7, 3, 1, new Color(212, 234, 13))
            );
            add((button, index) ->
                matterBorder(button, index, 2, 4, 6, 9, Color.blue)
            );
            add((button, index) ->
                bevelBorder(button, index, BevelBorder.LOWERED, Color.GREEN, Color.CYAN)
            );
            add((button, index) ->
                etchedBorder(button, index, EtchedBorder.LOWERED, Color.BLUE, Color.GREEN)
            );
            add((button, index) ->
                etchedBorder(button, index, EtchedBorder.RAISED, Color.BLACK, Color.YELLOW)
            );
            add((button, index) ->
                lineBorder(button, index, new Color(4, 199, 216), 7, false)
            );
            add((button, index) ->
                lineBorder(button, index, Color.MAGENTA, 4, true)
            );
            add((button, index) ->
                lineBorder(button, index, Color.RED, 4, true)
            );
            add((button, index) ->
                matterBorder(button, index, 2, 4, 6, 9, Color.blue)
            );
            add((button, index) ->
                bevelBorder(button, index, BevelBorder.RAISED, Color.YELLOW, Color.BLACK)
            );
            add((button, index) ->
                lineBorder(button, index, new Color(255, 182, 5), 4, true)
            );
            add((button, index) ->
                etchedBorder(button, index, EtchedBorder.LOWERED, new Color(15, 197, 112), new Color(84, 92, 110))
            );
            add((button, index) ->
                tiledBorder(button, index, DECORATOR)
            );
            add((button, index) ->
                matterBorder(button, index, 9, 3, 9, 1, new Color(164, 81, 165))
            );
            add((button, index) ->
                lineBorder(button, index, new Color(0, 255, 134), 7, false)
            );
            add((button, index) ->
                matterBorder(button, index, 5, 7, 3, 1, new Color(212, 234, 13))
            );
            add((button, index) ->
                matterBorder(button, index, 2, 9, 1, 9, new Color(143, 35, 255))
            );
            add((button, index) ->
                compouserBorder(button)
            );
        }

        private JButton etchedBorder(JButton button, int index, int lowered, Color blue, Color green) {
            EtchedBorderDecorator.create(button).border(lowered, blue, green);
            actionListener(button, index, new Color(54, 156, 138));
            return button;
        }

        private JButton lineBorder(JButton button, int index, Color color, int thickness, boolean isRounder) {
            LineBorderDecorator.create(button).border(color, thickness, isRounder);
            actionListener(button, index, COLOR_FOREGROUND_LINE);
            return button;
        }

        private JButton sofBevelBorder(JButton button, int index) {
            SofBevelBorderDecorator.create(button).border(BevelBorder.LOWERED, Color.BLUE, Color.RED);
            actionListener(button, index, new Color(7, 145, 44));
            return button;
        }

        private JButton bevelBorder(JButton button, int index, int raised, Color yellow, Color black) {
            BevelBorderDecorator.create(button).border(raised, yellow, black);
            actionListener(button, index, new Color(146, 106, 163));
            return button;
        }

        private JButton matterBorder(JButton button, int index, int top, int left, int bottom, int right, Color matteColor) {
            MatteBorderDecorator.create(button).border(top, left, bottom, right, matteColor);
            actionListener(button, index, new Color(186, 82, 83));
            return button;
        }

        private JButton tiledBorder(JButton button, int index, String titled) {
            TitledBorderDecorator.create(button).border(titled);
            actionListener(button, index, new Color(255, 71, 197));
            return button;
        }

        private JButton compouserBorder(JButton button) {
            Border redBorder = BorderFactory.createLineBorder(Color.RED, 2);
            Border orangeBorder = BorderFactory.createLineBorder(Color.BLUE, 2);
            Border yellowBorder = BorderFactory.createLineBorder(Color.YELLOW, 5);
            Border greenBorder = BorderFactory.createLineBorder(Color.GREEN, 2);
            Border blueBorder = BorderFactory.createLineBorder(Color.ORANGE, 4);
            Border magentaBorder = BorderFactory.createLineBorder(Color.MAGENTA, 3);
            MatteBorder matteBorder = new MatteBorder(2, 4, 6, 9, Color.blue);
            Border twoColorBorder = new CompoundBorder(magentaBorder, blueBorder);
            Border threeColorBorder = new CompoundBorder(twoColorBorder, greenBorder);
            Border fourColorBorder = new CompoundBorder(threeColorBorder, yellowBorder);
            Border fiveColorBorder = new CompoundBorder(fourColorBorder, orangeBorder);
            Border sixColorBorder = new CompoundBorder(fiveColorBorder, redBorder);
            Border sevenCompouser = new CompoundBorder(matteBorder, sixColorBorder);
            TitledBorderDecorator.create(button).border(DECORATOR);
            CompoundBorderDecorator.create(button).border(sevenCompouser);
            return button;
        }

        private void actionListener(JButton button, final int index, Color colorForeground) {
            ActionListenerDecorator.create(button).actionListener(e -> {
                button.setText(HTML_CENTER_BUTTON + index + PRESSED_BR_CHANGED_MY_FOREGROUND_COLOR_CENTER_HTML);
                button.setForeground(colorForeground);
            });
        }
    };
}
