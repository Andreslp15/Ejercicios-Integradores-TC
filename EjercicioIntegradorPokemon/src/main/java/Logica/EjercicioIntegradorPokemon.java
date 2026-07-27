package Logica;

public class EjercicioIntegradorPokemon {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle ();
        Charmander charma = new Charmander ();
        Bulbasaur bulba= new Bulbasaur ();
        Pikachu pika = new Pikachu ();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        squirtle.atacarPlacaje();
        squirtle.atacarPistolaagua();
        squirtle.atacarBurbuja();
        squirtle.atacarMordisco();
        charma.atacarAraniazo();
        charma.atacarLanzaLlamas();
        charma.atacarAscuas();
        charma.atacarPlacaje();
        charma.atacarMordisco();
        charma.atacarPunioFuego();
        bulba.atacarAraniazo();
        bulba.atacarDrenaje();
        bulba.atacarHojaAfilada();
        bulba.atacarMordisco();
        bulba.atacarParalizar();
        bulba.atacarLatigoCepa();
        pika.atacarAraniazo();
        pika.atacarImpactrueno();
        pika.atacarPlacaje();
        pika.atacarMordisco();
        pika.atacarRayo();
        pika.atacarPunioTrueno();
        pika.atacarRayoCarga();
    }
}
