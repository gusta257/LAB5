public class Municipio {
    private String nombre;
    private double promedioHabitantes;
    private double promedioConsumoPorHabitante;

    public Municipio(String nombre, double promedioHabitantes) {
        this.nombre = nombre;
        this.promedioHabitantes = promedioHabitantes;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedioHabitantes() {
        return promedioHabitantes;
    }

    public void setPromedioHabitantes(double promedioHabitantes) {
        this.promedioHabitantes = promedioHabitantes;
    }

    public double getPromedioConsumoPorHabitante() {
        return promedioConsumoPorHabitante;
    }

    public void setPromedioConsumoPorHabitante(double promedioConsumoPorHabitante) {
        this.promedioConsumoPorHabitante = promedioConsumoPorHabitante;
    }

    @Override
    public String toString() {
        return "Municipio{" + "nombre=" + nombre + ", promedioHabitantes=" + promedioHabitantes + '}';
    }
}