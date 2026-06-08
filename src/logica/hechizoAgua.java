package logica;

public class hechizoAgua extends Hechizo {
	private Double cantidadHeal, presiondelAgua;

	public hechizoAgua(String nombre, String tipo, Double daño, Double cantidadHeal, Double presiondelAgua) {
		super(nombre, "Agua", daño);
		this.cantidadHeal = cantidadHeal;
		this.presiondelAgua = presiondelAgua;
	}
	

	@Override
	public double calcularPuntuacion() {
		
		return (getDaño() + cantidadHeal + presiondelAgua)*2;
	}
	
	@Override
	public String toTexto() {
		
	    return getNombre() + ";Agua;" + getDaño() + ";" + cantidadHeal + "," + presiondelAgua;
	   
	 }


	public Double getCantidadHeal() {
		return cantidadHeal;
	}

	public void setCantidadHeal(Double cantidadHeal) {
		this.cantidadHeal = cantidadHeal;
	}

	public Double getPresiondelAgua() {
		return presiondelAgua;
	}

	public void setPresiondelAgua(Double presiondelAgua) {
		this.presiondelAgua = presiondelAgua;
	}
	
	
	

}
