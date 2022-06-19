package Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Manusia> list = new ArrayList<>();
        list.add(new Manusia("Dims", "327282821912", true, true));
        list.add(new Mahasiswa("I Putu Yoga", "351925638239", false, false, "21515070011128",3.9));
        list.add(new Pekerja("Iqbal Biondy", "327819362822", true, true, 10, 25, "172839392819"));
        list.add(new Manajer("Lyre Hertin", "351707384392", false, false, 9, 20, "192374758583",2500));

        list.add(new Manusia("Ahmad","3174828364821", true, true));
        list.add(new Mahasiswa("Kendall", "39382647281", false, false, "2155070111239",3.5));
        list.add(new Pekerja("Alfi", "3203917318491", true, true, 12, 24, "42516661522"));
        list.add(new Manajer("Steven", "3251618392894", true, true, 8, 30, "234217737281", 3500));

        list.add(new Manusia("Dimas", "3172383927383", true, false));
        list.add(new Mahasiswa("Saputro", "3724163748281", true, false, "21515070011120", 4.0));
        list.add(new Pekerja("Sumirah", "3153628197932", false, false, 9, 25, "245261712"));
        list.add(new Manajer("Yanto", "31527382931837", true, false, 10, 26, "453626271", 2000));
        System.out.println("========================================");
        System.out.println("========================================");
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i).toString());
        }
    }
}
