/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.per3;

import java.util.Scanner;

public class Per3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai tabungan
        System.out.print("Masukkan jumlah tabungan Anda (dalam juta rupiah): ");
        double tabungan = scanner.nextDouble();

        // Meminta pengguna memasukkan status keberadaan calon pasangan
        System.out.print("Apakah Anda sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = scanner.nextBoolean();

        // Mengevaluasi apakah seseorang akan menikah berdasarkan kondisi tabungan dan calon pasangan
        if (tabungan > 100_000_000 && calonPasangan) {
            System.out.println("Selamat! Anda siap untuk menikah.");
        } else {
            System.out.println("Maaf, Anda belum siap untuk menikah.");
        }
    }
}
