package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {
        /*
        int a = 3*4-10;
        int b = (int) Math.pow(a,3);

        System.out.println(a); 
        System.out.println(b);
        */
        /* (((((6*(3+2))^2)/(3*2))-((((1-5)*(2-7))/2)^2))^3)/(10^3))

        ((parte1/divisor1)-parte2)
        elevado/divisorGeral
         */


        double soma1 = (3+2);
        double mult1 = (6*soma1);
        double total1 = Math.pow(mult1, 2);
        double divisor1 = (3*2);
        double parte1 = (total1/divisor1);

        double sub1 = (1-5);
        double sub2 = (2-7);
        double mult2 = (sub1*sub2);
        double divisao1 = (mult2/2);
        double parte2 = Math.pow(divisao1, 2);

        double elevado = Math.pow((parte1-parte2), 3);
        double divisorGeral = Math.pow(10,3);
        
        double equacao = elevado/divisorGeral;
        System.out.println(equacao);
    }
}
