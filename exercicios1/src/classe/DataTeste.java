package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(23, 9, 1999);
        Data data2 = new Data();
        //data2.ano = 2021;

        /*
        data2.dia = 05;
        data2.mes = 05;
        data2.ano = 2021;
        */


        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        //System.out.printf("primeira data: %d/%d/%d\n", data1.dia, data1.mes, data1.ano);
        //System.out.printf("segunda data: %d/%d/%d", data2.dia, data2.mes, data2.ano);
    }
}
