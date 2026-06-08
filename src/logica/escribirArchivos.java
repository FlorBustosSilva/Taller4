package logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;


public class escribirArchivos {
    public void guardarHechizos(String rutaArchivo, ArrayList<Hechizo> hechizos) {
        try {
            // FileWriter(ruta, false)
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, false));

            for (int i = 0; i < hechizos.size(); i++) {
                bw.write(hechizos.get(i).toTexto());
                if (i < hechizos.size() - 1) {
                    bw.newLine();
                }
            }

            bw.close();
            System.out.println("Hechizos guardados correctamente.");

        } catch (Exception e) {
            System.out.println("Error al guardar hechizos: " + e.getMessage());
        }
    }
    public void guardarMagos(String rutaArchivo, ArrayList<Mago> magos) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo, false));

            for (int i = 0; i < magos.size(); i++) {
                bw.write(magos.get(i).toTexto());

                if (i < magos.size() - 1) {
                    bw.newLine();
                }
            }

            bw.close();
            System.out.println("Magos guardados correctamente.");

        } catch (Exception e) {
            System.out.println("Error al guardar magos: " + e.getMessage());
        }
    }