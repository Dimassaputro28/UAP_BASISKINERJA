package Tugas4;

public class main {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("Nama = Dimas Saputro ");
        System.out.println("Nim  = 215150700111028 ");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Warteg Bu Pri", "Nasi Campur", 5000));
        DataMerchant.tampilData();
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(DataMerchant.sc.nextLine(), DataMerchant.sc.nextLine(), DataMerchant.sc.nextDouble()));
        DataMerchant.tampilData();
    }
}
