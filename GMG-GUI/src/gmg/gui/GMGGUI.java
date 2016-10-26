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

    private static JFrame guiFrame;
    private static GUI gui;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
       createGUI();
       UdpDummyClass udp = new UdpDummyClass();
       udp.createCameraCapture();
        
    }

    private static void createGUI() {
               guiFrame = new JFrame("Slider");
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setSize(640, 480);
        gui = new GUI();
        guiFrame.setContentPane(gui);
        guiFrame.setVisible(true);
       // gui.importclass(this);
    }
    
}
