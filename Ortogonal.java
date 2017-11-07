
public class Ortogonal extends Tanque{
	private double ancho;
	private double largo;
	
	public Ortogonal() {
		super();
	}
	public Ortogonal(String id, double altura, double largo, double ancho) {
		super( id,  altura);
		this.ancho=ancho;
		this.largo=largo;
	}
	/* (non-Javadoc)
	 * @see Tanque#Volumen()
	 */
	public double Volumen() {
		return super.Volumen()*ancho*largo;
	}
	/**
	 * @return
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * @param ancho
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return
	 */
	public double getLargo() {
		return largo;
	}
	/**
	 * @param largo
	 */
	public void setLargo(double largo) {
		this.largo = largo;
	}
	/* (non-Javadoc)
	 * @see Tanque#toString()
	 */
	@Override
	public String toString() {
		return id+ " [Capacidad= " + Volumen() + "m^3]";
	}	

}
