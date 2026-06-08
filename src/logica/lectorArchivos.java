package logica;

import java.io.File;
import java.util.Scanner;

public class lectorArchivos {

    private static void leerMagos() {
        File arch = new File("txt/Magos.txt");

        try (Scanner sc = new Scanner(arch)) {

            while (sc.hasNextLine()) {

                String[] partes = sc.nextLine().split(";");

                String nombre = partes[0];
                Mago esteMago = new Mago(nombre);

                if (partes.length < 2) {
                    Sistema.añadirMago(esteMago);
                    continue;
                }
                
                Sistema.añadirMago(esteMago);
            }

        } catch (Exception e) {
            System.out.println("Error al leer magos: " + e.getMessage());
        }
    }
}