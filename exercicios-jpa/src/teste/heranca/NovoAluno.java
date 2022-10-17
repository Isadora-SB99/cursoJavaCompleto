package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {
        DAO<Aluno> alunoDao = new DAO<>();
        
        Aluno aluno = new Aluno(123L, "João");
        AlunoBolsista alunoB = new AlunoBolsista(345L, "Maria", 1000);
        
        alunoDao.incluirAtomico(aluno);
        alunoDao.incluirAtomico(alunoB);

        alunoDao.fechar();

    }
}