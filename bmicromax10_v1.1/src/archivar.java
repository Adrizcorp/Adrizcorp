
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabian Humberto Castillo pineda
 */
public class archivar {
    
    private FileWriter fw; 
    private PrintWriter pr;
    
    
    public void contenedor(String uno , String dos , String archivo1) throws IOException
    {
        /*
        File archivo = new File("/Users/linuxforce/Desktop" +"/" + "hola.v");
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));//filewrite esrescribe dentro del archivo
         bw.write(uno + "\n" + dos );
      
         bw.close();
    */
    
    File archivo = new File(archivo1);
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));//filewrite esrescribe dentro del archivo
         bw.write(uno + "\n" + dos );
      
         bw.close();
    
         /*UIManager UI=new UIManager();
 UI.put("OptionPane.background",Color.LIGHT_GRAY);
 UI.put("Panel.background", Color.LIGHT_GRAY);*/

        JOptionPane.showMessageDialog(null,"Se guardo en  : " + archivo , "Informacion!!",JOptionPane.WARNING_MESSAGE,new ImageIcon(archivar.class.getResource("imagenes/305105.gif")));

    }


public void paint_01 (Graphics g)
{


        g.setColor(Color.decode("#FFFF00"));
       g.drawRect(185, 85, 25, 215);

       
        
       // g.draw3DRect(180, 85, 30,230, false);
    


}

public void pain_back_1(Graphics g)
{


  
        
      g.setColor(Color.orange);
      
     g.fill3DRect(90, 190, 20, 20, true);
           g.setColor(Color.black);
g.drawString("U3", 91, 205);

}

public void pain_back_2(Graphics g)
{


  
        
      g.setColor(Color.decode("#8EFC0E"));
      
     g.fill3DRect(100, 170, 20, 20, true);
           g.setColor(Color.black);
g.drawString("U7", 101, 185);

}

public void pain_back_3(Graphics g)
{



 g.setColor(Color.decode("#CC15FF"));
      
     g.fill3DRect(120, 190, 20, 20, true);
           g.setColor(Color.black);
g.drawString("U4", 121, 205);



  
        
     

}




public void pant_02(Graphics g)
{
g.setColor(Color.decode("#FF00FF"));
//10, 85, 25, 340
      g.drawRect(20, 85, 25, 215);
    
}

public void paint_03(Graphics g/*boolean a*/)
{
  
    // 60, 23, 115, 30);
   
     g.setColor(Color.decode("#00FFFF"));
    g.drawRect(60, 23, 115, 30);
    /*if(a ==true)
    {
     
    }else
    {
    g.clearRect(60, 23, 115, 30);
   
    
    }

  */
      
    
    
}
public void puerto_a(Graphics g)
{

g.setColor(Color.decode("#FF0080"));
g.drawRect(200, 310, 10,60);
    
    

}

public void puerto_b(Graphics g)
{

g.setColor(Color.decode("#4DFF03"));
g.drawRect(189, 310, 10,60);
    
    

}
public void puerto_c(Graphics g)
{

g.setColor(Color.decode("#FF7D04"));
g.drawRect(32, 310, 10,60);
    
    

}
public void puerto_d(Graphics g)
{

g.setColor(Color.decode("#7085E0"));
g.drawRect(21, 310, 10,60);
    
    

}
public void led_8(Graphics g)
{

g.setColor(Color.decode("#00FF00"));
g.drawRect(50, 100, 85,20);
    
    

}

public void sdram(Graphics g)
{
 g.setColor(Color.decode("#FFFF66"));
 g.draw3DRect(53, 228, 100, 50,true);


}

public void interup(Graphics g)
{

    g.setColor(Color.red);
    g.drawRect(50, 60, 100, 25);

}


}
    
