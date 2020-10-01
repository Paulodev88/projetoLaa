package Controller;

public class Insertion extends Ordenacao {


    @Override
    public int[] imprimir(int[] numeros) {
        return insertionSort(numeros);
    }

    private int[] insertionSort(int[] vetor){

        for (int i =0; i < vetor.length; i++){
            int j = i;
            int aux = vetor[i];

            while ( (j >0 ) && (vetor [j-1]> aux)){
                vetor[j] = vetor[j-1];
                j--;
            }
            vetor[j] = aux;

        }
        return vetor;
    }
}
