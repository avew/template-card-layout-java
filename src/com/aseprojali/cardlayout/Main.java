/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aseprojali.cardlayout;

import com.aseprojali.cardlayout.frame.Frame;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ave
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new WindowsLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame f = new Frame();
                f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                f.setVisible(true);
                
                //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
