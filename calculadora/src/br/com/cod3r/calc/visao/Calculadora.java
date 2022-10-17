package br.com.cod3r.calc.visao;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Calculadora extends JFrame {
    public Calculadora(){
        organizarLayout();

        setSize(250, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        setTitle("Calculadora");
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
        teclado.setBackground(Color.DARK_GRAY);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
