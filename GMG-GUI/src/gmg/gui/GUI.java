package gmg.gui;




import java.awt.Color;
import java.awt.image.BufferedImage;
import jdk.nashorn.internal.scripts.JS;
import org.opencv.core.Mat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olav Rune
 */
public class GUI extends javax.swing.JPanel {
    
    int hueVal;    
    int satVal;
    int valVal;
   // UDPrecive udpRecive;
    
  
    
    /**
     * Creates new form GUI
     * @param panel
     */
    public GUI(Panel panel) {
        initComponents();
        
        cameraPanel.add(panel);
        panel.setBackground(Color.GREEN);
        
        panel.setVisible(true);
        //ledObjectTrack l = new ledObjectTrack();
       cameraPanel.setVisible(true);
       // cameraPanel.setBackground(Color.red);
        Mat image;
   
  
   //cameraPanel.add(panel);
           
         
     

    }
    

    int setValueIncrement = 5;
    
    
    public void setImage(BufferedImage image){
        
      
   
     
    }
    

    public void setHueVal(int hueVal) {
        this.hueVal = hueVal;
   
    }


    public void setSatVal(int satVal) {
        this.satVal = satVal;
    }

    public void setValVal(int valVal) {
        this.valVal = valVal;
    }

 

     
     public int getHueMinValue(){
         
        int min = hueMinSlider.getValue();
        
        hueMinValue.setText(String.valueOf(min));
        
         
         return min;
     }
     public double[] getValues(){
         
         return null;
     }
     
      public int getHueMaxValue(){
       
        int max = hueMaxSlider.getValue();
        hueMaxValue.setText(String.valueOf(max));
       
         return max;
     }
           public int getSaturationMinValue(){
         
        int min = saturationMinSlider.getValue();
        
        saturationMinValue.setText(String.valueOf(min));
        
         
         return min;
     }
     
      public int getSaturationeMaxValue(){
       
        int max = SaturationMaxSlider.getValue();
        saturationMaxValue.setText(String.valueOf(max));
       
         return max;
     }
     
      public int getValueMinValue(){
         
        int min = valueMinSlider.getValue();
        
        valueMinValue.setText(String.valueOf(min));
        
         
         return min;
     }
     
      public int getValueMaxValue(){
       
        int max = valueMaxSlider.getValue();
        valueMaxValue.setText(String.valueOf(max));
       
         return max;
     }
      public double[] getHsvMinValues(){
           double[] d = new double[]{hueMinSlider.getValue(), saturationMinSlider.getValue(), valueMinSlider.getValue()};
           return d;
      }
       public double[] getHsvMaxValues(){
           double[] d = new double[]{hueMaxSlider.getValue(), SaturationMaxSlider.getValue(), valueMaxSlider.getValue()};
           return d;
      }
     
     
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        valueMaxSlider = new javax.swing.JSlider();
        hueMinSlider = new javax.swing.JSlider();
        hueMaxSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        hueMaxValue = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hueMinValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saturationMaxValue = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        saturationMinSlider = new javax.swing.JSlider();
        saturationMinValue = new javax.swing.JTextField();
        SaturationMaxSlider = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        valueMaxValue = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        valueMinSlider = new javax.swing.JSlider();
        valueMinValue = new javax.swing.JTextField();
        importHue = new javax.swing.JTextField();
        importSaturation = new javax.swing.JTextField();
        importValue = new javax.swing.JTextField();
        importValueBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        addValuesBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cameraPanel = new Panel();

        valueMaxSlider.setMaximum(255);
        valueMaxSlider.setValue(206);
        valueMaxSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valueMaxSliderStateChanged(evt);
            }
        });

        hueMinSlider.setMaximum(200);
        hueMinSlider.setToolTipText("");
        hueMinSlider.setValue(29);
        hueMinSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hueMinSliderStateChanged(evt);
            }
        });

        hueMaxSlider.setMaximum(255);
        hueMaxSlider.setValue(92);
        hueMaxSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hueMaxSliderStateChanged(evt);
            }
        });

        jLabel3.setText("Hue min");

        hueMaxValue.setText("1000");
        hueMaxValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hueMaxValueActionPerformed(evt);
            }
        });

        jLabel6.setText("Hue max");

        hueMinValue.setText("1000");
        hueMinValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hueMinValueActionPerformed(evt);
            }
        });

        jLabel7.setText("Saturation min");

        saturationMaxValue.setText("1000");
        saturationMaxValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturationMaxValueActionPerformed(evt);
            }
        });

        jLabel8.setText("Saturation max");

        saturationMinSlider.setMaximum(255);
        saturationMinSlider.setToolTipText("");
        saturationMinSlider.setValue(25);
        saturationMinSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                saturationMinSliderStateChanged(evt);
            }
        });

        saturationMinValue.setText("1000");
        saturationMinValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturationMinValueActionPerformed(evt);
            }
        });

        SaturationMaxSlider.setMaximum(255);
        SaturationMaxSlider.setToolTipText("");
        SaturationMaxSlider.setValue(125);
        SaturationMaxSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SaturationMaxSliderStateChanged(evt);
            }
        });

        jLabel9.setText("Value min");

        valueMaxValue.setText("1000");
        valueMaxValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMaxValueActionPerformed(evt);
            }
        });

        jLabel10.setText("Value max");

        valueMinSlider.setMaximum(255);
        valueMinSlider.setToolTipText("");
        valueMinSlider.setValue(84);
        valueMinSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valueMinSliderStateChanged(evt);
            }
        });

        valueMinValue.setText("1000");
        valueMinValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueMinValueActionPerformed(evt);
            }
        });

        importHue.setText("1000");
        importHue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importHueActionPerformed(evt);
            }
        });

        importSaturation.setText("1000");
        importSaturation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importSaturationActionPerformed(evt);
            }
        });

        importValue.setText("1000");
        importValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importValueActionPerformed(evt);
            }
        });

        importValueBtn.setText("Get Value");
        importValueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importValueBtnActionPerformed(evt);
            }
        });

        jButton1.setText("AutoTune");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addValuesBtn.setText("Add values");
        addValuesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addValuesBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Add values");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Settings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(importHue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(importSaturation, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(importValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(importValueBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addValuesBtn))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SaturationMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saturationMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(saturationMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saturationMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(hueMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hueMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(hueMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hueMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(valueMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(valueMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(valueMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(valueMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(hueMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hueMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hueMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(hueMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saturationMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saturationMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SaturationMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saturationMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(valueMinSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valueMaxSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueMaxValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(valueMinValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importHue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importSaturation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importValueBtn)
                    .addComponent(addValuesBtn))
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        System.out.print("kake");
        cameraPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cameraPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout cameraPanelLayout = new javax.swing.GroupLayout(cameraPanel);
        cameraPanel.setLayout(cameraPanelLayout);
        cameraPanelLayout.setHorizontalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );
        cameraPanelLayout.setVerticalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cameraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(cameraPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cameraPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cameraPanelMouseClicked
        // TODO add your handling code here:
        
        System.out.println("klikk");
    }//GEN-LAST:event_cameraPanelMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // udpRecive.updateSettings();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addValuesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addValuesBtnActionPerformed
        // TODO add your handling code here:

        // Setting a new maxvalue
        if(hueVal > hueMaxSlider.getValue()) {
            hueMaxSlider.setValue(hueVal+setValueIncrement);
        }
        if(satVal > SaturationMaxSlider.getValue()){
            SaturationMaxSlider.setValue(satVal+setValueIncrement);
        }
        if(valVal > valueMaxSlider.getValue()){
            valueMaxSlider.setValue((valVal+setValueIncrement));
        }

        //Setting a new min value
        if(hueVal < hueMinSlider.getValue()) {
            hueMinSlider.setValue(hueVal-setValueIncrement);
        }
        if(satVal < saturationMinSlider.getValue()){
            saturationMinSlider.setValue(satVal-setValueIncrement);
        }
        if(valVal < valueMinSlider.getValue()){
            valueMinSlider.setValue((valVal-setValueIncrement));
        }
        // messageField.setText("New values added");
    }//GEN-LAST:event_addValuesBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        hueMinSlider.setValue(hueVal-6);
        hueMaxSlider.setValue(hueVal+6);

        saturationMinSlider.setValue(satVal-50);
        SaturationMaxSlider.setValue(satVal+50);

        valueMinSlider.setValue(valVal-30);
        valueMaxSlider.setValue(valVal+30);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void importValueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importValueBtnActionPerformed
        // TODO add your handling code here:

        String hue = String.valueOf(hueVal);
        String sat = String.valueOf(satVal);
        String val = String.valueOf(valVal);

        importHue.setText(hue);
        importSaturation.setText(sat);
        importValue.setText(val);
    }//GEN-LAST:event_importValueBtnActionPerformed

    private void importValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importValueActionPerformed

    private void importSaturationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importSaturationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importSaturationActionPerformed

    private void importHueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importHueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importHueActionPerformed

    private void valueMinValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMinValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMinValueActionPerformed

    private void valueMinSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valueMinSliderStateChanged
        // TODO add your handling code here:
        valueMinValue.setText(String.valueOf(valueMinSlider.getValue()));
    }//GEN-LAST:event_valueMinSliderStateChanged

    private void valueMaxValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueMaxValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueMaxValueActionPerformed

    private void SaturationMaxSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SaturationMaxSliderStateChanged
        // TODO add your handling code here:
        saturationMaxValue.setText(String.valueOf(SaturationMaxSlider.getValue()));
    }//GEN-LAST:event_SaturationMaxSliderStateChanged

    private void saturationMinValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturationMinValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturationMinValueActionPerformed

    private void saturationMinSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_saturationMinSliderStateChanged
        // TODO add your handling code here:
        saturationMinValue.setText(String.valueOf(saturationMinSlider.getValue()));
    }//GEN-LAST:event_saturationMinSliderStateChanged

    private void saturationMaxValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturationMaxValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturationMaxValueActionPerformed

    private void hueMinValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hueMinValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hueMinValueActionPerformed

    private void hueMaxValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hueMaxValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hueMaxValueActionPerformed

    private void hueMaxSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hueMaxSliderStateChanged
        // TODO add your handling code here:
        hueMaxValue.setText(String.valueOf(hueMaxSlider.getValue()));
    }//GEN-LAST:event_hueMaxSliderStateChanged

    private void hueMinSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hueMinSliderStateChanged
        // TODO add your handling code here:
        hueMinValue.setText(String.valueOf(hueMinSlider.getValue()));
    }//GEN-LAST:event_hueMinSliderStateChanged

    private void valueMaxSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valueMaxSliderStateChanged
        // TODO add your handling code here:
        valueMaxValue.setText(String.valueOf(valueMaxSlider.getValue()));
    }//GEN-LAST:event_valueMaxSliderStateChanged

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider SaturationMaxSlider;
    private javax.swing.JButton addValuesBtn;
    private javax.swing.JPanel cameraPanel;
    private javax.swing.JSlider hueMaxSlider;
    private javax.swing.JTextField hueMaxValue;
    private javax.swing.JSlider hueMinSlider;
    private javax.swing.JTextField hueMinValue;
    private javax.swing.JTextField importHue;
    private javax.swing.JTextField importSaturation;
    private javax.swing.JTextField importValue;
    private javax.swing.JButton importValueBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField saturationMaxValue;
    private javax.swing.JSlider saturationMinSlider;
    private javax.swing.JTextField saturationMinValue;
    private javax.swing.JSlider valueMaxSlider;
    private javax.swing.JTextField valueMaxValue;
    private javax.swing.JSlider valueMinSlider;
    private javax.swing.JTextField valueMinValue;
    // End of variables declaration//GEN-END:variables
}
