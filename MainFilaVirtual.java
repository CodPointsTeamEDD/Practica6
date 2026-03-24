
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainFilaVirtual{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxBoletos;
        System.out.println("Cuantos boletos hay disponibles antes de iniciar la venta?");

        maxBoletos = sc.nextInt();

        int tamanioArreglo = 0;

        try (BufferedReader br = new BufferedReader((new FileReader("usuarios.txt")))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                tamanioArreglo = tamanioArreglo + 1;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        Usuario[] usuarios = new Usuario[tamanioArreglo];

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

        // for(int i = 0; i<usuarios.length; i++){
        //     System.out.println(usuarios[i].nombre + " Nivel: " + usuarios[i].nivel + " Llegada: " + usuarios[i].numLlegada);
        // }
        OrdenamientosCuadraticos.ordenar(1, usuarios, true);
    }
}