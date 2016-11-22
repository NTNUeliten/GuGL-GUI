package gmg.gui;

import javax.swing.JFrame;
import org.opencv.core.Core;

/**
 *
 * @author Olav Rune, såklart
 */
public class GMGGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Load the core library for unknown but very important reasons
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Creating the GUI
        GuiFrame gui = new GuiFrame();
        gui.setSize(200, 200);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel p = new Panel();
        p.setSize(600, 400);
        gui.addPanel(p);

        // Creating the UDP send class, and making it available from the GUI.
        UDPsend udpSend = new UDPsend(4000, "192.168.0.2");
        gui.addUDPSendSocket(udpSend);

        // UDP recive, for future incomming videostream
        // UdpRecive udpRecive = new UdpRecive(6000);
        //gui.addUDPReciveSocket(udpRecive);
        
        gui.pack();
        gui.setVisible(true);

    }


}
