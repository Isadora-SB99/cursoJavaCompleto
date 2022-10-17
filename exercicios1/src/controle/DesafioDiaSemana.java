package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("informe um dia da semana");
        String dia = ler.nextLine();

        if (dia.equals("Domingo") || dia.equals("domingo")) {
            System.out.println("1");
        } else if (dia.equals("Segunda") || dia.equals("segunda")) {
            System.out.println("2");
        } else if (dia.equals("Terca") || dia.equals("terca")) {
            System.out.println("3");
        }else if (dia.equals("Quarta") || dia.equals("quarta")) {
            System.out.println("4");
        }else if (dia.equals("Quinta") || dia.equals("quinta")) {
            System.out.println("5");
        }else if (dia.equals("Sexta") || dia.equals("sexta")) {
            System.out.println("6");
        }else if (dia.equals("Sabado") || dia.equals("sabado")) {
            System.out.println("7");
        }
        ler.close();
    }
    
}
