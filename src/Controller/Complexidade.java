package Controller;

public class Complexidade {

    private int n;
    private String complexidade;
    private int processamento;



    public void setN(int n) {
        this.n = n;
    }

    public void setComplexidade(String complexidade) {
        this.complexidade = complexidade;
    }

    public String getComplexidade() {
        return complexidade;
    }

    public void setProcessamento(int processamento) {
        this.processamento = processamento;
    }

    private double insercao(){

        double caInsercao = 2 * Math.pow(n, 2);
        return caInsercao/ processamento;

    }

    private double intercalaçao(){

       double caIntercalaçao = n * Math.log10(n);
       return caIntercalaçao / processamento;


    }

    public double escolha(){

        if (complexidade.equals("intercalação")){
            return intercalaçao();
        }
        if (complexidade.equals("inserção")){
            return insercao();
        }
        else
            return -1;

    }


}
