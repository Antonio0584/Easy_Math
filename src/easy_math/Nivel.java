package easy_math;

/**
 *
 * @author losal
 */
public class Nivel {
    
    private Ecuaciones Nivel_actual;
    // metodo que realiza un llamado a la clase ecuaciones y a su metodo Contador para incrementar el nivel del juego 
        public int Nivel()
        {
        Nivel_actual = new Ecuaciones();
        int niv = Nivel_actual.Contador();
        niv=niv+1;
        return niv;
        
        }
    
    
}
