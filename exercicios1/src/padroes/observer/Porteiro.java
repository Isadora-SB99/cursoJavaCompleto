package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
    
    private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

    public void registrarObservador(ObservadorChegadaAniversariante observador){
        observadores.add(observador);
    }

    public void monitorar(){
        Scanner ler = new Scanner(System.in);
        String valor = "";
        while (!"sair".equalsIgnoreCase(valor)) {
            System.out.print("Aniversariante chegou? ");
            valor = ler.nextLine();

            if ("sim".equalsIgnoreCase(valor)) {
                //criar evento
                EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
                //avisar convidados(/observadores)
                observadores.stream().forEach(o -> o.chegou(evento));
                valor = "sair";
            } else{
                System.out.println("Alarme falso");
            }
        }
        ler.close();
    }
}
