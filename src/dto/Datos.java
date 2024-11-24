package dto;

public class Datos {
	
	private String nombre;
	private String tipo;
	private int fase; //(0-2)
	private int puntosVida;
	
	@Override
	public String toString() {
		return "\n" +
				"\n" +
				"Cartas {\n" +
	           "  Nombre: " + nombre + "\n" +
	           "  Tipo: " + tipo + "\n" +
	           "  Fase: " + fase + "\n" +
	           "  Puntos de vida: " + puntosVida + "\n" +
	           "}" +
	           "\n" +
	           "\n";
	}


	public Datos(String nombre, String tipo, int fase, int puntosVida) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fase = fase;
		this.puntosVida = puntosVida;
	}
	
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
	public int getFase() {
		return fase;
	}
	public void setFase(byte fase) {
		this.fase = fase;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(byte puntosVida) {
		this.puntosVida = puntosVida;
	}
	

}
