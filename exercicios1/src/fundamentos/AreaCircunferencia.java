package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        //int raio = 3;
        double raio = 3.4;
        //final transforma em constante, não dá pra mudar depois;
        //convenção: constante com nome maiusculo;
        final double PI = 3.14159;
        //System.out.println(pi*raio*raio);
        double area = PI*raio*raio;
        System.out.println(area);
        raio=10;
        area = PI*raio*raio;
        System.out.println("Area:"+area+"m2");

    }
}
