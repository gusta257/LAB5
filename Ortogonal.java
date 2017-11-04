
public class Ortogonal extends Tanque{
	private double ancho;
	private double largo;
	
	public Ortogonal() {
		super();
	}
	public Ortogonal(String id, double altura, String fabrirV, String fcerrarV, double largo, double ancho) {
		super( id,  altura,  fabrirV,  fcerrarV);
		this.ancho=ancho;
		this.largo=largo;
	}
	public double Volumen() {
		return super.Volumen()*ancho*largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	@Override
	public String toString() {
		return "Ortogonal [ancho=" + ancho + ", largo=" + largo + "]";
	}	

}
