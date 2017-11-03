
public class Tanque {
	protected String id;
	protected double altura;
	protected String fabrirV;
	protected String fcerrarV;
	
	public Tanque() {
		id = "";
		altura = 0;
		fabrirV = "";
		fcerrarV = "";
	}
	public Tanque(String id, double altura, String fabrirV, String fcerrarV){
		this.id =id;
		this.altura=altura;
		this.fabrirV=fabrirV;
		this.fcerrarV=fcerrarV;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getFabrirV() {
		return fabrirV;
	}
	public void setFabrirV(String fabrirV) {
		this.fabrirV = fabrirV;
	}
	public String getFcerrarV() {
		return fcerrarV;
	}
	public void setFcerrarV(String fcerrarV) {
		this.fcerrarV = fcerrarV;
	}
	public double Volumen() {
		return altura;
	}
	public double gasto() {
		return 0;
	}
	public double disponible() {
		return 0;
	}
	public String advertencia() {
		return "";
	}
	public String agregarFA() {
		return "";
	}
	public String agregarFC() {
		return "";
	}
	
}
