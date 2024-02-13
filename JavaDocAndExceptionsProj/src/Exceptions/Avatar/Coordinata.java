package Exceptions.Avatar;

public class Coordinata {
    private int x;
    private int y;
    private int z;


    public Coordinata() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Coordinata(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ")";
    }

    public Coordinata Add(int value) {
        return new Coordinata(this.getX() + value, this.getY() + value, this.getZ() + value);
    }
}
