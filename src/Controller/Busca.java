package Controller;

public class Busca {

    private String campoDigitado;
    private int[] vetor;
    private int numBuscado;

    public void setNumBuscado(int numBuscado) {
        this.numBuscado = numBuscado;
    }

    public void setCampoDigitado(String campoDigitado) {
        this.campoDigitado = campoDigitado;
    }

    public int buscador() {

        String[] vetorTexto = campoDigitado.split(",");
        vetor = new int[vetorTexto.length];
        int get = -1;
        for (int i = 0; i < vetorTexto.length; i++) {
            vetor[i] = Integer.parseInt(vetorTexto[i]);
            if (numBuscado == vetor[i]){
                get = i;
            }
        }
        return get;


    }
}

