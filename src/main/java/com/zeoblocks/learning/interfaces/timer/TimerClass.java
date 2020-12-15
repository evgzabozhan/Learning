package com.zeoblocks.learning.interfaces.timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA. 15.12.2020
 *
 * @author Evgeniy Zabozhan (evgzabozhan@gmail.com)
 * @version $
 * @since 1.0
 */
public class TimerClass implements ActionListener {
    @Override
    public void actionPerformed(final ActionEvent e) {
        System.out.println("TIME " + e.getWhen());
        Toolkit.getDefaultToolkit().beep();
    }
}
