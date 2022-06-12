package easy_math;

/**
 *
 * @author losal
 */
public class Ecuaciones {
    private String[] arreglo;
    public String elegida;
    private String[] ecuacionFormada;
    
    //Creacion de un arreglo para almacenar las ecuaciones
    
     public Ecuaciones()
    {
        arreglo = new String[10];
        
        //Asignacion de cada ecuacion en una posicion del arreglo
        
        arreglo[0] = "18X + 20 = 58";
        arreglo[1] = "9X + 15 = 51";
        arreglo[2] = "6X + 8 = 50";
        arreglo[3] = "1/2X + X + 3 = 9";
        arreglo[4] = " X + 6X + 2X = 45";
        arreglo[5] = "3X + 15 = 33";
        arreglo[6] = "10X - 17 = 83";
        arreglo[7] = " X - 15 + 6X = 20";
        arreglo[8] = " 7X + 2 = 79";
        arreglo[9] = " 8X - 6 = 50";
        elegida = escogerPalabra();
        

    }
     // Metodo para tomar aleatoriamente una posicion del arreglo
      public String escogerPalabra()
    {
        int aleatorio=(int)((Math.random()*10));
        return arreglo[aleatorio];
        
    }
           
          
          
          
           public String getElegida()
    {
        return elegida;
    }
           
          
}

