package logica;

public class hechizoFuego extends Hechizo {
	private Double duracionQuemadura;

	public hechizoFuego(String nombre, String tipo, Double daño, Double duracionQuemadura) {
		super(nombre, tipo, daño);
		this.duracionQuemadura = duracionQuemadura;
	}
	
	

	@Override
	public double calcularPuntuacion() {
		return getDaño() * duracionQuemadura;
	}



	public Double getDuracionQuemadura() {
		return duracionQuemadura;
	}

	public void setDuracionQuemadura(Double duracionQuemadura) {
		this.duracionQuemadura = duracionQuemadura;
	}
	
	
	

}
