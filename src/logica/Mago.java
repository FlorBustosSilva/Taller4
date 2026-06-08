package logica;

import java.util.ArrayList;

public class Mago implements Calculodedaño{
	private String nombre;
	private ArrayList<Hechizo> hechizos;
	
	public Mago(String nombre) {
        this.nombre   = nombre;
        this.hechizos = new ArrayList<>();
	}
	
	 public double calcularPuntuacion() {
	        double total = 0;
	        for (Hechizo h : hechizos) {
	            total += h.calcularPuntuacion();
	        }
	        return total;
	    }
	 public void agregarHechizo(Hechizo hechizo) {
	        hechizos.add(hechizo);
	 }

	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public ArrayList<Hechizo> getHechizos() {
		 return hechizos;
	 }

	 public void setHechizos(ArrayList<Hechizo> hechizos) {
		 this.hechizos = hechizos;
	 }
	 
	 
	
	
	
}
