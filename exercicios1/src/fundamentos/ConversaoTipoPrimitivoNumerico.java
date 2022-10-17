package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        double a = 1; //conversão implícita
        System.out.println("a "+a);

        float b = (float) 1.0; //float é automaticamente lido como double(padrão do java), então tem que especificar (CAST)
        float b2 = 1.0F; // esse sistema funciona, mas não é exatamente uma conversão, apenas uma afirmação de tipo variavel
        System.out.println("b "+b+" b2 "+b2);

        /* conversão estranha, melhor evitar */
        int c = 128;
        byte d = (byte) c;
        System.out.println("d "+d);

        double e = 1.9999999;
        int f = (int) e;
        System.out.println("f "+f);
    }
}
