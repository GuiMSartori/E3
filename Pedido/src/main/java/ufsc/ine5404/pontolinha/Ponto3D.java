package ufsc.ine5404.pontolinha;

public class Ponto3D extends Ponto {

    private int z;

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
