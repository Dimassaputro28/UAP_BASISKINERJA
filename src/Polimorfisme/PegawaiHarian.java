package Polimorfisme;

public class PegawaiHarian extends Pegawai{
    private double upahPerjam;
    private int totalJam;
    public PegawaiHarian (String nama, String noKTP, double upahPerjam, int totalJam){
        super(nama, noKTP);
        this.upahPerjam = upahPerjam;
        this.totalJam = totalJam;
    }

    public double getUpahPerjam() {
        return upahPerjam;
    }

    public void setUpahPerjam(double upahPerjam) {
        this.upahPerjam = upahPerjam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    @Override
    public double gaji() {
        if (this.totalJam <= 40) {
            return (getUpahPerjam() * getTotalJam());
        } else
            return ((getUpahPerjam() * 40) + (getTotalJam() - 40) * getUpahPerjam() * 1.5);
    }
    @Override
    public String toString(){
        String returnString = "";
        System.out.println();
        returnString+= "Pegawai Harian   : " +getNama() +"\n";
        returnString+= "No. KTP          : " +getNoKTP()+"\n";
        returnString+= "Upah/jam         : " +getUpahPerjam()+"\n";
        returnString+= "Total Jam Kerja  : " +getTotalJam()+"\n";
        returnString+= "Pendapatan       : Rp." +(int)gaji();
        System.out.println("-------------------------------------");
        return returnString;
    }
}
