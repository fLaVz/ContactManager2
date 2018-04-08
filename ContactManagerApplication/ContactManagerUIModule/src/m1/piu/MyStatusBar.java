/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import javax.swing.JLabel;

/**
 *
 * @author Julien
 */
public class MyStatusBar extends javax.swing.JLabel {
        
    JLabel contactLabel;
    public MyStatusBar() {
        contactLabel = new JLabel();
        contactLabel.setText("Un contact");
    }
}
