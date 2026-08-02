package logica;

public class Flor extends Planta{
    private String colorPetalos;
    private double radioTronco;
    private String colorPristilio;
    private String colorDePetalos;
    private String variedadFlor;
    private String estacion;

    public Flor() {
    }

    public Flor(double altoTalloo, String climaIdeal, String nombre, Boolean tieneHojas, String colorDePetalos, String colorPetalos, String colorPristilio, String estacion, double radioTronco, String variedadFlor) {
        super(altoTalloo, climaIdeal, nombre, tieneHojas);
        this.colorDePetalos = colorDePetalos;
        this.colorPetalos = colorPetalos;
        this.colorPristilio = colorPristilio;
        this.estacion = estacion;
        this.radioTronco = radioTronco;
        this.variedadFlor = variedadFlor;
    }

    public void mostrarInfo(){
        System.out.println("Hola soy una flor");
    }
}

