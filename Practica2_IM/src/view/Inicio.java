
package view;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Mat;
import pixelManipulation.CustomImage;
import pixelManipulation.Filters;

/**
 *
 * @author 
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        img = new CustomImage();
        brillo.setEnabled(false);
        Binarizar.setEnabled(false);
        contraste.setEnabled(false);
        correcionGama.setEnabled(false);
        guardar.setEnabled(false);
        Negative.setEnabled(false);
        suavizado.setEnabled(false);
        
        reiniciar.setEnabled(false);
        Brillo.setVisible(false);
        Contraste.setVisible(false);
        Gamma.setVisible(false);
        aver.setVisible(false);
        gaus.setVisible(false);
        Avergin.setVisible(false);
        Gaussian.setVisible(false);
        Median.setVisible(false);
        med.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregaImg = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        brillo = new javax.swing.JButton();
        contraste = new javax.swing.JButton();
        correcionGama = new javax.swing.JButton();
        imagenOriginal = new javax.swing.JLabel();
        imagenModificada = new javax.swing.JLabel();
        Brillo = new javax.swing.JSlider();
        Negative = new javax.swing.JCheckBox();
        Binarizar = new javax.swing.JCheckBox();
        Contraste = new javax.swing.JSlider();
        Gamma = new javax.swing.JSlider();
        suavizado = new javax.swing.JButton();
        aver = new javax.swing.JLabel();
        gaus = new javax.swing.JLabel();
        Avergin = new javax.swing.JSlider();
        Gaussian = new javax.swing.JSlider();
        med = new javax.swing.JLabel();
        Median = new javax.swing.JSlider();
        Rotar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        SelEsacalar = new javax.swing.JComboBox<>();
        Transformaciones = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agregaImg.setText("Agregar Imagen");
        agregaImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaImgActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        brillo.setText("Brillo");
        brillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brilloActionPerformed(evt);
            }
        });

        contraste.setText("Contraste");
        contraste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasteActionPerformed(evt);
            }
        });

        correcionGama.setText("Correcion Gama");
        correcionGama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correcionGamaActionPerformed(evt);
            }
        });

        Brillo.setMaximum(50);
        Brillo.setMinimum(-50);
        Brillo.setMinorTickSpacing(10);
        Brillo.setPaintTicks(true);
        Brillo.setSnapToTicks(true);
        Brillo.setToolTipText("");
        Brillo.setValue(0);
        Brillo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Brillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BrilloStateChanged(evt);
            }
        });

        Negative.setText("Negativo");
        Negative.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NegativeItemStateChanged(evt);
            }
        });

        Binarizar.setText("Binarización");
        Binarizar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BinarizarItemStateChanged(evt);
            }
        });

        Contraste.setMaximum(50);
        Contraste.setMinimum(-50);
        Contraste.setMinorTickSpacing(10);
        Contraste.setPaintTicks(true);
        Contraste.setValue(0);
        Contraste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ContrasteStateChanged(evt);
            }
        });

        Gamma.setMajorTickSpacing(10);
        Gamma.setPaintTicks(true);
        Gamma.setValue(0);
        Gamma.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GammaStateChanged(evt);
            }
        });

        suavizado.setText("Suavizado");
        suavizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suavizadoActionPerformed(evt);
            }
        });

        aver.setText("Promedio");

        gaus.setText("Gaussian");

        Avergin.setMajorTickSpacing(1);
        Avergin.setMaximum(5);
        Avergin.setPaintTicks(true);
        Avergin.setValue(0);
        Avergin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AverginStateChanged(evt);
            }
        });

        Gaussian.setMajorTickSpacing(1);
        Gaussian.setMaximum(5);
        Gaussian.setPaintTicks(true);
        Gaussian.setValue(0);
        Gaussian.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                GaussianStateChanged(evt);
            }
        });

        med.setText("Medio");

        Median.setMajorTickSpacing(1);
        Median.setMaximum(5);
        Median.setPaintTicks(true);
        Median.setValue(0);
        Median.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MedianStateChanged(evt);
            }
        });

        Rotar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "30", "60", "90", "120", "150", "180", "210", "240", "270", "300", "330" }));

        jLabel1.setText("Rotar");

        SelEsacalar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.8", "0.9" }));

        Transformaciones.setText("Aplicar Transformación");
        Transformaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransformacionesActionPerformed(evt);
            }
        });

        jLabel2.setText("Escalar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Rotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(SelEsacalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Transformaciones)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                                .addComponent(reiniciar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(guardar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagenOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(imagenModificada, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(Negative)
                                .addGap(48, 48, 48)
                                .addComponent(Binarizar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(suavizado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(brillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(contraste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(correcionGama, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Brillo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Contraste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Gamma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(aver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(gaus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(med, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Avergin, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                                            .addComponent(Gaussian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Median, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregaImg)
                            .addComponent(Rotar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(SelEsacalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reiniciar)
                            .addComponent(Transformaciones))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenModificada, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brillo)
                    .addComponent(Brillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contraste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraste))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Gamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correcionGama))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suavizado)
                            .addComponent(aver)))
                    .addComponent(Avergin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gaus)
                    .addComponent(Gaussian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(med)
                    .addComponent(Median, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Binarizar)
                    .addComponent(Negative))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregaImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaImgActionPerformed
        cargaImagen();
    }//GEN-LAST:event_agregaImgActionPerformed

    private void brilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brilloActionPerformed
        Brillo.setVisible(true);
    }//GEN-LAST:event_brilloActionPerformed

    private void BrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BrilloStateChanged
        
       guardar.setEnabled(true);
       reiniciar.setEnabled(true);
       
       JSlider source = (JSlider) evt.getSource();
       int level, accion = 0;       
       level = (int) source.getValue();   
       byte[] buffer = img.toBytes(brightImage);
        
       if(tono == 0){
           accion = level;
           tono = accion;
           anteriorL = level;
       }
       else if(anteriorL < level){
           accion = level - anteriorL;
           tono = tono + accion;
           anteriorL = level;
       }
       else if(anteriorL > level){
           accion = tono - (level);
           accion = -accion;
           tono = tono + accion;
           anteriorL = level;
       }
         
       brightImage = Filters.addBrightness(buffer, brightImage,accion);
        
       Image image = img.toImage(brightImage, buffer);
        
       imagenModificada.setIcon(new ImageIcon(image.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_BrilloStateChanged

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "Desea descartar los cambios realizados a la imagen \n ESTA ACCION NO SE PUEDE RECUPERAR", "Reiniciar Imagen", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null) == 0){
            brightImage=myImage;
            imagenModificada.setIcon(imagenOriginal.getIcon());
            
            guardar.setEnabled(false);
            reiniciar.setEnabled(false);
            
            Negative.setSelected(false);
            Binarizar.setSelected(false);
            
            Gamma.setEnabled(true);
            Brillo.setValue(0);
            Contraste.setValue(0);
            Gamma.setValue(0);
            Avergin.setValue(0);
            Gaussian.setValue(0);
            Median.setValue(0);
        }
    }//GEN-LAST:event_reiniciarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
       JFileChooser chooser = new JFileChooser();
       chooser.setDialogTitle("Guardar Imagen");
       chooser.setApproveButtonText("Guardar");
       FileNameExtensionFilter filtro = new FileNameExtensionFilter(".jpg", "jpg");
       chooser.setFileFilter(filtro);
       chooser.showDialog(null, null);
       

       String selectedFile = chooser.getSelectedFile().getPath();
       File file = new File(selectedFile + ".jpg");
        
       ImageIcon icon = (ImageIcon) imagenModificada.getIcon();
       BufferedImage image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
       Graphics2D g2 = image.createGraphics();
       g2.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
       g2.dispose();
       JOptionPane.showConfirmDialog(rootPane, "Imagen guardada", "Guardar", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
        try {
            ImageIO.write(image, "jpg", file);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void NegativeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NegativeItemStateChanged
        // TODO add your handling code here:
        guardar.setEnabled(true);
       reiniciar.setEnabled(true);
        
        if(Negative.isSelected()){
            byte[] buffer = img.toBytes(brightImage);
            
            brightImage = Filters.Negative(buffer, brightImage);
            Image image = img.toImage(brightImage,buffer);
            imagenModificada.setIcon(new ImageIcon(image.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        }else if(!Negative.isSelected()){
            byte[] buffer = img.toBytes(brightImage);
            
            brightImage = Filters.Negative(buffer, brightImage);
            Image image = img.toImage(brightImage,buffer);
            imagenModificada.setIcon(new ImageIcon(image.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_NegativeItemStateChanged

    private void BinarizarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BinarizarItemStateChanged
        // TODO add your handling code here:
        guardar.setEnabled(true);
       reiniciar.setEnabled(true);
        if(Binarizar.isSelected()){
            buffer = img.toBytes(brightImage);
            brightImage = Filters.Binarizacion(buffer, brightImage);
            Image image = img.toImage(brightImage,buffer);
            imagenModificada.setIcon(new ImageIcon(image.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        }else if(!Binarizar.isSelected()){
            buffer = img.toBytes(brightImage);
            Image image2 = img.toImage(brightImage,buffer);
            imagenModificada.setIcon(new ImageIcon(image2.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        }
    }//GEN-LAST:event_BinarizarItemStateChanged

    private void ContrasteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ContrasteStateChanged
        // TODO add your handling code here:
        guardar.setEnabled(true);
       reiniciar.setEnabled(true);
        
        JSlider source = (JSlider) evt.getSource();
        int level,accion2=0;
        
        level = (int) source.getValue();
        buffer =img.toBytes(brightImage);
        
        if(tono == 0){
           accion2 = level;
           tono = accion2;
           anteriorL = level;
       }
       else if(anteriorL < level){
           accion2 = level - anteriorL;
           tono = tono + accion2;
           anteriorL = level;
       }
       else if(anteriorL > level){
           accion2 = tono - level;
           accion2 = -accion2;
           tono = tono + accion2;
           anteriorL = level;
       }
               //System.out.print("AnteriorL" + anteriorL + " Level" + level + " Accion" + accion2 + " Tono" + tono + "\n");

        brightImage = Filters.Contrast(buffer, brightImage, accion2);
        Image image = img.toImage(brightImage, buffer);
        imagenModificada.setIcon(new ImageIcon(image.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_ContrasteStateChanged

    private void GammaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GammaStateChanged
        // TODO add your handling code here:
        guardar.setEnabled(true);
        reiniciar.setEnabled(true);
       
        int level;
        JSlider source = (JSlider) evt.getSource();
        level = (int) source.getValue();
        buffer = img.toBytes(brightImage);
        Image image;
        if(anteriorL>level){
             
             anteriorL=level;
        }else{
            if(level==100){
            Gamma.setEnabled(false);
            }
            brightImage = Filters.Gamma(buffer, brightImage,level);
            image = img.toImage(brightImage, buffer);
            imagenModificada.setIcon(new ImageIcon(image.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
            anteriorL=level;
        }
        
    }//GEN-LAST:event_GammaStateChanged

    private void contrasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasteActionPerformed
        // TODO add your handling code here:
        Contraste.setVisible(true);
    }//GEN-LAST:event_contrasteActionPerformed

    private void correcionGamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correcionGamaActionPerformed
        // TODO add your handling code here:
        Gamma.setVisible(true);
    }//GEN-LAST:event_correcionGamaActionPerformed

    private void suavizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suavizadoActionPerformed
        aver.setVisible(true);
        gaus.setVisible(true);
        Avergin.setVisible(true);
        Gaussian.setVisible(true);
        Median.setVisible(true);
        med.setVisible(true);
    }//GEN-LAST:event_suavizadoActionPerformed

    private void AverginStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AverginStateChanged

        guardar.setEnabled(true);
        reiniciar.setEnabled(true);
        
        brightImage = Filters.smoothing(brightImage, 1);
        Image imageToShow;
        
        buffer = img.toBytes(brightImage);       
        
        imageToShow = img.toImage(brightImage, buffer);
        
        imagenModificada.setIcon(new ImageIcon(imageToShow.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        
    }//GEN-LAST:event_AverginStateChanged

    private void GaussianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_GaussianStateChanged
        
        guardar.setEnabled(true);
        reiniciar.setEnabled(true);
        
        brightImage = Filters.smoothing(brightImage, 2);
        Image imageToShow;
        
        buffer = img.toBytes(brightImage);       
        
        imageToShow = img.toImage(brightImage, buffer);
        
        imagenModificada.setIcon(new ImageIcon(imageToShow.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        
    }//GEN-LAST:event_GaussianStateChanged

    private void MedianStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MedianStateChanged
        guardar.setEnabled(true);
        reiniciar.setEnabled(true);
        
        brightImage = Filters.smoothing(brightImage, 3);
        Image imageToShow;
        
        buffer = img.toBytes(brightImage);       
        
        imageToShow = img.toImage(brightImage, buffer);
        
        imagenModificada.setIcon(new ImageIcon(imageToShow.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        
    }//GEN-LAST:event_MedianStateChanged

    private void TransformacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransformacionesActionPerformed
        // TODO add your handling code here:
        guardar.setEnabled(true);
        reiniciar.setEnabled(true); 
        
        brightImage=myImage;
        
            double s;
            s = Double.parseDouble(SelEsacalar.getItemAt(SelEsacalar.getSelectedIndex()));
        
        if(Rotar.getSelectedItem()!="0" && SelEsacalar.getSelectedItem()!="0"){
            double grado= (double)Integer.parseInt((String)Rotar.getSelectedItem());
            grado=Math.toRadians(grado);
            brightImage=Filters.Rotar(buffer, brightImage, grado,s);
        }
        Image imageToShow;
            buffer = img.toBytes(brightImage);
            imageToShow = img.toImage(brightImage, buffer);
            imagenModificada.setIcon(new ImageIcon(imageToShow.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
            
        //brightImage=myImage;
    }//GEN-LAST:event_TransformacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    private void cargaImagen(){
        
        Image imageToShow, showingImage;
        
        myImage = img.getImage();
        
        buffer = img.toBytes(myImage);       
        imageToShow = img.toImage(myImage, buffer);
        
        
        imagenOriginal.setIcon(new ImageIcon(imageToShow.getScaledInstance(this.imagenOriginal.getWidth(), this.imagenOriginal.getHeight(), Image.SCALE_DEFAULT)));
        imagenModificada.setIcon(new ImageIcon(imageToShow.getScaledInstance(this.imagenModificada.getWidth(), this.imagenModificada.getHeight(), Image.SCALE_DEFAULT)));
        brightImage = myImage;
        negativeImage= myImage;
        binarizarImagen=myImage;
        contrastImage=myImage;
        gammaImage=myImage;
        suavImage=myImage;
        
        
        guardar.setEnabled(false);
        reiniciar.setEnabled(false);
        brillo.setEnabled(true);
        Binarizar.setEnabled(true);
        contraste.setEnabled(true);
        correcionGama.setEnabled(true);
        Negative.setEnabled(true);
        Negative.setSelected(false);
        Binarizar.setSelected(false);
        Brillo.setValue(0);
        Contraste.setValue(0);
        Gamma.setValue(0);
        suavizado.setEnabled(true);
        Avergin.setValue(0);
        Gaussian.setValue(0);
        Median.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Avergin;
    private javax.swing.JCheckBox Binarizar;
    private javax.swing.JSlider Brillo;
    private javax.swing.JSlider Contraste;
    private javax.swing.JSlider Gamma;
    private javax.swing.JSlider Gaussian;
    private javax.swing.JSlider Median;
    private javax.swing.JCheckBox Negative;
    private javax.swing.JComboBox<String> Rotar;
    private javax.swing.JComboBox<String> SelEsacalar;
    private javax.swing.JButton Transformaciones;
    private javax.swing.JButton agregaImg;
    private javax.swing.JLabel aver;
    private javax.swing.JButton brillo;
    private javax.swing.JButton contraste;
    private javax.swing.JButton correcionGama;
    private javax.swing.JLabel gaus;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel imagenModificada;
    private static javax.swing.JLabel imagenOriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel med;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton suavizado;
    // End of variables declaration//GEN-END:variables

    private Mat myImage;
    private Mat imgAux;
    private byte[] buffer;
    private CustomImage img;
    private  Mat brightImage;
    private int anteriorL = 0;
    private int tono = 0;
    private Mat negativeImage;
    private Mat binarizarImagen;
    private Mat contrastImage;
    private Mat gammaImage;
    private Mat suavImage;
    private Mat rotado;
}
