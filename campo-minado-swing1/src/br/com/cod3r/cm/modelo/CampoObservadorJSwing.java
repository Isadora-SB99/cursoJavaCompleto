package br.com.cod3r.cm.modelo;

@FunctionalInterface
public interface CampoObservadorJSwing {
    
    public void eventoOcorreuJSwing(CampoJSwing campo, CampoEvento evento);

}
