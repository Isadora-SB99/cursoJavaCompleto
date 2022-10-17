package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        //Produto.desconto = 0.29;
        Produto p1 = new Produto("Notebook", 4356.89);
        //p1.nome = "Notebook"; //p1.preco = 4356.89; //p1.desconto = 0.25;
        double precoFinal1 = p1.precoComDesconto();
        System.out.println(p1.nome +" R$"+ p1.preco);
        System.out.println("Desconto: "+(Produto.desconto*100)+"%");
        //System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.printf("Preço final: R$%.2f\n\n", precoFinal1);

        
		

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        //Produto.desconto = 0.30;
        double precoFinal2 = p2.precoComDesconto(0.1);
        System.out.println(p2.nome +" R$"+ p2.preco);
        System.out.println("Desconto: "+(Produto.desconto*100)+"%");
        //System.out.println(p2.nome + " " + p2.precoComDesconto(0.1));
        System.out.printf("Preço final: R$%.2f\n\n", precoFinal2);

        
        Produto.desconto = 0.5;
        
        Produto p3 = new Produto("Caneca", 30.00);
        double precoFinal3 = p3.precoComDesconto();
        System.out.println(p3.nome +" R$"+ p3.preco);
        System.out.println("Desconto: "+(Produto.desconto*100)+"%");
        System.out.printf("Preço final: R$%.2f\n\n", precoFinal3);

        double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3)/3;
        System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
    }
}
