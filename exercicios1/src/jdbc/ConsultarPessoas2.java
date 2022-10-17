package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {
        Scanner ler = new Scanner(System.in);
        

        System.out.print("Informe o trecho que deseja pesquisar no nome: ");
        String trecho = ler.nextLine();

        System.out.println("Você deseja encontrar esse texto: \n1 - No começo do nome;\n2 - No final do nome;\n3 - Em qualquer lugar no nome;");
        int posicao = ler.nextInt();

        Connection conexao = FabricaConexao.getConexao();
        String sql;
        
        Statement stmt = conexao.createStatement();
        ResultSet resultado;

        switch (posicao) {
            case 1:
                sql = "select * from pessoas where nome like '"+trecho+"%';";
                resultado = stmt.executeQuery(sql);
                System.out.println(resultado.getString("nome"));
                break;
            case 2:
                sql = "select * from pessoas where nome like '%"+trecho+"';";
                resultado = stmt.executeQuery(sql);
                System.out.println(resultado.getString("nome"));
                break;
            case 3:
                sql = "select * from pessoas where nome like '%"+trecho+"%';";
                resultado = stmt.executeQuery(sql);
                System.out.println(resultado.getString("nome"));
                break;
        
            default:
                System.out.println("Opção invalida");
        }
         
        System.out.println("ok");
         
        ler.close();
    }
}
