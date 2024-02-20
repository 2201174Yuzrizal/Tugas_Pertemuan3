/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.per3;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan karakter pertama: ");
        char karakterX = scanner.next().charAt(0);

        System.out.print("Masukkan karakter kedua: ");
        char karakterY = scanner.next().charAt(0);

        
        int nilaiASCII_X = (int) karakterX;
        int nilaiASCII_Y = (int) karakterY;

        
        int jumlahASCII = nilaiASCII_X + nilaiASCII_Y;

        
        System.out.println("Hasil penjumlahan ASCII dari '" + karakterX + "' dan '" + karakterY + "' adalah: " + jumlahASCII);
    }
}

