package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.TabuleiroJSwing;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal(){
        //TabuleiroJSwing tabuleiro = new TabuleiroJSwing(16, 30, 50);
        TabuleiroJSwing tabuleiro = new TabuleiroJSwing(10, 10, 5);
        add(new PainelTabuleiro(tabuleiro));

        setTitle("Campo Minado");
        setSize(690, 438);
        //setSize(438, 438);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
