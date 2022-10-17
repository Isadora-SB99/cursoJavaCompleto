package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class CampoJSwing {
    private final int linhaJSwing;
    private final int colunaJSwing;
    
    private boolean abertoJSwing;
    private boolean minadoJSwing;
    private boolean marcadoJSwing;

    private List<CampoJSwing> vizinhos = new ArrayList<>();
    private List<CampoObservadorJSwing> observadores = new ArrayList<>();

    CampoJSwing(int linhaJSwing, int colunaJSwing){
        this.linhaJSwing = linhaJSwing;
        this.colunaJSwing = colunaJSwing;
    }

    public void registrarObservador(CampoObservadorJSwing observador){
        observadores.add(observador);
    }

    private void notificarObservadores(CampoEvento evento){
        observadores.stream().forEach(o -> o.eventoOcorreuJSwing(this, evento));
    }

    boolean adicionarVizinhoJSwing(CampoJSwing vizinho){
        boolean linhaDiferente = linhaJSwing != vizinho.linhaJSwing;
        boolean colunaDiferente = colunaJSwing != vizinho.colunaJSwing;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinhaJSwing = Math.abs(linhaJSwing - vizinho.linhaJSwing);
        int deltaColunaJSwing = Math.abs(colunaJSwing - vizinho.colunaJSwing);
        int deltaGeralJSwing = deltaColunaJSwing + deltaLinhaJSwing;

        if (deltaGeralJSwing == 1 && !diagonal) {
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeralJSwing == 2 && diagonal) {
            vizinhos.add(vizinho);
            return true;
        }else{
            return false;
        }
        
    }

    public void alternarMarcacaoJSwing(){
        if (!abertoJSwing) {
            marcadoJSwing = !marcadoJSwing;

            if (marcadoJSwing) {
                notificarObservadores(CampoEvento.MARCAR);
            }else{
                notificarObservadores(CampoEvento.DESMARCAR);
            }
        }
    }

    public boolean abrir(){
        if (!abertoJSwing && !marcadoJSwing) {            
            if (minadoJSwing) {
                notificarObservadores(CampoEvento.EXPLODIR);
                return true;
            }
            setAbertoJSwing(true);
            
            if (vizinhancaSeguraJSwing()) {
                vizinhos.forEach(v -> v.abrir());
            }
            return true;
        } else{
            return false;
        }
    }

    public boolean vizinhancaSeguraJSwing(){
        return vizinhos.stream().noneMatch(v -> v.minadoJSwing);
    }

    void minarJSwing(){
        minadoJSwing = true;
    }

    public boolean isMinadoJSwing(){
        return minadoJSwing;
    }

    public boolean isMarcadoJSwing(){
        return marcadoJSwing;
    }    

    void setAbertoJSwing(boolean aberto) {
        this.abertoJSwing = aberto;
        if (aberto) {
            notificarObservadores(CampoEvento.ABRIR);
        }
    }

    public boolean isAberto(){
        return abertoJSwing;
    }

    public boolean isFechado(){
        return !isAberto();
    }

    public int getLinha() {
        return linhaJSwing;
    }

    public int getColuna() {
        return colunaJSwing;
    }

    boolean objetivoAlcancado(){
        boolean desvendado = !minadoJSwing && abertoJSwing;
        boolean protegido = minadoJSwing && marcadoJSwing;
        return desvendado || protegido;
    }

    public int minasNaVizinhanca(){
        return (int) vizinhos.stream().filter(v -> v.minadoJSwing).count();
    }

    void reiniciar(){
        abertoJSwing = false;
        minadoJSwing = false;
        marcadoJSwing = false;
        notificarObservadores(CampoEvento.REINICIAR);
    }    
}
