/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmg.gui;

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
      //GUI g = new GUI(p);
      //g.setVisible(true);
       JFrame guiFrame = new JFrame("GUI");
      GUI gui = new GUI(p);
        guiFrame.setContentPane(gui);
        guiFrame.setVisible(true);
      
       //UdpDummyClass udp = new UdpDummyClass();
       //udp.createCameraCapture(p);
        
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
