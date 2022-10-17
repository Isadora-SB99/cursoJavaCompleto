package classe.DesafioModulo;

public class Pessoa {
   //pessoa (nome, peso, metodo comer{param.outro obj classe comimda: peso pessoa+pesoComida})
    String nomePessoa;
    double pesoPessoa;
    //double pesoComida = Comida.pesoComida;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    } 

    double comer(Comida comida){
        double pesoFinal = this.pesoPessoa += comida.pesoComida;
        return pesoFinal;
    }
}
