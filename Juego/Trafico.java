package Vehiculos.Juego;

/**
 * La clase Trafico gestiona la posición de rocas en el juego y lleva un registro de puntos.
 */
public class Trafico {
    public static int xRoca1 = 600, yRoca1 = 700;
    public static int xRoca2 = 700, yRoca2 = 100;
    public static int xRoca3 = -20, yRoca3 = 600;
    public static int xRoca4 = 300, yRoca4 = -20;

    public static int puntos = 0;
    public Juego game;
    public static int nivel = 1;
    int incremento = 2;

    int inicioY = 0;
    int inicioX = 0;
    int finY = 900;
    int finX = 700;

    /**
     * Constructor de la clase Trafico.
     *
     * @param game2 El objeto de la clase Juego al que está asociada esta instancia de Trafico.
     */
    public Trafico(Juego game2) {
        this.game = game2;
    }

    /**
     * Obtiene la cantidad de puntos acumulados en el juego.
     *
     * @return La cantidad de puntos acumulados.
     */
    public int obtenerPuntos() {
        return puntos;
    }
}

/**
 * Comprueba si ha ocurrido una colisión entre el vehículo del jugador y las rocas en el juego.
 *
 * @return true si ha ocurrido una colisión, false en caso contrario.
 */
/**public boolean choque(){
 AreaPersonaje=newArea(game.vehiculo.getBoundsVehiculo());
 areaPersonaje.intersect(getBoundsTrafic());
 return !areaPersonaje.isEmpty();
 }
 }*/