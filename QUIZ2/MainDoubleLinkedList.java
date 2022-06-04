/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUIZ;

/**
 *
 * @author mutiaradevita
 */
import java.util.Scanner;
public class MainDoubleLinkedList {
    public static void main(String [] args){
       System.out.println("===== QUIZ 2 PRAKTIKUM ASD TI - 1G =====");
       System.out.print("dibuat oleh : Mutiara Devita Eka Putri");
       System.out.print("NIM : 2141720135");
       System.out.print("Absen : 23");
       System.out.print("===========================================");
       System.out.print("Sistem Antrian Resto Royal Delish");
    }
    public static void menu() {
        System.out.println("Pilih Menu:");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan by Nama");
        System.out.println("5. Hitung total pendapatan");
        System.out.println("6. Keluar");
    }
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int nomorAntrian = 0;
        int pilih;
        String[] nama = {"Muti", "Ara", "Devi", "Eka"};
        String[] nohp  = {"082245657800", "0854651651", "0865452782", "08123434667"};
        int[] kodePesanan = {1,2,3,4};
        String[] namaPesanan = {"Bulgogi", "Mie Goreng", "Nasi Rendang", "Soto Ayam"};
        int[] harga = {25000, 15000, 25000, 15000};
        
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {

                case 1:
                    Pembeli pem = new Pembeli(nama[nomorAntrian], nohp[nomorAntrian], kodePesanan[nomorAntrian]);
                    Pesanan pes = new Pesanan(kodePesanan[nomorAntrian], harga[nomorAntrian], namaPesanan[nomorAntrian]);
                    dll.addLast(pem, pes);
                    System.out.println("Nomor Antrian : " + nomorAntrian+1);
                    System.out.println("Nama Customer : " + nama[nomorAntrian]);
                    System.out.println("Nomor Hp : " + nohp[nomorAntrian]);
                    nomorAntrian++;
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    System.out.println(dll.head.buyer.nomor + dll.head.buyer.namaPembeli + dll.head.buyer.NoHp);
                    dll.removeFirst();
                    break;
                case 4:
                    break;
                case 5:
                    dll.hitungPendapatan();
                    break;
                case 6:
                    System.out.print("Terima Kasih");
                    break;
                
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
   
}
