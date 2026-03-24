public class Usuario implements Comparable<Usuario>{
    private String REGULAR = "REGULAR";
    private String PREMIUM = "PREMIUM";
    private String VIP = "VIP";

    public String nombre;
    public String nivel;
    public int numLlegada;
    public int nivelNum;

    
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

    @Override
    public int compareTo(Usuario u){
        if (this.nivelNum != u.nivelNum) {
            return this.nivelNum - u.nivelNum;        
        } 

        return u.numLlegada - this.numLlegada;
    }
}