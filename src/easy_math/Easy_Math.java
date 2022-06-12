package easy_math;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;




/**
 *
 * @author losal
 */
public class Easy_Math extends JFrame implements ActionListener
{

    // Creacion de Botones, Label y cajas de texto
    
    private Pintar panelGrafico;
    private JPanel panelComponentes;
    private JButton botonReIniciar;
    private JButton botonIniciar;
    private JButton botonValidarValor;
    private JButton botonSalir;
    private JLabel etiqueta_x;
    private JLabel titulo;
    private JLabel Ecuacion;
    private JLabel Nivel;
    private JTextField numero_ingresado;
    private JTextField resultado;
    private Ecuaciones e;
    private int vidas;
    private String nivel = " Nivel 1 ";
    Font fuente = new Font("Dialog", Font.BOLD, 20);
    
    public Easy_Math()
    {
        super("Juego Easy Math version 1.0");
        setLayout(new BorderLayout(1,1));
        setSize(600,600);
        agregarElementos();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        vidas = 0;
    }
    
    public void agregarElementos()
    {
        /*creacion del panel donde se mostraran las ecuaciones a desarrollar
        Asiganacion de color y tamano para cada elemento 
        */
        panelGrafico = new Pintar();
        panelGrafico.setBackground(Color.WHITE);
        panelGrafico.setLayout(null);
        // titulo es el titulo que se mostrara en este primer panel
        
        titulo = new JLabel("Resuelva la Ecuacion Matematica  ");
        titulo.setForeground(Color.RED);
        titulo.setFont(fuente);
        titulo.setBounds(120,10,350,100);
        panelGrafico.add(titulo);
        
        //Ecuacion sera el label que mostrara en el panel la ecuacion escogida para cada nivel
        
        Ecuacion = new JLabel();
        Ecuacion.setForeground(Color.BLUE);
        Ecuacion.setFont(fuente);
        Ecuacion.setBounds(200,80,250,100);
        panelGrafico.add(Ecuacion);
        
        //Nivel es un label que nos ira mostrando el nivel en el cual se encuentra el jugador
        
        Nivel = new JLabel(nivel);
        Nivel.setForeground(Color.BLACK);
        Nivel.setFont(fuente);
        Nivel.setBounds(500,180,250,100);
        panelGrafico.add(Nivel);
        
        
        add(panelGrafico,BorderLayout.CENTER);
        
        //Creacion del Panel donde se introduciran los botones label y cajas de texto
        
        panelComponentes = new JPanel();
        panelComponentes.setBackground(Color.BLUE);
        panelComponentes.setLayout(null);
        
        botonReIniciar = new JButton("Reinicar Juego");
        botonIniciar = new JButton("Inicar Juego");
        botonValidarValor = new JButton("Validar Valor");
        botonSalir = new JButton("SALIR");
        
        etiqueta_x = new JLabel("X = ");
        
        
        resultado = new JTextField("");
        numero_ingresado = new JTextField("");
        
        //Asignacion de la ubicacion de los elementos en el panel
        
        botonReIniciar.setBounds(30,500,150,30);
        etiqueta_x.setBounds(150,300,100,30);
        resultado.setBounds(200,300,200,30);
        botonIniciar.setBounds(30,450,150,30);
        botonValidarValor.setBounds(100,360,150,30);
        numero_ingresado.setBounds(300,360,150,30);
        botonSalir.setBounds(430,500,130,30);
        
        botonReIniciar.addActionListener(this);
        botonIniciar.addActionListener(this);
        botonValidarValor.addActionListener(this);
        botonSalir.addActionListener(this);
        
        panelComponentes.add(botonReIniciar);
        panelComponentes.add(botonIniciar);
        panelComponentes.add(botonValidarValor);
        panelComponentes.add(botonSalir);
        panelComponentes.add(numero_ingresado);
        panelComponentes.add(etiqueta_x);
        panelComponentes.add(resultado);
        
        add(panelComponentes,BorderLayout.CENTER);
        
        
    }
    // Creacion de metodo para las funciones que realizaran los botones
    
    public void actionPerformed(ActionEvent evento) 
    {
        
        // Acciones a realizar cuando se presione el boton ReIniciar
        
        if(evento.getSource() == botonReIniciar)
        {
            panelGrafico.error(0);
            Ecuacion.setText("");
            vidas = 0;
        }
        
        // Acciones a realizar cuando se presione el boton Iniciar
        
        else if(evento.getSource() == botonIniciar)
        {
            panelGrafico.error(0);
            e = new Ecuaciones();
            String aux = e.escogerPalabra();
            
            Ecuacion.setText(aux);
        }
        else if(evento.getSource() == botonValidarValor)
        {
            int p = 5;
            int vidas = 3;
            String valor_insertado = numero_ingresado.getText();
            int valor_comparar = Integer.parseInt(valor_insertado);;
            if(valor_comparar==5){
                JOptionPane.showMessageDialog(null,"Ganaste");
            }
            else {
                
            JOptionPane.showMessageDialog(null,"perdiste");
        }
            
        }
        
         // Acciones a realizar cuando se presione el boton Salir
        
        else if(evento.getSource() == botonSalir)
        {
            System.exit(0);
        }
        

    }
    
    
    
    public static void main(String[] args) {
        Easy_Math a = new Easy_Math();
    }
    
}
