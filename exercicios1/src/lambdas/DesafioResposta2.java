package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioResposta2 {
    public static void main(String[] args) {
        
        //essa parte foi copiada da resposta do professor
        Function<Produto, Double> precoFinal = produto -> produto.preco*(1-produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco*1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco+100 : preco+50;

        Produto p = new Produto("iPad", 3235.89, 0.13);

        double preco = precoFinal.andThen(impostoMunicipal).andThen(frete).apply(p);

        //essa parte eu fiz pesquisando
        NumberFormat precoFinalFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        precoFinalFormatado.setMaximumFractionDigits(2);
        precoFinalFormatado.setGroupingUsed(false);
        System.out.println(precoFinalFormatado.format(preco));
    }
}
