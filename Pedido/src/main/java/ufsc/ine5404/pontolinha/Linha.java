package ufsc.ine5404.pontolinha;

public class Linha {

    private Ponto pontoinicial, pontofinal;

    public Linha(Ponto pontoinicial, Ponto pontofinal) {
        this.pontoinicial = pontoinicial;
        this.pontofinal = pontofinal;
    }

    public Ponto getPontoinicial() {
        return pontoinicial;
    }

    public void setPontoinicial(Ponto pontoinicial) {
        this.pontoinicial = pontoinicial;
    }

    public Ponto getPontofinal() {
        return pontofinal;
    }

    public void setPontofinal(Ponto pontofinal) {
        this.pontofinal = pontofinal;
    }

    @Override
    public String toString() {
        return "Linha{" + "pontoinicial=" + pontoinicial + ", pontofinal=" + pontofinal + '}';
    }

}
