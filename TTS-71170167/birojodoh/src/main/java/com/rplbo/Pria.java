package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private Double jumlahCinta;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT (Perempuan calon){
        this.temanKencan = temanKencan;
    }

    public void MengajakKencan (Perempuan perempuan){

    }

    public void MenembakKekasih(){
        if (jumlahCinta >= 1.0) {
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HDUP BARU Farel");
        } else {
            return;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public Double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
}
