
public class Cilindro extends Tanque{
	private double radio;
	
	public Cilindro() {
		super();
	}
	public Cilindro(String id, double altura, String fabrirV, String fcerrarV, double radio) {
		super( id,  altura,  fabrirV,  fcerrarV);
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double Volumen() {
		return super.Volumen()*Math.pow(radio, 2)*Math.PI;
	}
	@Override
	public String toString() {
		return "Cilindro [radio=" + radio + "]";
	}
	
	
	
}
