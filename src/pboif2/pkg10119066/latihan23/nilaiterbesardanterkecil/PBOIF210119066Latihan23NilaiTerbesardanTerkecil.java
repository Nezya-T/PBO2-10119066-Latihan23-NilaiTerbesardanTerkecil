/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119066.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO/IF2
 */
public class PBOIF210119066Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        String nama = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int banyaknilai = scanner.nextInt();
        int[] nilai = new int[banyaknilai];
        for (int i = 0 ; i < banyaknilai; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1) +" = ");
            nilai[i] = scanner.nextInt();
        }
        System.out.println(" ");
        int max = nilai[0];
        int min = nilai[0];
        for (int j = 0 ; j < banyaknilai; j++){
            System.out.println("Nilai Mahasiswa ke-"+ (j+1) +" = " + nilai[j]);
            if (max < nilai[j])
                max = nilai[j];
            if (min > nilai[j])
                min = nilai[j];
        }
        System.out.println(" ");
        System.out.println("Nilai Terbesar Adalah : " + max);
        System.out.println("Nilai Terkecil Adalah : " + min);
        System.out.println("Petugas : " + nama);
    }
    
}
