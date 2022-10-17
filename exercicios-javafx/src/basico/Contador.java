package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.function.BinaryOperator;

public class Contador extends Application {

    private int contador = 0;

    private void atualizarLabelNumero(Label label){
        label.setText(Integer.toString(contador));

        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");

        if (contador > 0){
            label.getStyleClass().add("verde");
        } else if (contador < 0) {
            label.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label lblTitulo = new Label("Contador");
        lblTitulo.getStyleClass().add("titulo");

        Label lblNumero = new Label("0");
        lblNumero.getStyleClass().add("numero");

        Button btnDecremento = new Button("-");
        btnDecremento.getStyleClass().add("botoes");
        btnDecremento.setOnAction(e -> {
            contador--;
            atualizarLabelNumero(lblNumero);
        });

        Button btnIncremento = new Button("+");
        btnIncremento.getStyleClass().add("botoes");
        btnIncremento.setOnAction(e -> {
            contador++;
            atualizarLabelNumero(lblNumero);
        });

        HBox boxBotao = new HBox();
        boxBotao.setAlignment(Pos.CENTER);
        boxBotao.setSpacing(20);
        boxBotao.getChildren().add(btnDecremento);
        boxBotao.getChildren().add(btnIncremento);

        VBox boxConteudo = new VBox();
        boxConteudo.getStyleClass().add("conteudo");
        boxConteudo.setSpacing(10);
        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getChildren().add(lblTitulo);
        boxConteudo.getChildren().add(lblNumero);
        boxConteudo.getChildren().add(boxBotao);

        String caminhoCSS = getClass().getResource("/basico/Contador.css").toExternalForm();
        Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
        cenaPrincipal.getStylesheets().add(caminhoCSS);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Oswald");

        stage.setScene(cenaPrincipal);
        stage.show();
    }
}
