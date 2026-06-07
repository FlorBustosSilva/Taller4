package logica;

public class hechizoAgua extends Hechizo {
	private Double cantidadHeal, presiondelAgua;

	public hechizoAgua(String nombre, String tipo, Double daño, Double cantidadHeal, Double presiondelAgua) {
		super(nombre, tipo, daño);
		this.cantidadHeal = cantidadHeal;
		this.presiondelAgua = presiondelAgua;
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
