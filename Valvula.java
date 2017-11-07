
public class Valvula {
	private boolean abierto;
	private String lugar;
	private int habitantes;
	
	/**
	 * @param abierto
	 * @param lugar
	 * @param habitantes
	 */
	public Valvula(boolean abierto, String lugar, int habitantes) {
		this.abierto=abierto;
		this.lugar=lugar;
		this.habitantes=habitantes;
	}

	/**
	 * @return
	 */
	public boolean isAbierto() {
		return abierto;
	}

	/**
	 * @param abierto
	 */
	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}

	/**
	 * @return
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return
	 */
	public int getHabitantes() {
		return habitantes;
	}

	/**
	 * @param habitantes
	 */
	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Valvula [abierto=" + abierto + ", lugar=" + lugar + ", habitantes=" + habitantes + "]";
	}
	
	

}
