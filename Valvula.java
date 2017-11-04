
public class Valvula {
	private boolean abierto;
	private String lugar;
	private int habitantes;
	
	public Valvula(boolean abierto, String lugar, int habitantes) {
		this.abierto=abierto;
		this.lugar=lugar;
		this.habitantes=habitantes;
	}

	public boolean isAbierto() {
		return abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	@Override
	public String toString() {
		return "Valvula [abierto=" + abierto + ", lugar=" + lugar + ", habitantes=" + habitantes + "]";
	}
	
	

}
