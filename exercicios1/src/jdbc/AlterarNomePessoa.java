package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {
        try (Scanner ler = new Scanner(System.in)) {
            Connection conexao = FabricaConexao.getConexao();
            String sql = "update pessoas set nome = ? where codigo = ?";

            System.out.print("Informe o nome da pessoa que deseja alterar: ");
            String nome = ler.nextLine();

            System.out.print("Informe o novo nome: ");
            nome = ler.nextLine();
                
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            //stmt.setInt(2, codigo);
            ResultSet resultado = stmt.executeQuery();     

            List<Pessoa> pessoas = new ArrayList<>();
            
            while(resultado.next()) {
            	int codigo = resultado.getInt("codigo");
            	nome = resultado.getString("nome");
            	pessoas.add(new Pessoa(codigo, nome));
            }
            
            for(Pessoa p: pessoas) {
            	System.out.println(p.getCodigo() + " ==> " + p.getNome());
            }
        }
        
    }
}
