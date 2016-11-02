package gmg.gui;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

/**
 *
 * @author Olav Rune
 */
public class UdpRecive {

    private JFrame cameraFrame;
    private Panel cameraPanel;
    private VideoCapture capture;
    private Mat webcam_image;
    private final int PORT;
    private static final int PARAMS = 6;
    private DatagramSocket socket;
    private DatagramPacket datagram;
    
    
       public UdpRecive(int PORT) {
        
        this.PORT = PORT;
       byte[] buf = new byte[PARAMS];
        datagram = new DatagramPacket(buf, buf.length);
        try {
            socket = new DatagramSocket(this.PORT);
        } catch (SocketException ex) {
            Logger.getLogger(UdpRecive.class.getName()).log(Level.SEVERE, null, ex);
        }

       // createGUI();
     
    }
    
    public void createCameraCapture(Panel panel){
        
        this.cameraPanel = panel;
        // System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
   
            cameraFrame = new JFrame("Camera");
            cameraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     
            cameraFrame.setSize(640, 480);
            cameraFrame.setBounds(0, 0, cameraFrame.getWidth(), cameraFrame.getHeight());
            //cameraPanel = new Panel();
            cameraFrame.setContentPane(cameraPanel);
            cameraFrame.setVisible(true);
        capture = new VideoCapture(0);
        //capture.set(3,1920);
        // capture.set(4,1080);
        //capture.set(5,40);
        // capture.se(CV_CAP_PROP_,3);
        // capture.set(15, -2);
        capture.set(3, 400);
        capture.set(4, 500);
        //capture.set(3, 1366);
        //capture.set(4, 768);
        //capture.set(15, -2); 
        webcam_image = new Mat();
             cameraFrame.setSize(webcam_image.width() + 40, webcam_image.height() + 60);

        capture.read(webcam_image);
           cameraPanel.setimagewithMat(webcam_image);
            cameraFrame.repaint();
            
            while(true){
                 capture.read(webcam_image);
     cameraPanel.setimagewithMat(webcam_image);
                 cameraFrame.repaint();
            }
    }
    
    
        public byte[] receiveParam() throws IOException{
        socket.receive(datagram);
        byte[] datagramData = datagram.getData();
        return datagramData;
    }
    
}
