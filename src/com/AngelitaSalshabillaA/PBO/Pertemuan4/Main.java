package com.AngelitaSalshabillaA.PBO.Pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manager manajer = new Manager();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 21102223;
        manajer.nama = "Angelita Salshabilla Alindra";

        pegawai.nip = 21102226;
        pegawai.nama = "Fauzan Cholish Ar Rasyid";


        manajer.showinfo();
        manajer.extrainfo();
        manajer.bonus(1000000);

        pegawai.showinfo();
        pegawai.extrainfo();
    }
}