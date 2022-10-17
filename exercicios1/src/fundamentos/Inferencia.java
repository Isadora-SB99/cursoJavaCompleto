package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);
        c = "Outro texto";
        System.out.println(c);
        //c=4.5; // não pode trocar o tipo de var;

        double d;
        d=123.56;
        System.out.println(d);

        /*//dá erro, pois var tem que inicializar na declaração;
        var e;
        e=123.56;
        */
    }
}
