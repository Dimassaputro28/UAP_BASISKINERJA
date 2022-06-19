package Exception;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("  Selamat Datang di Game Filkom Defend  ");
        System.out.println("========================================");
        System.out.print("Masukkan Nama Player : ");
        String nama = sc.nextLine();
        System.out.println("Silahkan Pilih Role Anda: ");
        System.out.println("1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");
        System.out.print("Masukkan Pilihan: ");
        int coba = 0;
        try {
            coba = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan Pilihan Yang Sesuai");
            sc.nextLine();
            coba = sc.nextInt();
        }
        sc.nextLine();

        if (coba != 1 && coba!= 2 && coba != 3){
            System.out.println("Masukkan Pilihan Yang Sesuai");
            try {
                coba = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan Pilihan Yang Sesuai");
                sc.nextLine();
                coba = sc.nextInt();
            }
            sc.nextLine();
        }
        ArrayList<Character> Hero = new ArrayList<>();

        if (coba == 1){
            Hero.add(new Magician(100, 60, 10));
        }
        else if (coba == 2){
            Hero.add(new Healer(70,10,10));
        }
        else if (coba == 3){
            Hero.add(new Warrior(80,25,30));
        }

        Hero.add(new Titan(200,45,0));

        System.out.println("Selamat Datang " + nama);
        Class role = Hero.get(0).getClass();
        System.out.println("Anda akan bermain sebagai " + role.getSimpleName());
        System.out.println("========== STATUS PLAYER ==========");
        info(Hero.get(0));
        System.out.println("========== STATUS MUSUH ==========");
        info(Hero.get(1));
        System.out.println();


        int i = 1;
        do {
            System.out.println("======= Turn " + i + " =======");
            if (Hero.get(0).attack()) {
                Hero.get(1).receiveDamage(Hero.get(0).getAttack());
            }
            i++;
            System.out.printf("%-20s: %d%n", nama + " HP", Hero.get(0).getHP());
            System.out.printf("%-20s: %d%n", "Enemy HP", Hero.get(1).getHP());
            if (Hero.get(1).getHP() == 0)
                break;
            System.out.println("======= Turn " + i + " =======");
            if (Hero.get(0) instanceof Healer) {
                System.out.println("Hero mendapatkan heal!");
                ((Healer) Hero.get(0)).heal();
            }
            if (Hero.get(1).attack()) {
                Hero.get(0).receiveDamage(Hero.get(1).getAttack());
            }
            System.out.printf("%-20s: %d%n", nama + " HP", Hero.get(0).getHP());
            System.out.printf("%-20s: %d%n", "Enemy HP", Hero.get(1).getHP());
            i++;
        }



        while(Hero.get(0).getHP() != 0 && Hero.get(1).getHP() != 0);
        System.out.println("----------------------------------------");
        if (Hero.get(0).getHP() == 0)
            System.out.println(nama + " Kalah");
        else
            System.out.println(nama + " Menang");
        System.out.println("========== STATUS PLAYER ==========");
        info(Hero.get(0));
        System.out.println("========== STATUS MUSUH ===========");
        info(Hero.get(1));
    }
    static void info(Character Hero){
        Class role = Hero.getClass();
        System.out.printf("%-20s: %s%n", "Role", role.getSimpleName() );
        Hero.info();
    }
}
