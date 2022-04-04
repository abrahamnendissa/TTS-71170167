package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private Double jumlahCinta;
    private Pria jodoh;
    private Pria temanKencan;
    private Double standarJumlahCinta;

    public Perempuan(String nama, int usia, double jumlahCinta) {
        this.nama = nama;
        this.usia = usia;
        this.jumlahCinta = jumlahCinta;
    }

    public void MengajakKencan (Perempuan perempuan){

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

    public Pria getJodoh() {
        return jodoh;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public Double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public void setStandarJumlahCinta(Double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }
}
