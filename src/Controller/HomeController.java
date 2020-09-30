package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class HomeController {



    @FXML
    private TextField txtN;



    @FXML
    private TextField txtComplexidade;


    @FXML
    private TextField txtProcessamento;



    @FXML
    private Button btnVerificar;



    @FXML
    private Label labelResultado;


    @FXML
    private TextField txtConjuntoDeNumerosBusca;

    @FXML
    private TextField txtnumeros;

    @FXML
    private Button btnBuscar;

    @FXML
    private Label labelResultadoBusca;

    @FXML
    private TextField txtConjuntoDeNumeros;

    @FXML
    private RadioButton radioInsertion;

    @FXML
    private RadioButton radioBubble;

    @FXML
    private RadioButton radioSelection;

    @FXML
    private Label labelResultadoOrdenação;

    @FXML
    private Button btnSelecionar;

    @FXML
    void ordenar(ActionEvent event) {

        System.out.println("Buttão partado");
        Selection selection = new Selection();
        selection.imprimir();

        String n = txtConjuntoDeNumeros.getText();
        System.out.println(n);
        labelResultadoOrdenação.setText(n);
    }

    @FXML
    void verificando(ActionEvent event) {

        Complexidade complexidade = new Complexidade();
        complexidade.setN(Integer.parseInt(txtN.getText()));
        complexidade.setProcessamento(Integer.parseInt(txtProcessamento.getText()));
        complexidade.setComplexidade(txtComplexidade.getText().toLowerCase());
        labelResultado.setText("O valor da complexidade escolhida foi " + complexidade.escolha() );

    }

    @FXML
    void buscador(ActionEvent event){

        Busca busca = new Busca();
        busca.setCampoDigitado(txtConjuntoDeNumerosBusca.getText());
        busca.setNumBuscado(Integer.parseInt(txtnumeros.getText()));
        labelResultadoBusca.setText("O index do numero digitado é " + busca.buscador());


    }

}
