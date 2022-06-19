package Inheritance;

public class Manusia {
    private String nama;
    private String NIK;
    private Boolean jenisKelamin;
    private Boolean statusMenikah;
    public Manusia (String nama, String NIK, Boolean jenisKelamin, Boolean statusMenikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.statusMenikah = statusMenikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public Boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Boolean getStatusMenikah() {
        return statusMenikah;
    }

    public void setStatusMenikah(Boolean statusMenikah) {
        this.statusMenikah = statusMenikah;
    }
    double getTunjangan(){
        if (getStatusMenikah() && getJenisKelamin()){
            return 25.0;
        }
        else if (getStatusMenikah() && !getJenisKelamin()){
            return 20.0;
        }
        else{
            return 15.0;
        }
    }
    double getPendapatan(){
        return getTunjangan();
    }
    public String toString(){
        String returnString = "";
        returnString       += "Nama         : " + getNama() + "\n";
        returnString       += "NIK          : " + getNIK() + "\n";
        returnString       += "Jenis Kelamin: ";
        if (jenisKelamin)
            returnString += "Laki-Laki\n";
        else
            returnString += "Perempuan\n";
        returnString       += "Pendapatan   : $" + getPendapatan() + "\n";
        returnString += "----------------------------------------\n";
        returnString += "----------------------------------------\n";
        return returnString;
    }
}
