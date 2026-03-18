public class MainProbando{
    public static void main(String[] args) {
        Integer[] arreglo = {1, 9, 4, 6, 2};

        OrdenamientosCuadraticos.bubbleSort(arreglo, false);
        for (Object num : arreglo) {
            System.out.print(num + ", ");
        }
    }
}