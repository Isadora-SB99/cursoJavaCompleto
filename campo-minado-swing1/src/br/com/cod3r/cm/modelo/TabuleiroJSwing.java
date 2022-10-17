package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TabuleiroJSwing implements CampoObservadorJSwing {
    private final int linhas;
    private final int colunas;
    private final int minas;

    private final List<CampoJSwing> campos = new ArrayList<>();
    private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

    public TabuleiroJSwing(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public void paraCadaCampo(Consumer<CampoJSwing> funcao){
        campos.forEach(funcao);
    }

    public void registrarObservador(Consumer<ResultadoEvento> observador){
        observadores.add(observador);
    }

    private void notificarObservadores(boolean resultado){
        observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
    }

    public void abrir(int linha, int coluna){        
        campos.parallelStream()
        .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
        .findFirst()
        .ifPresent(c -> c.abrir());
    }
    
    public void alternarMarcacao(int linha, int coluna){
        campos.parallelStream()
        .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
        .findFirst()
        .ifPresent(c -> c.alternarMarcacaoJSwing());
    }
    
    private void gerarCampos() {
        for (int linha = 0; linha<linhas; linha++){
            for (int coluna = 0; coluna<colunas; coluna++){
                CampoJSwing campo = new CampoJSwing(linha, coluna);
                campo.registrarObservador(this);
                campos.add(campo);
            }
        }
    }
    
    private void associarVizinhos() {
        for (CampoJSwing c1 : campos) {
            for (CampoJSwing c2 : campos) {
                c1.adicionarVizinhoJSwing(c2);
            }
        }
    }
    
    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<CampoJSwing> minadoJSwing = c -> c.isMinadoJSwing();
        
        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minarJSwing();
            minasArmadas = campos.stream().filter(minadoJSwing).count();
        } while (minasArmadas < minas);
    }
    
    public boolean objetivoAlcancado(){
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }
    
    public void reiniciar(){
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    @Override
    public void eventoOcorreuJSwing(CampoJSwing campo, CampoEvento evento) {
        if (evento == CampoEvento.EXPLODIR) {
            mostrarMinas();
            notificarObservadores(false);
        } else if (objetivoAlcancado()) {
            notificarObservadores(true);
        }        
    }

    private void mostrarMinas(){
        campos.stream()
        .filter(c -> c.isMinadoJSwing())
        .forEach(c -> c.setAbertoJSwing(true));
    }
}
