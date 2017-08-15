package ufsc.ine5404.pontolinha;

public class Linha {

    private Ponto ponto1, ponto2;

    public Linha(Ponto2D ponto1, Ponto2D ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public Linha(Ponto3D ponto1, Ponto3D ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public Ponto getponto1() {
        return ponto1;
    }

    public void setponto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto getponto2() {
        return ponto2;
    }

    public void setponto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    @Override
    public String toString() {
        return "Linha{" + "ponto1=" + ponto1.toString() + ", ponto2=" + ponto2.toString() + '}';
    }

}
