package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class DesafioAluno extends Pessoa {
    
    private Double nota;

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    
}
