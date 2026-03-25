import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**  
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class MainFilaVirtual{
    /** 
     * Método princiapl que prueba los algoritmos de ordenamiento mediante una 
     * fila virtual
     * @param args argumentos pasados por la terminal
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxBoletos;
        int tamanioArreglo = 0;

        System.out.println("----------------------------------");
        System.out.println("   BIENVENIDO A LA FILA VIRTUAL   ");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("¿Cuantos boletos hay disponibles antes de iniciar la venta?");
        System.out.println("Ingresa cualquiera cifra");
        System.out.print(">");

        /* Obteniendo número maximo de boletos */
        maxBoletos = sc.nextInt();
        System.out.println(" ");

        /* Obteniendo el tamanino del arreglo */
        try (BufferedReader br = new BufferedReader((new FileReader("usuarios.txt")))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                tamanioArreglo = tamanioArreglo + 1;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        /* Inicializando el arreglo de Usuarios */
        Usuario[] usuarios = new Usuario[tamanioArreglo];

        /* Agregando usuarios al arreglo */
        try (BufferedReader br = new BufferedReader((new FileReader("usuarios.txt")))) {
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("_");

                String nombre = datos[0].trim();
                String nivel = datos[1].trim();
                int llegada = Integer.parseInt(datos[2].trim());
                
                Usuario u = new Usuario(nombre, nivel, llegada);
                usuarios[contador] = u;
                contador = contador + 1;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        OrdenamientosCuadraticos.ordenar(2, usuarios, false);

        System.out.println("Usuarios ordenados por prioridad:");
        System.out.println(" ");

        /* Mostrando información sobre usuarios en pantalla */
        for (Usuario u : usuarios) {
            
            System.out.println(u.toString());
            System.out.print("Alcanzó boleto: ");
            if (maxBoletos > 0) {
                System.out.print("Sí");                
            } else {
                System.out.print("No");                
            }
            System.out.println(" ");
            System.out.println(" ");
            maxBoletos--;
        }
    }
}