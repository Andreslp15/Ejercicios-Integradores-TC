import logica.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Punto 2

        List<VideoJuego> listaJuegos = new ArrayList<VideoJuego>();

        VideoJuego juego1 = new VideoJuego(1, "CDO", "Nintendo64", 2, "Aventura");
        VideoJuego juego2 = new VideoJuego(2, "Crash", "ps4", 1, "Aventura");
        VideoJuego juego3 = new VideoJuego(3, "Dios de la guerra", "ps5", 1, "Guerra");
        VideoJuego juego4 = new VideoJuego(4, "Fornite", "pC", 2, "Accion");
        VideoJuego juego5 = new VideoJuego(5, "Valorant", "ps4", 2, "Arcade");

        listaJuegos.add(juego1);
        listaJuegos.add(juego2);
        listaJuegos.add(juego3);
        listaJuegos.add(juego4);
        listaJuegos.add(juego5);

        // Punto 3

        for(VideoJuego juego: listaJuegos){
            System.out.println("Titulo: " + juego.getTitulo() + "Consola " + juego.getConsola() + "Cant Jugadores: " + juego.getCantidad_jugadores() + "Categoria: " + juego.getCategoria());
            System.out.println("-------------------------------------------------------");
        }

        // Punto 4 cambio de nombre jugadores

        juego2.setTitulo("Crash Bandicot");
        juego2.setCantidad_jugadores(1);
        juego4.setTitulo("Mario Kart");
        juego4.setCantidad_jugadores(2);

        // Punto 5

        for(VideoJuego juego: listaJuegos){
            if(juego.getConsola().equals("Nintendo64")){
                System.out.println(juego.toString());
            }
        }
    }
}
