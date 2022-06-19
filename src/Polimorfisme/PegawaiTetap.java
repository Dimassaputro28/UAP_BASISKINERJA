package Polimorfisme;

public class PegawaiTetap extends Pegawai{
    private double upah;
    public PegawaiTetap ( String nama, String noKTP, double upah){
        super(nama, noKTP);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }
    @Override
    public double gaji(){
        return upah;
    }
    @Override
    public String toString(){
        String returnString = "";
        returnString+= "Pegawai Tetap    : " +getNama() +"\n";
        System.out.println();
        returnString+= "No. KTP          : " +getNoKTP()+"\n";
        returnString+= "Upah             : " +getUpah()+"\n";
        returnString+= "Pendapatan       : Rp." +(int)gaji();
        System.out.println("-------------------------------------");
        return returnString;
    }
}
