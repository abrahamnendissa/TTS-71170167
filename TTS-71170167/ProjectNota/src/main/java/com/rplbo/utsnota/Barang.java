package com.rplbo.utsnota;

public abstract class Barang {
    private String deskripsi;
    private String kodeBarang;
    private int harga;
    private int berat;

    public Barang(String deskripsi, String kodeBarang, int harga, int berat) {
        this.deskripsi = deskripsi;
        this.kodeBarang = kodeBarang;
        this.harga = harga;
        this.berat = berat;
    }

    public Barang() {

    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void getinformasi(){
        return informasi;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
