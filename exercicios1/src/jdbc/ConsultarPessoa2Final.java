package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa2Final {
	public static void main(String[] args) throws SQLException {
		Scanner ler = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		System.out.print("Informe o trecho que deseja pesquisar no nome: ");
		String valor = ler.nextLine();

        System.out.println("Você deseja encontrar esse texto: \n1 - No começo do nome;\n2 - No final do nome;\n3 - Em qualquer lugar no nome;");
        int posicao = ler.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultado;
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        if (posicao == 1) {
            stmt.setString(1, valor + "%");
            resultado = stmt.executeQuery();
            while(resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                pessoas.add(new Pessoa(codigo, nome));
            }
            
            for(Pessoa p: pessoas) {
                System.out.println(p.getCodigo() + " ==> " + p.getNome());
            }
        } else if (posicao == 2){
            stmt.setString(1, "%" + valor);
            resultado = stmt.executeQuery();
            while(resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                pessoas.add(new Pessoa(codigo, nome));
            }
            
            for(Pessoa p: pessoas) {
                System.out.println(p.getCodigo() + " ==> " + p.getNome());
            }
        } else if (posicao == 3) {
            stmt.setString(1, "%" + valor + "%");
            resultado = stmt.executeQuery();
            while(resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nome = resultado.getString("nome");
                pessoas.add(new Pessoa(codigo, nome));
            }
            
            for(Pessoa p: pessoas) {
                System.out.println(p.getCodigo() + " ==> " + p.getNome());
            }
        }

		stmt.close();
		conexao.close();
		ler.close();
	}
}

