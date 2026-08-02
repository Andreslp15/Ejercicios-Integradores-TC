package logica;

public abstract class Planta {
    private String nombre;
    private double altoTalloo;
    private Boolean tieneHojas;
    private String climaIdeal;

    public Planta() {
    }

    public Planta(double altoTalloo, String climaIdeal, String nombre, Boolean tieneHojas) {
        this.altoTalloo = altoTalloo;
        this.climaIdeal = climaIdeal;
        this.nombre = nombre;
        this.tieneHojas = tieneHojas;
    }

    public double getAltoTalloo() {
        return altoTalloo;
    }

    public void setAltoTalloo(double altoTalloo) {
        this.altoTalloo = altoTalloo;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(Boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    protected abstract void mostrarInfo();

}
