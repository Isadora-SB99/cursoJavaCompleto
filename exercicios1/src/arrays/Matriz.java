package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantos alunos tem na turma? ");
        int qtdAlunos = ler.nextInt();
        System.out.print("Quantas notas os alunos terão? ");
        int qtdNotas = ler.nextInt();

        double[][] notasDaTurma = new double [qtdAlunos][qtdNotas];
        
        double total = 0;
        for(int a = 0; a<notasDaTurma.length; a++){
            for(int n = 0; n<notasDaTurma[a].length; n++){
                System.out.print("Infrome a nota "+(n+1)+" do aluno "+(a+1)+": ");
                notasDaTurma[a][n] = ler.nextDouble();
                total += notasDaTurma[a][n];
            }
        }

        double media = total/(qtdAlunos*qtdNotas);
        System.out.println("A média da turma é: "+media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        ler.close();
    }
}
