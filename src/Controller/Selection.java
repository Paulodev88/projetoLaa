package Controller;

public class Selection extends Ordenacao {
    @Override
    public int[] imprimir(int[] numeros) {
        return selectionSort(numeros);
    }

    private  int[] selectionSort(int[] vetor){
    for (int i = 0; i<vetor.length; i ++){
        int lowPoint = i;
        for (int j=i+1; j < vetor.length; j++){
            if (vetor[lowPoint] > vetor[j]){
                lowPoint =j;
            }
        }
        int lowValue = vetor[lowPoint];
        vetor[lowPoint] = vetor[i];
        vetor[i] = lowValue;
    }
    return vetor;
    }
 }
