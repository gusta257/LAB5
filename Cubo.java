
public class Cubo extends Tanque{
	
	public Cubo() {
		super();
	}
	/**
	 * @param id
	 * @param altura
	 */
	public Cubo(String id, double altura) {
		super( id,  altura);
	}
	
	/* (non-Javadoc)
	 * @see Tanque#Volumen()
	 */
	public double Volumen() {
		return Math.pow(super.Volumen(), 3);
	}
	/* (non-Javadoc)
	 * @see Tanque#gasto(double)
	 */
	public double gasto(double gasto) {
		return Volumen()-gasto;
	}
	/* (non-Javadoc)
	 * @see Tanque#toString()
	 */
	@Override
	public String toString() {
		return id+"  [Capacidad= " +Volumen()+  "m^3]";
	}

}
