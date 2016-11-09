package gmg.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author James Green
 * @version 1.0.0
 * @website http://coffeefueledcreations.com/
 */
public class KeyController implements KeyListener, ActionListener  {
 
    KeyController(){
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() { //Thread safe GUI initilazation
            public void run() {
                createGUI();
            }
        });
    }

    private void createGUI() {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        switch(e.getKeyCode()){
            case 38:
                System.out.println("¨38");
                break;
            case 40:
                System.out.println("40");
                break;
            case 37:
                System.out.println("37");
                break;
            case 39:
                System.out.println("39");
                break;
            case 32:
                System.out.println("32");
                break;
            case 90:
                System.out.println("90");
                break;
            case 88:
                System.out.println("88");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    } 
}