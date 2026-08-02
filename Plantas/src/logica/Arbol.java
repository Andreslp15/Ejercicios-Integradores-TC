package logica;

public class Arbol extends Planta{
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHoja;

    public Arbol() {
    }

    public Arbol(double altoTalloo, String climaIdeal, String nombre, Boolean tieneHojas, String color, double radioTronco, String tipoHoja, String tipoTronco, String variedad) {
        super(altoTalloo, climaIdeal, nombre, tieneHojas);
        this.color = color;
        this.radioTronco = radioTronco;
        this.tipoHoja = tipoHoja;
        this.tipoTronco = tipoTronco;
        this.variedad = variedad;
    }

    // Punto 3
    @Override

    public void mostrarInfo(){
        System.out.println("Hola soy un arbol");
    }

}
