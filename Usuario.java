/**  
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class Usuario implements Comparable<Usuario>{
    private String REGULAR = "REGULAR";
    private String PREMIUM = "PREMIUM";
    private String VIP = "VIP";

    public String nombre;
    public String nivel;
    public int numLlegada;
    public int nivelNum;

    /**
     * Constructor por parametros
     * @param nombre nombre del usuario
     * @param nivel nivel del usuario
     * @param numLlegada numero de llegada del usuario
     */    
    public Usuario(String nombre, String nivel, int numLlegada){
        if (nivel.equals(REGULAR)) {
            this.nivelNum = 0;
        }  
        else if (nivel.equals(PREMIUM)) {
            this.nivelNum = 1;
        }  
        else if (nivel.equals(VIP)){
            this.nivelNum = 2;
        } else{
            throw new ExceptionInInitializerError();
        }
        this.nivel = nivel;
        this.nombre = nombre;
        this.numLlegada = numLlegada;

    }

    /** 
     * Metodo que compara dos elementos de tipo Usuario
     * @param u Usuario a comparar
     * @return un entero que indica si el elementos comparado es mayor, menor o igual a this 
    */
    @Override
    public int compareTo(Usuario u){
        if (this.nivelNum != u.nivelNum) {
            return u.nivelNum - this.nivelNum ;        
        } 

        return this.numLlegada - u.numLlegada;
    }

    /** 
     * Método que muestra en pantalla la informaición de un usuario
    */
    public String toString(){
        return nombre + "_" + nivel + "_" + numLlegada + "\n";
    }
}