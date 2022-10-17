package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        /*
         * receber notas entre 0 e 10
         * contador de quantas notas foram incluidas
         * ir somando as notas
         * fazer a media no final
         * sinal de saida "-1"
         */
        Scanner ler = new Scanner(System.in);

        double nota = 0;
        double notaTotal = 0;
        int i = 0;
        
         System.out.println("Iniciando a contagem de notas. Digite -1 para finalizar.");
         while(nota!=-1){
            System.out.println("Informe a proxima nota:");
            nota = ler.nextDouble();
            if (nota>=0 && nota<=10) {
                notaTotal+=nota;
                i++;
                
            }else if (nota>10){
                System.out.println("Por favor, digite uma nota válida.");
            }
         }
         System.out.println("A nota total é: "+notaTotal+"; Foram inseridas "+i+" notas válidas.");
         double media = notaTotal/i;
         System.out.printf("A media das notas é: %.2f", media);

         ler.close();
    }
}
