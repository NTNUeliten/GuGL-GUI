/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmg.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javafx.scene.Camera;
import javax.swing.JFrame;
import org.opencv.core.Core;

/**
 *
 * @author Olav Rune
 */
public class GMGGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        Panel p = new Panel();
        p.setSize(600, 400);
        //GUI g = new GUI(p);
        //g.setVisible(true);
        
      GuiFrame gui = new GuiFrame();
      gui.setSize(200, 200);
        //gui.setLayout(new BorderLayout());
       gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
     

      p.setBackground(Color.red); 
      
     gui.addPanel(p);
    //gui.add(p,BorderLayout.CENTER);
     
     gui.pack();
    gui.setVisible(true);
    
        KeyboardInput k = new KeyboardInput();
        k.run();
       
     
      
        /*
        JFrame guiFrame = new JFrame("GUI");
        GUI gui = new GUI(p);
        //guiFrame.setContentPane(gui);
        p.setBackground(Color.red);
        guiFrame.add(gui);
      
        //guiFrame.add(p);
       
        guiFrame.setVisible(true);
        //UdpDummyClass udp = new UdpDummyClass();
        //udp.createCameraCapture(p);
        */

    }

    private void createGUI() {

        /*
          panel = new Panel();
        
               guiFrame = new JFrame("GUI");
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setSize(640, 480);
        gui = new GUI(panel);
        guiFrame.setContentPane(gui);
        guiFrame.setVisible(true);
         */
        // gui.importclass(this);
    }

}
