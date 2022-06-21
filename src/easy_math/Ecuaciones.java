package easy_math;

/**
 *
 * @author losal
 */
public class Ecuaciones {
    private double[] resultados={2,4,7,5,5,4,15,24,47.2234,2.3875};
    private String[] arreglo;
    public String elegida;
    private String[] ecuacionFormada;
    int orden= 0;
    int i =0;
    int resultado_ecuacion1= 2;
    boolean result1;
    static int cont = -1;
    //Creacion de un arreglo para almacenar las ecuaciones
    
     public Ecuaciones()
    {
      
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
     



// Metodo para tomar aleatoriamente una posicion del arreglo
      public String escogerEcuacion()
    {
        cont= cont+1;
        return arreglo[cont];
        
    }
           
          
         
        
        public int Contador(){
              
        
        return cont;
            
        }
        
        public double resultado(){
            
            
        
            return resultados[cont];
        
            
        }
        
        public void reiniciar_valores(){
            cont=-1;
            
        }
           
          
}



