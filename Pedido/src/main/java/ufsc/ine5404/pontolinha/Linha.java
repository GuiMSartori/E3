package ufsc.ine5404.pontolinha;

public class Linha {

    private Ponto[] pontos;

    public Ponto[] getPontos() {
        return pontos;
    }

    public void setPontos(Ponto[] pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return "Linha{" + "pontos=" + pontos + '}';
    }

}
