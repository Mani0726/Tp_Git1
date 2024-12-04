package org.github.amandineLaymajoux;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends Canvas implements WindowListener {
    public static void main(String[] args) {

        Main main = new Main();
        Frame f = new Frame();
        f.add(main);
        f.setTitle("Coucou amandine");
        f.setSize(100, 100);
        f.setVisible(true);
        //commentaire
        System.out.println("Hello, World!");
        System.out.println("On va afficher une page oki ?");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Couleur du cœur
        g.setColor(Color.RED);

        // Points du cœur (forme approximative dans une fenêtre 100x100)
        int[] xPoints = {50, 30, 10, 30, 50, 70, 90, 70};
        int[] yPoints = {30, 10, 30, 60, 90, 60, 30, 10};

        // Dessin du polygone du cœur
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}