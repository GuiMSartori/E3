package ufsc.ine5404.pontolinha;

public class Ponto3D extends Ponto {

    private int z;

    public Ponto3D(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Ponto3D{" + "z=" + z + '}';
    }

}
