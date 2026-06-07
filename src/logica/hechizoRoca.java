package logica;

public class hechizoRoca extends Hechizo{
	private Double mejoraDefensa;

	public hechizoRoca(String nombre, String tipo, Double daño, Double mejoraDefensa) {
		super(nombre, tipo, daño);
		this.mejoraDefensa = mejoraDefensa;
	}

	public Double getMejoraDefensa() {
		return mejoraDefensa;
	}

	public void setMejoraDefensa(Double mejoraDefensa) {
		this.mejoraDefensa = mejoraDefensa;
	}
	
	
	

}
