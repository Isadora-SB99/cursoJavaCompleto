package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas notas deseja informar?");
        int quantNotas = ler.nextInt();

        double notas[] = new double [quantNotas];

        for(int i = 0; i<notas.length; i++){
            System.out.println("Digite a nota "+(i+1));
            notas[i] = ler.nextDouble();
        }
        System.out.println("As notas do aluno são: "+Arrays.toString(notas));
        
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
            
        }
        //System.out.println(soma);

        double media = soma/notas.length;
        System.out.printf("A media do aluno é: %.2f", media);
        ler.close();
    }
}
