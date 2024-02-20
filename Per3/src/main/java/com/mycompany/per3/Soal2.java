/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.per3;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah tabungan Anda (dalam juta rupiah): ");
        double tabungan = scanner.nextDouble();

        
        System.out.print("Apakah Anda sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = scanner.nextBoolean();

        
        if (tabungan > 100_000_000 && calonPasangan) {
            System.out.println("Selamat! Anda siap untuk menikah.");
        } else {
            System.out.println("Maaf, Anda belum siap untuk menikah.");
        }
    }
}
