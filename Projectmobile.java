package Projectmobile;

class Mobil {
    String merk;
    String model;
    int tahunPembuatan;

    void infoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Pembuatan: " + tahunPembuatan);
        System.out.println(); // Tambahan baris kosong agar output rapi
    }
}

public class Projectmobile {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.model = "Ferrari";
        mobil1.tahunPembuatan = 2005;

        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda";
        mobil2.model = "Brio";
        mobil2.tahunPembuatan = 2013;

        Mobil mobil3 = new Mobil();
        mobil3.merk = "Lamborghini";
        mobil3.model = "Ferrari";
        mobil3.tahunPembuatan = 2022;

        mobil1.infoMobil();
        mobil2.infoMobil();
        mobil3.infoMobil();
    }
}