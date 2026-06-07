package logica;

public class hechizoRoca extends Hechizo{
	private Double mejoraDefensa;

	public hechizoRoca(String nombre, String tipo, Double daño, Double mejoraDefensa) {
		super(nombre, tipo, daño);
		this.mejoraDefensa = mejoraDefensa;
	}
	

	@Override
	public double calcularPuntuacion() {
		return (getDaño() * mejoraDefensa)/2 ;
	}


	public Double getMejoraDefensa() {
		return mejoraDefensa;
	}

	public void setMejoraDefensa(Double mejoraDefensa) {
		this.mejoraDefensa = mejoraDefensa;
	}
	
	
	

}
