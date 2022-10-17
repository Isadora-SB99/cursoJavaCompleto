package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("informe seu nome: ");
        String nome = ler.nextLine();
        System.out.print("informe seu sobrenome: ");
        String sobrenome = ler.nextLine();
        //System.out.println("nome: "+nome+" "+sobrenome);
        System.out.print("Informe sua idade: ");
        int idade = ler.nextInt();
        System.out.println(nome+" "+sobrenome+" tem "+idade+" anos");
        //fechar o scanner pra não ocupar codigo
        ler.close();
    }
}
