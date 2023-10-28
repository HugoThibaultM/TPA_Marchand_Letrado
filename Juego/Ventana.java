package Vehiculos.Juego;

import javax.swing.JFrame;

/**
 * La clase Ventana representa la ventana principal del juego.
 */
public class Ventana extends JFrame {
    private JFrame ventana;
    private Player player;

    /**
     * Constructor de la clase Ventana.
     *
     * @param panel El panel que se agregará a la ventana para mostrar el juego.
     */
    public Ventana(Panel panel) {
        ventana = new JFrame();
        ventana.setSize(400, 400); // Tamaño de la ventana de juego
        ventana.add(panel);
        ventana.setVisible(true);
        player = new Player();
    }
}
