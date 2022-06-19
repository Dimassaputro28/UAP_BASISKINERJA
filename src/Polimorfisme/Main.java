package Polimorfisme;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> list = new ArrayList<>();
        list.add(new PegawaiTetap("Dimas Saputro","324563872994736",25000));
        list.add(new PegawaiTetap("Dimas Saputro","324563872994736",25000));
        list.add(new PegawaiTetap("Dimas Saputro","324563872994736",25000));

        list.add(new PegawaiHarian("Ahmad","3174828364821", 5500,40 ));
        list.add(new PegawaiHarian("Ahmad","3174828364821", 5500,40 ));
        list.add(new PegawaiHarian("Ahmad","3174828364821", 5500,40 ));

        list.add(new Sales("Dimas", "3172383927383", 25, 9500));
        list.add(new Sales("Dimas", "3172383927383", 25, 9500));
        list.add(new Sales("Dimas", "3172383927383", 25, 9500));
        System.out.println("========================================");
        System.out.println("=============== Pegawai ================");
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i).toString());
        }
    }
}
