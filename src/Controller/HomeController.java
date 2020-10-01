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
    private Label labelResultado;


    @FXML
    private TextField txtConjuntoDeNumerosBusca;

    @FXML
    private TextField txtnumeros;

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
    private RadioButton radioHeap;


    @FXML
    private Label labelResultadoOrdenação;

    @FXML
    private Button btnSelecionar;

    @FXML
    void ordenar(ActionEvent event) {

        Ordenacao ordenacao = null;
        String nome = " ";

        if (this.radioBubble.isSelected()){

            ordenacao = new Bubble();
            nome = "Bubble Sort";

        }
        else if (this.radioInsertion.isSelected()){

            ordenacao = new Insertion();
            nome = "Insertion Sort";

        }
        else if (this.radioSelection.isSelected()){

            ordenacao = new Selection();
            nome = "Selection Sort";
        }
        else if(this.radioHeap.isSelected()){

            ordenacao = new Heap();
            nome = "Heap Sort";
        }

        //---------------------------------------------------------------------

        String[] vetorLetras = txtConjuntoDeNumeros.getText().split(",");
        int[] desordenado = new int[vetorLetras.length];
        for (int i=0; i<vetorLetras.length; i++){
            desordenado[i] = Integer.parseInt(vetorLetras[i]);
        }

        int [] lista = ordenacao.imprimir(desordenado);

        StringBuilder stringArray = new StringBuilder();

        for (int n : lista ){
            stringArray.append(n + " ");
        }

        //-----------------------------------------------------------------------


        this.labelResultadoOrdenação.setText(stringArray.toString() + nome);

    }

    @FXML
    void verificando(ActionEvent event) {

        Complexidade complexidade = new Complexidade();
        complexidade.setN(Integer.parseInt(txtN.getText()));
        complexidade.setProcessamento(Integer.parseInt(txtProcessamento.getText()));
        complexidade.setComplexidade(txtComplexidade.getText().toLowerCase());
        labelResultado.setText("O valor da complexidade " + complexidade.getComplexidade() +" foi " + complexidade.escolha() );

    }

    @FXML
    void buscador(ActionEvent event){

        Busca busca = new Busca();
        busca.setCampoDigitado(txtConjuntoDeNumerosBusca.getText());
        busca.setNumBuscado(Integer.parseInt(txtnumeros.getText()));
        labelResultadoBusca.setText("O index do numero digitado é " + busca.buscador());


    }

}
