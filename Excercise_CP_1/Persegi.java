package Excercise_CP_1;

public class Persegi extends LuasBangunDatar{

    @Override
    protected void setPanjang(double nilai1) {
        this.nilai1 = nilai1;
    }

    @Override
    protected void setLebar(double nilai2) {
        this.nilai2 = nilai2;
    }

    @Override
    protected void setTinggi(double nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    protected void setLuas() {
        this.luas = nilai1 * nilai1;
    }

    @Override
    protected double getPanjang() {
        return nilai1;
    }

    @Override
    protected double getLebar() {
        return nilai2;
    }

    @Override
    protected double getTinggi() {
        return nilai3;
    }

    @Override
    protected double getLuas() {
        return luas;
    }

    @Override
    protected void tampil() {
        System.out.println("Luas Persegi " + nilai1 + " x " + nilai1 + " = " + luas);
    }
}