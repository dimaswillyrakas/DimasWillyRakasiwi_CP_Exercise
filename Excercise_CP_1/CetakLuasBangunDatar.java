package Excercise_CP_1;

import java.util.Scanner;

final class CetakLuasBangunDatar {
    private static void cetakLuasBangunDatar(LuasBangunDatar LBD, double nilai1, double nilai2, double nilai3){
        LBD.setPanjang(nilai1);
        LBD.setLebar(nilai2);
        LBD.setTinggi(nilai3);
        LBD.setLuas();
        LBD.tampil();
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double nilaiA = 0;
        double nilaiB = 0;
        double nilaiC = 0;
        int pilihan;
        
        PersegiPanjang pp = new PersegiPanjang();
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Trapesium trapesium = new Trapesium();
        
        try {
            System.out.println("Program Menghitung Luas Bangun Datar :");
            System.out.println("1. Hitung Luas Persegi Panjang");
            System.out.println("2. Hitung Luas Persegi");
            System.out.println("3. Hitung Luas Lingkaran");
            System.out.println("4. Hitung Luas Segitiga");
            System.out.println("5. Hitung Luas Trapesium");
            System.out.println("");
            System.out.print("Masukan pilihan : ");
            pilihan = keyboard.nextInt();
            
            if (pilihan == 1) {
                System.out.println("Hitung Luas Persegi Panjang");
                System.out.println("Masukan nilai panjang : ");
                nilaiA = keyboard.nextDouble();
                System.out.println("Masukan nilai lebar : ");
                nilaiB = keyboard.nextDouble();
                cetakLuasBangunDatar(pp, nilaiA, nilaiB, nilaiC);
            } else if (pilihan == 2){
                System.out.println("Hitung Luas Persegi");
                System.out.println("Masukan nilai sisi : ");
                nilaiA = keyboard.nextDouble();
                cetakLuasBangunDatar(persegi, nilaiA, nilaiA, nilaiC);
            } else if (pilihan == 3){
                System.out.println("Hitung Luas Lingkaran");
                System.out.println("Masukan nilai jari-jari : ");
                nilaiA = keyboard.nextDouble();
                cetakLuasBangunDatar(lingkaran, nilaiA, nilaiA, nilaiC);
            } else if (pilihan == 4){
                System.out.println("Hitung Luas Segitiga");
                System.out.println("Masukan nilai alas : ");
                nilaiA = keyboard.nextDouble();
                System.out.println("Masukan nilai tinggi : ");
                nilaiB = keyboard.nextDouble();
                cetakLuasBangunDatar(segitiga, nilaiA, nilaiB, nilaiC);
            } else if (pilihan == 5){
                System.out.println("Hitung Luas Trapesium");
                System.out.println("Masukan nilai sisi a : ");
                nilaiA = keyboard.nextDouble();
                System.out.println("Masukan nilai sisi b : ");
                nilaiB = keyboard.nextDouble();
                System.out.println("Masukan nilai tinggi : ");
                nilaiC = keyboard.nextDouble();
                cetakLuasBangunDatar(trapesium, nilaiA, nilaiB, nilaiC);
            }  else {
                System.out.println("Pilihan salah");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan " + e);
        }finally {
            System.out.println("");
            System.out.println("Exception handling selesai dijalankan.");
        }
    }
}