
package easy_math;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author losal
 */
public class Pintar extends JPanel{
    
  
    private int bandera = 0;
    
    
    public Pintar()
    {
        setSize(600,255);
         
    }
    

     //String titulo = "Ecuacion Matematica";
     
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
       
      
        
        if(bandera == 0)
        {
            
        }
        if(bandera == 1)
        {
         JOptionPane.showMessageDialog(null,"Respuesta Incorrecta , te quedan 2 vidas");
        }
        else if(bandera == 2)
        {
          JOptionPane.showMessageDialog(null,"Respuesta Incorrecta , te queda 1 vidas");
        }
        else if(bandera == 3)
        {
          JOptionPane.showMessageDialog(null,"Respuesta Incorrecta , Has perdido");
        }
      
    }
    
    public void error(int error)
    {
        bandera= error;
        this.repaint();
    }
    
}
