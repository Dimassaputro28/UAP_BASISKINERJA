package Tugas4;

import java.util.Scanner;

public class Merchant {
    private String namaMerchant ;
    private String namaProduk ;
    private double harga ;

    Merchant(String namaMerchant, String namaProduk, double harga){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.harga = harga;
    }
}
