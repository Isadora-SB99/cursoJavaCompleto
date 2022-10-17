import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo {
    requires transitive app.logging;
    exports br.com.cod3r.app.calculo;

    //exports br.com.cod3r.app.calculo.interno to app.financeiro;

    opens br.com.cod3r.app.calculo to app.financeiro;

    requires app.api;
    provides br.com.cod3r.app.Calculadora //modo 1 - caminho absoluto
            with CalculadoraImpl; //modo 2 - com import
}