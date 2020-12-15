package com.zeoblocks.learning.interfaces.timer;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Created with IntelliJ IDEA. 15.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class TestTimerClass {
    public static void main(String[] args) {
        TimerClass listener = new TimerClass();
        Timer timer = new Timer(1000,listener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit?");

        System.exit(0);
    }
}
