/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;

/**
 *
 * @author Julien
 */
public class MyStatusLineElementProvider implements org.openide.awt.StatusLineElementProvider {

    @Override
    public Component getStatusLineElement() {
        MyStatusBar bar = new MyStatusBar();
        return bar;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }
}
