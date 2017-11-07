import java.util.Arrays;

public class Tanque {
	private Valvula valvula[];
	protected String id;
	protected double altura;
	//protected String fabrirV;
	//protected String fcerrarV;
	
	/**
	 * 
	 */
	public Tanque() {
		id = "";
		altura = 0;
		//fabrirV = "";
		//fcerrarV = "";
	}
	/**
	 * @param id
	 * @param altura
	 */
	public Tanque(String id, double altura){
		this.id =id;
		this.altura=altura;
	//	this.fabrirV=fabrirV;
	//	this.fcerrarV=fcerrarV;
	}
	/**
	 * @return
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/*public String getFabrirV() {
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
	}*/
	public double Volumen() {
		return altura;
	}
	/**
	 * @param gasto
	 * @return
	 */
	public double gasto(double volN, double gasto) {
		while(volN>0) {
			
		}
		return volN-gasto;
	}
	/**
	 * @return
	 */
	public double disponible() {
		return 0;
	}
	/**
	 * @return
	 */
	public String advertencia() {
		return "";
	}
	/**
	 * @return
	 */
	public String agregarFA() {
		return "";
	}
	/**
	 * @return
	 */
	public String agregarFC() {
		return "";
	}
	/**
	 * @return
	 */
	public Valvula[] getValvula() {
		return valvula;
	}
	/**
	 * @param valvula
	 */
	public void setValvula(Valvula valvula[]) {
		this.valvula = valvula;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tanque [valvula=" + Arrays.toString(valvula) + ", id=" + id + ", altura=" + altura + "]";
	}
	
	
}
