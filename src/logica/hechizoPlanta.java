package logica;

public class hechizoPlanta extends Hechizo{
	private Double duracionStun,cantPlantas;

	public hechizoPlanta(String nombre, String tipo, Double daño, Double duracionStun, Double cantPlantas) {
		super(nombre, tipo, daño);
		this.duracionStun = duracionStun;
		this.cantPlantas = cantPlantas;
	}

	public Double getDuracionStun() {
		return duracionStun;
	}

	public void setDuracionStun(Double duracionStun) {
		this.duracionStun = duracionStun;
	}

	public Double getCantPlantas() {
		return cantPlantas;
	}

	public void setCantPlantas(Double cantPlantas) {
		this.cantPlantas = cantPlantas;
	}
	

}
