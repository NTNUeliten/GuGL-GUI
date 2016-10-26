/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmg.gui;

import javax.swing.JFrame;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.VideoCapture;

/**
 *
 * @author Olav Rune
 */
public class UdpDummyClass {

    private JFrame cameraFrame;
    private Panel cameraPanel;
    private VideoCapture capture;
    private Mat webcam_image;
    
    
    
    
    public void createCameraCapture(){
        
        // System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
   
            cameraFrame = new JFrame("Camera");
            cameraFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
     
            cameraFrame.setSize(640, 480);
            cameraFrame.setBounds(0, 0, cameraFrame.getWidth(), cameraFrame.getHeight());
            cameraPanel = new Panel();
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
    
}

