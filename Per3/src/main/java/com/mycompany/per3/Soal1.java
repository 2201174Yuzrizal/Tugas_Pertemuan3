/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.per3;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Masukkan pecahan pertama (bilangan pembilang/pembagi): ");
        int pembilang1 = scanner.nextInt();
        int pembagi1 = scanner.nextInt();

        
        System.out.print("Masukkan pecahan kedua (bilangan pembilang/pembagi): ");
        int pembilang2 = scanner.nextInt();
        int pembagi2 = scanner.nextInt();

        
        System.out.print("Masukkan pecahan ketiga (bilangan pembilang/pembagi): ");
        int pembilang3 = scanner.nextInt();
        int pembagi3 = scanner.nextInt();

        
        System.out.println("Hasil penjumlahan: " + tambah(pembilang1, pembagi1, pembilang2, pembagi2, pembilang3, pembagi3));

      
        System.out.println("Hasil pengurangan: " + kurang(pembilang1, pembagi1, pembilang2, pembagi2, pembilang3, pembagi3));

        
        System.out.println("Hasil perkalian: " + kali(pembilang1, pembagi1, pembilang2, pembagi2, pembilang3, pembagi3));

        
        System.out.println("Hasil pembagian: " + bagi(pembilang1, pembagi1, pembilang2, pembagi2, pembilang3, pembagi3));
    }

    
    public static String tambah(int pembilang1, int pembagi1, int pembilang2, int pembagi2, int pembilang3, int pembagi3) {
        int pembilangTotal = pembilang1 * pembagi2 * pembagi3 + pembilang2 * pembagi1 * pembagi3 + pembilang3 * pembagi1 * pembagi2;
        int pembagiTotal = pembagi1 * pembagi2 * pembagi3;
        return simplify(pembilangTotal, pembagiTotal);
    }

    
    public static String kurang(int pembilang1, int pembagi1, int pembilang2, int pembagi2, int pembilang3, int pembagi3) {
        int pembilangTotal = pembilang1 * pembagi2 * pembagi3 - pembilang2 * pembagi1 * pembagi3 - pembilang3 * pembagi1 * pembagi2;
        int pembagiTotal = pembagi1 * pembagi2 * pembagi3;
        return simplify(pembilangTotal, pembagiTotal);
    }

   
    public static String kali(int pembilang1, int pembagi1, int pembilang2, int pembagi2, int pembilang3, int pembagi3) {
        int pembilangTotal = pembilang1 * pembilang2 * pembilang3;
        int pembagiTotal = pembagi1 * pembagi2 * pembagi3;
        return simplify(pembilangTotal, pembagiTotal);
    }

   
    public static String bagi(int pembilang1, int pembagi1, int pembilang2, int pembagi2, int pembilang3, int pembagi3) {
        int pembilangTotal = pembilang1 * pembagi2 * pembagi3;
        int pembagiTotal = pembilang2 * pembagi1 * pembagi3 * pembilang3;
        return simplify(pembilangTotal, pembagiTotal);
    }

    
    public static String simplify(int pembilang, int pembagi) {
        int gcd = gcd(pembilang, pembagi);
        pembilang /= gcd;
        pembagi /= gcd;
        return pembilang + "/" + pembagi;
    }

    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

