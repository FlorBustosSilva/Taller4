package logica;

public abstract class Hechizo implements Calculodedaño{
	private String nombre,tipo;
	private Double daño;
	
	public Hechizo(String nombre, String tipo, Double daño) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.daño = daño;
	}
	public abstract double calcularPuntuacion();
	public abstract String toTexto();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getDaño() {
		return daño;
	}

	public void setDaño(Double daño) {
		this.daño = daño;
	}
	@Override
	public String toString() {
		return String.format("%-25s | Tipo: %-8s | Daño: %6.1f | Puntuación: %.2f",
                nombre, tipo, daño, calcularPuntuacion());
	}
	
	

}
