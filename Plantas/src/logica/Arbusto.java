package logica;

public class Arbusto extends Planta{
    private double anchoArbusto;
    private Boolean esDomestico;
    private String variedadArbusto;
    private String colorHojas;
    private Boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(double altoTalloo, String climaIdeal, String nombre, Boolean tieneHojas, double anchoArbusto, String colorHojas, Boolean esDomestico, Boolean sePodaONo, String variedadArbusto) {
        super(altoTalloo, climaIdeal, nombre, tieneHojas);
        this.anchoArbusto = anchoArbusto;
        this.colorHojas = colorHojas;
        this.esDomestico = esDomestico;
        this.sePodaONo = sePodaONo;
        this.variedadArbusto = variedadArbusto;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Hola soy un arbusto");
    }

}
