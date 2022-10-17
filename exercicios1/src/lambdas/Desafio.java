package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);
        double taxaFrete = 50;
        double precoFinal = 0;
        double imposto = 0.085;

        //transformando em porcentagem
        UnaryOperator<Double> porcento = porc -> 1-porc;
        double desc = porcento.apply(p.desconto);
        //System.out.println("desc "+desc);

        //descontando a porcentagem do preco
        UnaryOperator<Double> desconto = valor -> valor*desc;
        double precoReal = desconto.apply(p.preco);
        //System.out.println("preco real "+precoReal);

        //fazendo a porcentagem do imposto
    //double imp = porcento.apply(0.085);
        
        //condicionando aplicação do imposto
        if (precoReal>=2500) {
                    //aqui está o erro na matemática: o certo seria preco*1.085
        //UnaryOperator<Double> imposto = valor -> valor/imp;
            UnaryOperator<Double> porcenTo = porc -> 1+porc;
            double imp = porcenTo.apply(imposto);
            UnaryOperator<Double> desconTo = valor -> valor*imp;
            double precoComImposto = desconTo.apply(p.preco);
            //System.out.println("preco imposto "+precoComImposto);
            if (precoComImposto>= 3000) {
                taxaFrete = 100;
                precoFinal = precoComImposto+taxaFrete;
                //System.out.println(precoFinal);
            }
        } else {
            precoFinal = precoReal+taxaFrete;
            //System.out.println(precoFinal);
        }

        /*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (R$100)/ < 3000 (R$50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */

        NumberFormat precoFinalFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        precoFinalFormatado.setMaximumFractionDigits(2);
        precoFinalFormatado.setGroupingUsed(false);
        System.out.println(precoFinalFormatado.format(precoFinal));
    }
}
