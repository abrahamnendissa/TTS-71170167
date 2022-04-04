package com.rplbo.utsnota;

public class Nota{
    private String nonota;
    private String notelppembeli;
    private Item item;
    private String namapembeli;

    public Nota(String deskripsi, String kodeBarang, int harga, int berat, String nonota, String notelppembeli, Item item, String namapembeli) {
        super(deskripsi, kodeBarang, harga, berat);
        this.nonota = nonota;
        this.notelppembeli = notelppembeli;
        this.item = item;
        this.namapembeli = namapembeli;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public String getNonota() {
        return nonota;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNonota(String nonota) {
        this.nonota = nonota;
    }
    public void tampilNota(){

    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public int hitungTotalBayar(){
        return hitungTotalBayar();
    }
}
