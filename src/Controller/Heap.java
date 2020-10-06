
package Controller;

import Entities.Ordenacao;

public class Heap extends Ordenacao {

    @Override
    public int[] imprimir(int[] numeros) {

        return heapSort(numeros);
    }


    int temp;

    private int[] heapSort(int[] vetor) {

        int n = vetor.length;


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(vetor, n, i);


        for (int i = n - 1; i > 0; i--) {

            int temp = vetor[0];
            vetor[0] = vetor[i];
            vetor[i] = temp;


            heapify(vetor, i, 0);

        }
        return vetor;

    }
    private void heapify(int[] arr, int size, int i) {

        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < size && arr[left] >arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != i)
        {
            temp = arr[i];
            arr[i]= arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }
}
