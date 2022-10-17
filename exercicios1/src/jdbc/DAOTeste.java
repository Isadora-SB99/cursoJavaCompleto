package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();
    
        String sql = "insert into pessoas (nome) values (?)";
        System.out.println(dao.incluir(sql, "João da Silva"));
        System.out.println(dao.incluir(sql, "Ana Júlia"));
        System.out.println(dao.incluir(sql, "Djalma Pereira"));
        
        sql = "insert into pessoas (nome, codigo) values (?, ?)";
        System.out.println(dao.incluir(sql, "Pedro Sousa", 100));
        System.out.println(dao.incluir(sql, "Maria Clara", 101));
        System.out.println(dao.incluir(sql, "Renato Coutinho", 102));
        
        dao.close();
        
    }
}
