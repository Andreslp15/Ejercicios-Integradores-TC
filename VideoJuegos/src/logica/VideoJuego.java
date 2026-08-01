package logica;

public class VideoJuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int cantidad_jugadores;
    private String categoria;

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String titulo, String consola, int cantidad_jugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidad_jugadores = cantidad_jugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    public void setCantidad_jugadores(int cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantidad_jugadores=" + cantidad_jugadores +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
