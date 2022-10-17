package modelo.heranca;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa {
    
    private String login;

    private int senha;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
}
