/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Mengganti Kata=====\n");
        System.out.print("Masukan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String kata_lama = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata_baru = scanner.nextLine();
        
        String[] perkata = kalimat.split(" ");
        for (String kata : perkata){
            if (kata.equalsIgnoreCase(kata_lama)){
                hasil += kata_baru + " ";
            }
            else {
                hasil += kata + " ";
            }
        }
        System.out.println("Kalimar Baru : " +hasil.trim());
    }
    
}
