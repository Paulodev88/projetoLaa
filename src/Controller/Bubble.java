package Controller;

import Entities.Ordenacao;

public class Bubble extends Ordenacao {
    @Override
    public int[] imprimir(int[] numeros) {
        return bubbleSort(numeros);

    }

    private int[] bubbleSort(int[] vetor){

        for (int i=0; i < vetor.length; i++){
            for (int j=0 ; j< vetor.length - 1; j++){
                if (vetor[j] > vetor [j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }
}
