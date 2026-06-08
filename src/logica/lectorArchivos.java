package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorArchivos {

    private static void leerMagos() {
        File arch = new File("txt/Magos.txt");
        try {
            Scanner sc = new Scanner(arch);
            while (sc.hasNextLine()) {
                Mago esteMago = null;
                String[] partes = sc.nextLine().split(";");
                String nombre = partes[0];
                esteMago = new Mago(nombre);
                if (partes.length < 2) {
                    Sistema.añadirMago(esteMago);
                    continue;
                }
                String[] separador = partes[1].split("\\|");
                for (int i = 0; i < separador.length; i++) {
                    Hechizo esteHechizo = Sistema.devolverHechizo(separador[i]);
                    if (esteHechizo != null) {
                        esteMago.AñadirHechizo(esteHechizo);
                    }
                }
                Sistema.añadirMago(esteMago);
            }
        } catch (Exception e) {
            System.out.println("Error al leer magos: " + e.getMessage());
        }

    private static void leerHechizos() {
        File arch = new File("txt/Hechizos.txt");
        try {
            Scanner sc = new Scanner(arch);
            while (sc.hasNextLine()) {
                String[] partes = sc.nextLine().split(";");
                String nombre   = partes[0];
                String tipo     = partes[1];
                double daño    = Double.parseDouble(partes[2]); 

                if (tipo.equalsIgnoreCase("Agua")) {
                    String[] separador    = partes[3].split(",");
                    double cantidadHeal   = Double.parseDouble(separador[0]);
                    double presionDelAgua = Double.parseDouble(separador[1]);
                    Sistema.añadirHechizos(new Agua(nombre, tipo, daño, cantidadHeal, presionDelAgua));

                } else if (tipo.equalsIgnoreCase("Tierra")) {
                    double mejoraDefensa = Double.parseDouble(partes[3]);
                    Sistema.añadirHechizos(new Tierra(nombre, tipo, daño, mejoraDefensa));

                } else if (tipo.equalsIgnoreCase("Planta")) {
                    String[] separador  = partes[3].split(",");
                    double duracionStun = Double.parseDouble(separador[0]);
                    double cantPlantas  = Double.parseDouble(separador[1]);
                    Sistema.añadirHechizos(new Planta(nombre, tipo, daño, duracionStun, cantPlantas));

                } else if (tipo.equalsIgnoreCase("Fuego")) {
                    double duracionQuemadura = Double.parseDouble(partes[3]);
                    Sistema.añadirHechizos(new Fuego(nombre, tipo, daño, duracionQuemadura));
                }
            }
            System.out.println("Arch cargado correctamente");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } 

} 