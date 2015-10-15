package window.listener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by vicboma on 14/10/15.
 */
public class WindowAdapterBase extends WindowAdapter {


    public static WindowAdapterBase create(){
        return new WindowAdapterBase();
    }

    public WindowAdapterBase() {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
        System.exit(0);
    }
}
