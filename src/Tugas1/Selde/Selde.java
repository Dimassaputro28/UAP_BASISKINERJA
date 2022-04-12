package Tugas1.Selde;

import java.util.Scanner;

public class Selde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String susunan = sc.nextLine();
        balik(susunan);
    }
    static void balik(String susunan){
        String balikkan ="";
        int length = susunan.length();
        for ( int i = length - 1; i >= 0; i-- )
            balikkan  = balikkan + susunan.charAt(i);
        if (susunan.equals(balikkan))
            System.out.println(susunan + " adalah selde.");
        else
            System.out.println(susunan + " bukan selde.");
    }
}