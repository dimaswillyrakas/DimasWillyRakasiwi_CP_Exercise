package Excercise_CP_1;

abstract class LuasBangunDatar {
    protected double nilai1, nilai2, nilai3, luas;
    
    protected abstract void setPanjang(double nilai1);
    protected abstract void setLebar(double nilai2);
    protected abstract void setTinggi(double nilai3);
    protected abstract void setLuas();
    protected abstract double getPanjang();
    protected abstract double getLebar();
    protected abstract double getTinggi();
    protected abstract double getLuas();
    
    protected abstract void tampil();
}
