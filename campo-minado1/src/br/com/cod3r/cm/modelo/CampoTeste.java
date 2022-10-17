package br.com.cod3r.cm.modelo;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {

    private Campo campo;

    @Before
    public void iniciarCampo(){
        campo = new Campo(3,3);
    }

    @Test
    public void testeVizinhoDistancia1Esquerda(){
        Campo vizinho = new Campo (3,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistancia1Direita(){
        Campo vizinho = new Campo (3,4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistancia1EmCima(){
        Campo vizinho = new Campo (2,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistancia1EmBaixo(){
        Campo vizinho = new Campo (4,3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoDistancia2(){
        Campo vizinho = new Campo (2,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertTrue(resultado);
    }
    
    @Test
    public void testeNaoVizinho(){
        Campo vizinho = new Campo (1,1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        assertFalse(resultado);
    }

    @Test
    public void testeValorPadraoAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test
    public void testeAlternarMarcacao(){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    public void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }
    
    @Test
    public void testeAbrirNaoMinadoNaoMArcado(){
        assertTrue(campo.abrir());
    }
    
    @Test
    public void testeAbrirNaoMinadoMArcado(){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }
    
    @Test
    public void testeAbrirMinadoMArcado(){
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }
    
/*    @Test
    public void testeAbrirMinadoNaoMArcado(){
        campo.minar();
        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });
    }*/

    @Test
    public void testeAbrirComVizinhos1(){
        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);

        campo22.adicionarVizinho(campo11);
        campo.adicionarVizinho(campo22);
        
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    
    }
    @Test
    public void testeAbrirComVizinhos2(){
        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 2);        
        Campo campo22 = new Campo(2, 2);

        campo12.minar();

        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);
        campo.adicionarVizinho(campo22);
        
        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isFechado());
    }
    
    @Test
    public void testeAbrirComVizinhoMinado(){
        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);

        campo22.adicionarVizinho(campo11);
        campo.adicionarVizinho(campo22);

        campo22.minar();
        
        campo.abrir();

        assertFalse(campo22.isAberto());
    }





}
