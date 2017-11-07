
public class Cilindro extends Tanque{
	private double radio;
	
	public Cilindro() {
		super();
	}
	/**
	 * @param id
	 * @param altura
	 * @param radio
	 */
	public Cilindro(String id, double altura,  double radio) {
		super( id,  altura);
		this.radio=radio;
	}
	/**
	 * @return
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/* (non-Javadoc)
	 * @see Tanque#Volumen()
	 */
	public  double Volumen() {
		return Math.round(super.Volumen()*Math.pow(radio, 2)*Math.PI);
	}
	/* (non-Javadoc)
	 * @see Tanque#toString()
	 */
	@Override
	public String toString() {
		return id+  "[Capacidad = "+Volumen() +"m^3]";
	}

	
	
	
}
