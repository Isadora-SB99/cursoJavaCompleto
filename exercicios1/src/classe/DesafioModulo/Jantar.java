package classe.DesafioModulo;

public class Jantar {
    //jantar main(instanciar pessoa, instancias 2 comidas: pessoa come comida
     //mostra peso antes e depois de comer)
     public static void main(String[] args) {
        Comida c1 = new Comida("feijão", 0.3);
        Comida c2 = new Comida("arroz", 0.25);

        Pessoa p1 = new Pessoa("Jorge", 8.5);
        Pessoa p2 = new Pessoa("Ana", 6.4);

        System.out.println(p1.nomePessoa+" pesa "+p1.pesoPessoa*10+"Kg");
        System.out.println(p2.nomePessoa+" pesa "+p2.pesoPessoa*10+"Kg");
        System.out.println();

        System.out.println("O "+c1.nomeComida+" pesa "+c1.pesoComida*1000+"g");
        System.out.println("O "+c2.nomeComida+" pesa "+c2.pesoComida*1000+"g");
        System.out.println();

        System.out.println(p1.nomePessoa+" come "+c2.nomeComida+", então agora pesa: "+p1.comer(c2)*10);
        System.out.println();
        System.out.println(p2.nomePessoa+" come "+c2.nomeComida+", então agora pesa: "+p2.comer(c2)*10);
        System.out.println();
        System.out.println(p1.nomePessoa+" come "+c1.nomeComida+", então agora pesa: "+p1.comer(c1)*10);
        System.out.println();
        //System.out.println(p1.nomePessoa+" come "+c2.nomeComida+", então agora pesa: "+p1.comer(c2)*10);
        //System.out.println();
        System.out.println(p2.nomePessoa+" come "+c1.nomeComida+", então agora pesa: "+p2.comer(c1)*10);
        System.out.println();
        //System.out.println(p1.nomePessoa+" come "+c2.nomeComida+", então agora pesa: "+p1.comer(c2)*10);
        //System.out.println();


     }
}
