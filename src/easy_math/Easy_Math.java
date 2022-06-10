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
   // private Palabras p;
    private int vidas;
    private String ecuacion_real = " 5x + 3 = 13 ";
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
        //Panel donde se mostraran las ecuaciones
        panelGrafico = new Pintar();
        panelGrafico.setBackground(Color.WHITE);
        panelGrafico.setLayout(null);
        titulo = new JLabel("Resuelva la Ecuacion Matematica  ");
        titulo.setForeground(Color.RED);
        titulo.setFont(fuente);
        titulo.setBounds(120,10,350,100);
        panelGrafico.add(titulo);
        Ecuacion = new JLabel(ecuacion_real);
        Ecuacion.setForeground(Color.BLUE);
        Ecuacion.setFont(fuente);
        Ecuacion.setBounds(200,80,250,100);
        panelGrafico.add(Ecuacion);
        Nivel = new JLabel(nivel);
        Nivel.setForeground(Color.BLACK);
        Nivel.setFont(fuente);
        Nivel.setBounds(500,180,250,100);
        panelGrafico.add(Nivel);
        
        
        add(panelGrafico,BorderLayout.CENTER);
        
        //Panel donde estaran los elementos
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
        
        //Colocando elementos en el panel
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
    
    public void actionPerformed(ActionEvent evento) 
    {
        
    }
    
    
    
    public static void main(String[] args) {
        Easy_Math a = new Easy_Math();
    }
    
}
