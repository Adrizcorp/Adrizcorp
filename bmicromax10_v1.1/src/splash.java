/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Fabian Humberto Castillo pineda
 */
public class splash extends javax.swing.JPanel {
    ImageIcon imagen; // imagen para mostrar 
    BorderLayout esquema;
    /**
     * Creates new form splash
     */
    public splash() {
        initComponents();
        
       Border borde = BorderFactory.createLineBorder(Color.red, 2);
   
        
        estados.setBorder(borde);
        estados.setForeground(Color.decode("#00FF00")); 
        estados.setOpaque(true);
        estados.setBackground(Color.black);
      
        //estados.setBackground(Color.decode("#00FF00"));
        imagen = new ImageIcon(getClass().getResource("imagenes/tlerun.gif")); // se obtiene la imagen 
        this.setSize(imagen.getIconWidth(), imagen.getIconHeight()); // se establece el tamaño del panel 
        // mediante la dimencion de la imagen ancho y alto 
    }
    
    @Override
    public void paintComponent(Graphics g){ // metodo paintComponent para dibujar la imagen 
        super.paintComponent(g); // para que el panel se despligue sin errores 
        g.drawImage(imagen.getImage(), 0, 0, imagen.getIconWidth(), imagen.getIconHeight(), this); // se dibuja la imagen 
        this.setOpaque(false); // se establece el panel transparente para que se pueda ver la imagen 
    } 

    public void velocidadDeCarga() throws InterruptedException{ // motodo para controlar la barra 
        for(int i = 0; i<=100; i++){ // establece el recorrido de la barra de progreso 
            Thread.sleep(40); // pausas para dar el efecto de carga 
            progreso.setForeground(Color.red); // color de la barra de progreso 
            progreso.setValue(i); // se asigna el valor de la barra 
            
            if (i == 40) {
               estados.setText("Cargando componentes"); 
               
            }
            if (i == 70) {
                estados.setText("Estara en 3 2 1");
            }
        } 
    } 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progreso = new javax.swing.JProgressBar();
        estados = new javax.swing.JLabel();

        estados.setText("Cargando modulos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progreso, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 294, Short.MAX_VALUE)
                .addComponent(estados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estados;
    private javax.swing.JProgressBar progreso;
    // End of variables declaration//GEN-END:variables
}
