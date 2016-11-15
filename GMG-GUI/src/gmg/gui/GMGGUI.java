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
        
        
        

       // UDPsend udpSend = new UDPsend(4000, "localhost");
        UDPsend udpSend = new UDPsend(4000, "192.168.0.2");
       // UdpRecive udpRecive = new UdpRecive(6000);

        GuiFrame gui = new GuiFrame();
        gui.setSize(200, 200);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gui.addPanel(p);
        gui.addUDPSendSocket(udpSend);
       //zgui.addUDPReciveSocket(udpRecive);
        
        

        gui.pack();
        gui.setVisible(true);

        KeyboardInput k = new KeyboardInput();
        k.run();

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
