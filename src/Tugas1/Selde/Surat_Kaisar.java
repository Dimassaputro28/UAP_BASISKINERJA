package Tugas1.Selde;

import java.util.Scanner;

public class Surat_Kaisar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int pindah = sc.nextInt();
        caesar(kata, pindah);
    }

    static void caesar(String kata, int pindah) {
        for (int i = 0; i < kata.length(); i++) {
            char huruf = kata.charAt(i);
            if (kata.charAt(i) == ' '){
                System.out.print(' ');}
            if (huruf >= 65 && huruf <= 90) {
                if (kata.charAt(i) + pindah > 90)
                    System.out.print((char) (huruf + pindah - 26));
                else
                    System.out.print((char) (huruf + pindah));

            } else if (huruf >= 97 && huruf <= 122) {
                if (huruf + pindah > 122)
                    System.out.print((char) (huruf + pindah - 26));
                else
                    System.out.print((char) (huruf + pindah));

            }
        }
    }
}
