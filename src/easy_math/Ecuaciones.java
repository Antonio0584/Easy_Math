package easy_math;

/**
 *
 * @author losal
 */
public class Ecuaciones {
    
    // Creacion  de el arreglo donde se guardaran los resultados
    private double[] resultados={2,4,7,5,5,4,15,24,47.2234,2.3875};
    
    // Creacion del arreglo donde se guardaran las ecuaciones
    private String[] arreglo;
    public String elegida;
    int orden= 0;
    static int cont = -1;
    //Creacion de un arreglo para almacenar las ecuaciones
    
     public Ecuaciones()
    {
      // asignacion de las ecuaciones para cada posicion del arreglo
        arreglo = new String[10];
  
        arreglo[0] = "18X + 20 = 56";
        arreglo[1] = "9X + 15 = 51";
        arreglo[2] = "6X + 8 = 50";
        arreglo[3] = " X - 15 + 6X = 20 ";
        arreglo[4] = " X + 6X + 2X= 45 " ;
        arreglo[5] = "(1/2)X + X + 3= 9";
        arreglo[6] = "(10/4)X - 17 + (2/4)X = 28";
        arreglo[7] = " -X^2 + 20X + 96 = 0";
        arreglo[8] = "-X^2 + 45X + 105 = 0";
        arreglo[9] = " X^2 + 24X - 63 = 0";
        

    }
     



// Metodo para tomar ordenadamente una posicion del arreglo y retornarla
      public String escogerEcuacion()
    {
        cont= cont+1;
        return arreglo[cont];
        
    }
           
          
         
        // metodo para que el nivel cuente al mismo tiempo que la ecuacion
        public int Contador(){
              
        
        return cont;
            
        }
        
        // Metodo para tomar ordenadamente una posicion del arreglo resultados y retornarla
        public double resultado(){
            
            
        
            return resultados[cont];
        
            
        }
        // metodo para reiniciar todos los valores a su posicion inicial
        public void reiniciar_valores(){
            cont=-1;
            
        }
           
          
}

