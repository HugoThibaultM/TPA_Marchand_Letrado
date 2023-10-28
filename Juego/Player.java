package Vehiculos.Juego;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * La clase Player representa al jugador en el juego y gestiona su movimiento.
 */
public class Player implements KeyListener {
    public static int x = 10, y = 10;
    private final boolean[] keys = new boolean[256]; // debido a que hay 256 teclas y cada número es una de ellas
    public static boolean LEFT, RIGHT; // declaramos los controles que usaremos en el juego para moverse de un lado a otro
    private final int velocidad = 5;

    /**
     * Constructor de la clase Player.
     */
    public Player() {
        LEFT = false;
        RIGHT = false;
    }

    /**
     * Actualiza la posición del jugador en función de las teclas presionadas.
     */
    public void update() {
        if (LEFT && x > 0) {
            x -= velocidad;
        }
        if (RIGHT && x < 750) {
            x += velocidad;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            LEFT = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            RIGHT = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            LEFT = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            RIGHT = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}


/**
     * Obtiene un objeto Ellipse2D que representa los límites del coche del jugador.
     *
     * @return Objeto Ellipse2D que representa los límites del coche del jugador.
     */
    /*
    public Ellipse2D getBoundsCoche() {
        return new Ellipse2D.Double(x + 10, y + 30, 80, 50);
    }

    /**
     * Comprueba si el jugador ha llegado al final del nivel.
     *
     * @return true si el jugador ha llegado al final, false en caso contrario.
     */
    /*
    public boolean llegaFinal() {
        Rectangle cuadrado = new Rectangle(320, 820, 110, 110);
        Area cuadradoArea = new Area(cuadrado);
        return cuadradoArea.contains(getBoundsCoche());
    }
}
*/