package fundamentos;

public class Temperatura {
    //converter de F pra C
    public static void main(String[] args) {
        //((F-32)*(5/9)=C)
        double F, C;
        final double SUB = 32;
        final double DIV = (5/9.0);
        F=86;
        C = (F - SUB) * DIV;
        System.out.println("Sendo a temp em F: "+F+", a temp em C é: "+C);
    }
}
