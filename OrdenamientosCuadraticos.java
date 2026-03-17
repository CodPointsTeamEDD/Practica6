public class OrdenamientosCuadraticos {
	
	private static final int SELECTION_SORT = 1;
	
	private static final int BUBBLE_SORT = 2;
	
	private static final int INSERTION_SORT = 3;

    private static <T> void intercambio(T[] arreglo, int i, int j) {
        T aux = arreglo[i]; 
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;
    }

    private static <T extends Comparable<T>> int encontrarIndiceMenor(T[] arreglo, int i, int j){
        /*Aqui va tu codigo*/
    }  

    public static <T extends Comparable<T>> void selectionSort(T[] arreglo, boolean imprimir) {     
        /*Aqui va tu codigo*/
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arreglo,boolean imprimir) {
        /*Aqui va tu codigo*/
    }

    public static <T extends Comparable<T>> void insertionSort(T[] arreglo, boolean imprimir) {
        /*Aqui va tu codigo*/
    }

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
