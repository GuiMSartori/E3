package ufsc.ine5404.pontolinha;

public class Linha {

    private Ponto pontoInicial, pontoFinal;

    public Linha(Ponto2D pontoInicial, Ponto2D pontoFinal) {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
    }

    public Linha(Ponto3D pontoInicial, Ponto3D pontoFinal) {
        this.pontoInicial = pontoInicial;
        this.pontoFinal = pontoFinal;
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }

    public void setPontoInicial(Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
    }

    public Ponto getPontoFinal() {
        return pontoFinal;
    }

    public void setPontoFinal(Ponto pontoFinal) {
        this.pontoFinal = pontoFinal;
    }

    @Override
    public String toString() {
        return "Linha{" + "pontoInicial=" + pontoInicial + ", pontoFinal=" + pontoFinal + '}';
    }

}
