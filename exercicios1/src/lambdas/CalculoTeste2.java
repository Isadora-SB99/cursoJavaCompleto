package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        /*
         * teste1 usou o "normal". precisa criar uma classe pra executar cada operação...
         * teste2 usando lambdas. cria uma funcão sem nome;
         * precisa ser compativel com a função da interface,
         * ter os mesmos parametros e o mesmo retorno
         * usando lambda não precisa de metodos específicos pra cada operação
         */
        Calculo calculo = (x,y) -> {return x+y; };
        System.out.println(calculo.excecutar(2, 3));
        
        calculo = (x,y) -> x*y;
        System.out.println(calculo.excecutar(2, 3));
        /*
         * o uso de chaves nas funções lambda são semelhantes à do if.
         * se for só uma linha de codigo pode omitir as chaves e tirar o return,
         * mas se for mais codigo precisa das chaves
         */

         System.out.println(calculo.legal());
         System.out.println(Calculo.muitoLegal());
    }
}
