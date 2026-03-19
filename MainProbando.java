public class MainProbando{
    public static void main(String[] args) {
        Integer[] arreglo = {1, 9, 4, 6, 2};

        OrdenamientosCuadraticos.bubbleSort(arreglo, false);
        for (Object num : arreglo) {
            System.out.print(num + ", ");
        }
        System.out.println("");


        Integer[] arreglo2 = {1, 9, 4, 6, 2};

        OrdenamientosCuadraticos.selectionSort(arreglo2, false);
        for (Object num : arreglo2) {
            System.out.print(num + ", ");
        }
        System.out.println("");
    }
}