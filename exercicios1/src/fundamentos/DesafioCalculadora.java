package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    /*
     * ler num1
     * ler num2
     * + - * / %
     * num1 > num2
     */

     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("informe o primeiro valor: ");
        Double num1 = ler.nextDouble();

        System.out.print("informe o segundo valor: ");
        Double num2 = ler.nextDouble();

        System.out.print("Informe a operação desejada (+, -, *, , %): ");
        String op = ler.next();


        double resultado = "+".equals(op) ? num1+num2 :0;
        //vai "resultado" depois dos ":" pq se tiver sido V na linha anterior, ele retorna o proximo resultado.
        resultado = "-".equals(op) ? num1-num2 :resultado;
        resultado = "*".equals(op) ? num1*num2 :resultado;
        resultado = "/".equals(op) ? num1/num2 :resultado;
        resultado = "%".equals(op) ? num1%num2 :resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
        ler.close();
     }
}
