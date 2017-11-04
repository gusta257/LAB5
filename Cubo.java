
public class Cubo extends Tanque{
	
	public Cubo() {
		super();
	}
	public Cubo(String id, double altura, String fabrirV, String fcerrarV) {
		super( id,  altura,  fabrirV,  fcerrarV);
		
	}
	public double Volumen() {
		return Math.pow(super.Volumen(), 3);
	}
	

}
