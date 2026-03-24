/**  
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class OrdenamientosCuadraticos {
	
	private static final int SELECTION_SORT = 1;
	
	private static final int BUBBLE_SORT = 2;
	
	private static final int INSERTION_SORT = 3;


    /** 
     * Método que dado un arreglo y dos índices, devuelve el arreglo con los elementos de 
     * los índices intercambiados
     * @param arreglo un arreglo de tipo T
     * @param i un entero que representa un índice
     * @param j un entero que representa un índice
     * 
    */
    private static <T> void intercambio(T[] arreglo, int i, int j) {
        T aux = arreglo[i]; 
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    /** 
     * Método que dado un arreglo y un invtervalo delimitado por dos indices, devuelve
     * el índice del elemento más "pequeño" en dicho intervalo
     * @param arreglo un arreglo de tipo T
     * @param i un entero que representa un índice
     * @param j un entero que representa un índice
     * @return el indice del elemento más pequeño
    */
    private static <T extends Comparable<T>> int encontrarIndiceMenor(T[] arreglo, int i, int j){
        int indiceMenor =  i;

        for (int k = i; k <= j; k++) { 
            if(arreglo[k].compareTo(arreglo[indiceMenor]) < 0){
                indiceMenor = k;
            }
        }

        return indiceMenor;

    }  

    /** 
     * Método que dado un arreglo de tipo T, aplica el algoritmo SelectionSort para ordenarlo
     * @param arreglo un arreglo de tipo T
     * @param imprimir un booleano que indica si se imprime en pantalla el arreglo ordenado
    */
    public static <T extends Comparable<T>> void selectionSort(T[] arreglo, boolean imprimir) {     
        int minimo;
        for (int i = 0; i < arreglo.length; i++) {
            minimo = encontrarIndiceMenor(arreglo, i, arreglo.length-1);
            intercambio(arreglo, i, minimo);
        }
        if(imprimir){
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i].toString());
            }
        }   
    }


    /** 
     * Método que dado un arreglo de tipo T, aplica el algoritmo BubbleSort para ordenarlo
     * @param arreglo un arreglo de tipo T
     * @param imprimir un booleano que indica si se imprime en pantalla el arreglo ordenado
    */
    public static <T extends Comparable<T>> void bubbleSort(T[] arreglo, boolean imprimir) {
        // Verificando si el arreglo tiene 0 o 1 elemento
        if (arreglo.length == 0 || arreglo.length == 1) {
            return;   
        }
        
        for (int i=0; i < arreglo.length; i++) {
            for (int j = 1; j < arreglo.length-1; j++) {
                if(arreglo[j].compareTo(arreglo[j+1]) == 1){
                    intercambio(arreglo, j, j+1);
                }   
            }
        }
        if(imprimir){
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i].toString());
            }
        }   
    }

    /** 
     * Método que dado un arreglo de tipo T, aplica el algoritmo InsertionSort para ordenarlo
     * @param arreglo un arreglo de tipo T
     * @param imprimir un booleano que indica si se imprime en pantalla el arreglo ordenado
    */
    public static <T extends Comparable<T>> void insertionSort(T[] arreglo, boolean imprimir) {
        for (int i = 1; i < arreglo.length; i++) {
            T aInsertar = arreglo[i];
            int j = i - 1;

            while (j >= 0 && arreglo[j].compareTo(aInsertar) == 1) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }

            arreglo[j + 1] = aInsertar;
        }
        if(imprimir){
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println(arreglo[i].toString());
            }
        }   
    }

    /** 
     * Método que dado un arreglo de tipo T, permite elegir 3 algoritmos para ordenar el arreglo
     * @param arreglo un arreglo de tipo T
     * @param imprimir un booleano que indica si se imprime en pantalla el arreglo ordenado
    */
    public static <T extends Comparable<T>> void ordenar(int algoritmo, T[] arreglo, boolean imprimir) {
        switch (algoritmo) {
            case SELECTION_SORT:
            
                selectionSort(arreglo,imprimir);
                break;
                
            case BUBBLE_SORT:
                bubbleSort(arreglo,imprimir);
                break;
            
            case INSERTION_SORT:
                insertionSort(arreglo,imprimir);
                break;
                
            default:
                System.out.println("Opción de ordenamiento no válida.");
        }
    }
    /** 
     * Método que dado un arreglo de tipo T, imprime en pantalla sus elementos
     * @param arreglo un arreglo de tipo T
     * @return un String que representa la información contenida por el arreglo
    */
    public static <T> String imprimeArreglo(T[] arreglo) {
        String s = "{";
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                s = s + arreglo[i];
            } else {
                s = s + arreglo[i] + ",";
            }
        }
        s = s + "}";
        return s;
    }
}
