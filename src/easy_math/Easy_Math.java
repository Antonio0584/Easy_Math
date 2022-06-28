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
public final class Easy_Math extends JFrame implements ActionListener
{

    // Creacion de Botones, Label y cajas de texto y variables de otras clases
    
    private Pintar panelGrafico;
    private JPanel panelComponentes;
    private JButton botonReIniciar;
    private JButton botonIniciar;
    private JButton botonValidarValor;
    private JButton botonSalir;
    private JLabel titulo;
    private JLabel titulo2;
    private JLabel titulo3;
    private JLabel Ecuacion;
    private JLabel Nivel;
    private JTextField numero_ingresado;
    private Ecuaciones e;
    private Nivel n;
    private Ecuaciones r;
    private Ecuaciones restart;
    
    // Iniciamos nuestra variable vidas en 3
    private int vidas = 3;
    // Crear un tipo de letra y tamano de la letra 
    
    Font fuente = new Font("Dialog", Font.BOLD, 20);
    
    
    public Easy_Math()
    {
        super("Juego Easy Math version 1.0");
        setLayout(new BorderLayout(1,1));
        setSize(600,600);
        // llamar al metodo agregar elementos
        agregarElementos();
        // iniciar el panel
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
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
        
        titulo = new JLabel("Bienvenido a Easy Math");
        titulo.setForeground(Color.RED);
        titulo.setFont(fuente);
        titulo.setBounds(150,10,350,100);
        panelGrafico.add(titulo);
        
        titulo2 = new JLabel("Oprime el botón iniciar para comenzar");
        titulo2.setForeground(Color.RED);
        titulo2.setFont(fuente);
        titulo2.setBounds(100,40,400,100);
        panelGrafico.add(titulo2);
        
        //Ecuacion sera el label que mostrara en el panel la ecuacion escogida para cada nivel
        // inicializamos este label vacio porque mostrara mas adelante se le ira asignando la ecuacion correspondiente
        Ecuacion = new JLabel();
        Ecuacion.setForeground(Color.BLUE);
        Ecuacion.setFont(fuente);
        Ecuacion.setBounds(200,80,250,100);
        panelGrafico.add(Ecuacion);
        
        //Nivel es un label que nos ira mostrando el nivel en el cual se encuentra el jugador
        
        Nivel = new JLabel();
        Nivel.setForeground(Color.BLACK);
        Nivel.setFont(fuente);
        Nivel.setBounds(480,180,250,100);
        panelGrafico.add(Nivel);
        
        
        add(panelGrafico,BorderLayout.CENTER);
        
        //Creacion del Panel donde se introduciran los botones label y cajas de texto
       
        
        
        
        
        panelComponentes = new JPanel();
        panelComponentes.setBackground(Color.BLUE);
        panelComponentes.setLayout(null);
        
        titulo3 = new JLabel("Inserta el valor correspondiente en números");
        titulo3.setForeground(Color.BLACK);
        titulo3.setFont(fuente);
        botonReIniciar = new JButton("Reinicar Juego");
        botonIniciar = new JButton("Inicar Juego");
        botonValidarValor = new JButton("Validar Respuesta");
        botonSalir = new JButton("SALIR");
        // Caja de texto donde se introducira las respuestas por parte del usuario
        numero_ingresado = new JTextField("");
        
        //Asignacion de la ubicacion de los elementos en el panel
        
        titulo3.setBounds(80,300,450,30);
        botonReIniciar.setBounds(30,500,150,30);
        botonIniciar.setBounds(30,450,150,30);
        numero_ingresado.setBounds(180,360,50,30);
        botonValidarValor.setBounds(250,360,150,30);
        botonSalir.setBounds(430,500,130,30);
        
        botonReIniciar.addActionListener(this);
        botonIniciar.addActionListener(this);
        botonValidarValor.addActionListener(this);
        botonSalir.addActionListener(this);
        
        panelComponentes.add(titulo3);
        panelComponentes.add(botonReIniciar);
        panelComponentes.add(botonIniciar);
        panelComponentes.add(botonValidarValor);
        panelComponentes.add(botonSalir);
        panelComponentes.add(numero_ingresado);
        // incio boton validar valor y numero ingresado como deshabilitados
        botonValidarValor.setEnabled(false);
        numero_ingresado.setEnabled(false);
        add(panelComponentes,BorderLayout.CENTER);
        
        
    }
    // Creacion de metodo para las funciones que realizaran los botones
    
    public void actionPerformed(ActionEvent evento) 
    {
        
        // Acciones a realizar cuando se presione el boton ReIniciar
        
        if(evento.getSource() == botonReIniciar)
        {
            titulo.setText ("Bienvenido a Easy Math");
            titulo2.setText ("Oprime el botón iniciar para comenzar");
            // llamo a la clase Ecuaciones y al metodo reiniciar valores 
            restart = new Ecuaciones();
            restart.reiniciar_valores();
            
            panelGrafico.error(0);
            // asigno al label Ecuaciones como vacio
            Ecuacion.setText("");
            // Cambio la etiqueta para el boton Iniciar 
            botonIniciar.setText("Iniciar Juego");
            // habilito el boton iniciar
            botonIniciar.setEnabled(true);
            //desahabilito el boton validar valor y la caja de texto nuemro_ingresado
            botonValidarValor.setEnabled(false);
            numero_ingresado.setEnabled(false);
            // asigno al label NIvel como vacio
            Nivel.setText("");
            // Asigno nuevamente 3 a la variable vidas
            vidas=3;
           
        }
        
        // Acciones a realizar cuando se presione el boton Iniciar
        
        else if(evento.getSource() == botonIniciar)
        {
           
            titulo.setText("Resuelva la siguiente Ecuacion");
            titulo2.setText("");
            panelGrafico.error(0);
            //llamo a la clase Ecuaciones y al metodo escogerEcuacion de esta misma clase
            e = new Ecuaciones();
            String aux = e.escogerEcuacion();
            Ecuacion.setText(aux);
            //llamo a la clase Nivel y al metodo Nivel de esta misma clase
            n= new Nivel();
            int niv = n.Nivel();
            Nivel.setText(" Nivel " + niv);
            
            botonIniciar.setText("Siguiente");
            botonValidarValor.setEnabled(true);
            numero_ingresado.setEnabled(true);
            botonIniciar.setEnabled(false);
           
          
           
        }
        else if(evento.getSource() == botonValidarValor)
        {
           //llamo a la clase Ecuaciones y al metodo resultado de esta misma clase
            r = new Ecuaciones();
            double res = r.resultado();
            
            // tomo el valor ingresado de la caja de texto y se lo asigno a una variable double
            String valor_insertado = numero_ingresado.getText();
            double valor_comparar = Double.parseDouble(valor_insertado);
            
            if (vidas>=1){
            
            if(valor_comparar==res){
                
                int niv = n.Nivel();
                // Mensaje cuando a completado todos los niveles
                if (niv==10){
                    JOptionPane.showMessageDialog(null, """
                                                    Felicitaciones !!! usted a completado todos los  
                                                     los niveles""");
                   
                    numero_ingresado.setEnabled(false);
                    botonIniciar.setEnabled(false);
               
                
                }
                // Mensaje que se mostrara cada vez que la respuesta es correcta
                else{
                JOptionPane.showMessageDialog(null, """
                                                    La Respuesta es Correcta pasas al siguiente nivel 
                                                     oprime continuar para solucionar la siguiente ecuacion""");
                botonValidarValor.setEnabled(false);
                numero_ingresado.setEnabled(false);
                botonIniciar.setEnabled(true);
                }
                
                
                 botonValidarValor.setEnabled(false);
            }
            // Mensaje que se mostrara cuando la respuesta es incorrecta
            else if (valor_comparar!=res){
                vidas = vidas -1;
            JOptionPane.showMessageDialog(null,"El valor ingresado no es correcto te quedan  "+ vidas+"  vidas");
           }
           }
            
            // Mensaje que se mostrara cuando el jugador pierda sus 3 vidas
            else{
                JOptionPane.showMessageDialog(null,"""
                                                   Usted ha perdido todas las vidas  
                                                   de click en reiniciar para volver a comenzar""");
                botonValidarValor.setEnabled(false);
                numero_ingresado.setEnabled(false);
            }
           numero_ingresado.setText(""); 
        }
        
         // Acciones a realizar cuando se presione el boton Salir
        
        
        // funcion del boton salir
        else if(evento.getSource() == botonSalir)
        {
            System.exit(0);
        }
        

    }
    
    
    
    public static void main(String[] args) {
        Easy_Math a = new Easy_Math();
    }
    
}
