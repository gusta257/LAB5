import java.util.ArrayList;

public class Acueducto {
	/**
	 * 
	 */
	private ArrayList<Tanque> tanques;
	
	/**
	 * 
	 */
	public Acueducto() {
		// TODO Auto-generated constructor stub
		tanques = new ArrayList<Tanque>();
	}
	/**
	 * @param id
	 * @param altura
	 */
	public void llenarCubo(String id, double altura) {
		Tanque tanqCub = new Cubo(id, altura);
		tanques.add(tanqCub);
		//System.out.println(tanques.get(0));
	}
	/**
	 * @param id
	 * @param altura
	 * @param largo
	 * @param ancho
	 */
	public void llenarOrto(String id, double altura, double largo, double ancho) {
		Tanque tanqO = new Ortogonal( id,  altura,  largo,  ancho);
		tanques.add(tanqO);
		//System.out.println(tanques.get(1));
	}
	/**
	 * @param id
	 * @param altura
	 * @param radio
	 */
	public void llenarCil(String id, double altura,  double radio) {
		Tanque tanqCil = new Cilindro(id, altura, radio);
		tanques.add(tanqCil);
		//System.out.println(tanques.get(2));
	}
	/**
	 * 
	 */
	public void imprime() {
        for (int i = 0; i < tanques.size(); i++) {
            System.out.println((i+1) + ". Tanque " + tanques.get(i).toString());
        }
	}
	
	public ArrayList<Tanque> getTanques() {
		return tanques;
	}
	public void setTanques(ArrayList<Tanque> tanques) {
		this.tanques = tanques;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Acueducto [tanques=" + tanques + "]";
	}
	
	
}
