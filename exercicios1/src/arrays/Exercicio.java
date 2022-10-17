package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        
        /*Arrays.toString(notasAlunoA) usado pra imprimir o array*/
        System.out.println(Arrays.toString(notasAlunoA));

        double total = 0;
        for(int i = 0; i<notasAlunoA.length; i++){
            total += notasAlunoA[i];
            System.out.printf("A nota %d é: %.2f\n" ,(i+1), notasAlunoA[i]);
        }
        double media = total/notasAlunoA.length;
        System.out.printf("A media do aluno é: %.2f", media);
    }
}
