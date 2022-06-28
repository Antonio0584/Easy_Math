package easy_math;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



/**
 *
 * @author losal
 */
public class Pintar extends JPanel{
    
  
    
    
    
    public Pintar()
    {
        setSize(600,255);
         
    }
    

  
     // Metodo para pintar el borde negro del panel superior
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        // Dibujar marco 
        g.setColor(Color.BLACK);
       // g.drawString(titulo,100, 30);
        g.fillRect(0, 250, 600, 5);
        g.fillRect(0, 5, 5, 250);  
        g.fillRect(0, 5, 600, 5);
        g.fillRect(580, 5, 50, 250);
        //g.drawLine(150, 10, 150, 50);
    }
    
    public void error(int error)
    {
       
        this.repaint();
    }
    
}


