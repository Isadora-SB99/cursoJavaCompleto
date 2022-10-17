package classe;

public class Data {
    int dia;
    int mes;
    int ano;
    /*
     * acrescentar construtores: o padrão e um com dia, mes e ano
     * quando for o construtor padrao data= 01/01/1970
     */
    Data (){
        /*dia = 01;
        mes = 01;
        ano = 1970;*/
        this(1,1,1970);//construtor this; this como método
    }

    //this é na variável de fora
    Data(int dia, int mes, int ano) {
		this.dia = dia; //this é usado pra referenciar o objeto atual
		this.mes = mes;
		this.ano = ano;
	}

    String obterDataFormatada (){
        String data = dia+"/"+mes+"/"+ano;
        return data;
    }
}
