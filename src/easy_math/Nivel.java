
package easy_math;

/**
 *
 * @author losal
 */
public class Nivel {
    
    private Ecuaciones Nivel_actual;
    
        public int Nivel()
        {
        Nivel_actual = new Ecuaciones();
        int niv = Nivel_actual.Contador();
        niv=niv+1;
        return niv;
        
        }
    
    
}
