package teste.heranca;

import infra.DAO;
import modelo.heranca.DesafioAluno;
import modelo.heranca.Professor;

public class InserirAlunoProfessor {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();
        DesafioAluno aluno = new DesafioAluno();
        Professor professor = new Professor();

        dao.abrirT();
        aluno.setNome("Ana");
        aluno.setCodigo(20220001L);
        aluno.setNota(8.9);

        professor.setNome("Paulo");
        professor.setCodigo(20150059L);
        professor.setLogin("paulo@escola.br");
        professor.setSenha(12345);

        dao.incluir(aluno).incluir(professor).fecharT().fechar();
        System.out.println("inseridos com sucesso");
        
    }
}
