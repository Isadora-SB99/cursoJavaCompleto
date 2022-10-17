package fundamentos;

import java.util.Scanner;

public class DesafioConversao{
    public static void main(String[] args) {
        /*pedir 3 strings; ultimos 3salarios> media; pode separar com virgula ou ponto */
        double s1;
        double s2;
        double s3;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("informe seus três ultimos salários:");
        System.out.print("salario 1: ");
        String salario1 = ler.nextLine().replace(",", ".");
        System.out.print("salario 2: ");
        String salario2 = ler.nextLine().replace(",", ".");
        System.out.print("salario 3: ");
        String salario3 = ler.nextLine().replace(",", ".");

        s1 = Double.parseDouble(salario1);
        s2 = Double.parseDouble(salario2);
        s3 = Double.parseDouble(salario3);

        double media = (s1+s2+s3)/3;

        System.out.print("A media dos ultimos três salários é: "+media);

ler.close();
    }
}