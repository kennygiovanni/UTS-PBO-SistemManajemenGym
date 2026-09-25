package com.mycompany.gym;

import java.util.Scanner;
import data_gym.Member;
import data_gym.CardioEquipment;
import data_gym.WeightEquipment;
import data_gym.CalisthenicsEquipment;
import operasional.ManajemenGym;;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ManajemenGym gym = new ManajemenGym();
    
    public static void main(String [] args) {
        gym.tambahMember(new Member("M1", "Budi Santoso", "08123720837", "Bulanan", "Aktif"));
        gym.tambahMember(new Member("M2", "Siti Aminah", "08134820399", "Tahunan", "Aktif"));

        gym.tambahAlat(new CardioEquipment("A1", "Treadmill", "Technogym", "Baik", 20, 60));
        gym.tambahAlat(new WeightEquipment("A2", "Dumbbell Set", "Rogue", "Baik", 40, "Dumbbell"));
        gym.tambahAlat(new CalisthenicsEquipment("A3", "Pull-up Bar", "Rogue", "Baik", 150, 2));
        
        int pilihan;
        do {
            System.out.println("===== SISTEN MANAJEMEN GYM =====");
            System.out.println("1. Kelola Member");
            System.out.println("2. Kelola Alat Gym");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = Integer.parseInt(sc.nextLine());
            
            switch (pilihan) {
                case 1: menuMember(); break;
                case 2: menuAlat(); break;
                case 0: System.out.println("Keluar dari program"); break;
                default: System.out.println("Pilihan tidak valid, harus berupa angka (0-2).");
            }
        } while (pilihan != 0);
    }
    
    
    // ---------------- MENU MEMBER ----------------
    static void menuMember() {
        int pilihan;
        do {
            System.out.println("--- KELOLA MEMBER ---");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Semua Member");
            System.out.println("3. Update Status Member");
            System.out.println("4. Hapus Member");
            System.out.println("0. Kembali");
            System.out.print("Pilih Menu: ");
            pilihan = Integer.parseInt(sc.nextLine());
            
            switch (pilihan) {
                case 1: {
                    System.out.print("ID Member: "); String id = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    System.out.print("NO HP: "); String hp = sc.nextLine();
                    System.out.print("Jenis Membership (Bulanan/Tahunan): "); String jenis = sc.nextLine();
                    System.out.print("Status (Aktif/Tidak Aktif): "); String status = sc.nextLine();
                    gym.tambahMember(new Member(id, nama, hp, jenis, status));
                    System.out.println("Member berhasil ditambahkan.");
                    break;
                }
                case 2: 
                    gym.tampilkanSemuaMember();
                    break;
                case 3: {
                    System.out.print("ID Member: "); String id = sc.nextLine();
                    System.out.print("Status baru: "); String status  = sc.nextLine();
                    gym.updateStatusMember(id, status);
                    System.out.println("Status Member berhasil diupdate");
                    break;
                }
                case 4: {
                    System.out.print("ID Member yang akan dihapus: "); String id = sc.nextLine();
                    gym.hapusMember(id);
                    System.out.println("Member Berhasil Dihapus.");
                    break;
                }
                case 0: break;
                default: System.out.println("Pilihan tidak valid, harus berupa angka (0-4)");
             }
        } while (pilihan != 0);
}

// ---------------- MENU ALAT GYM ----------------
static void menuAlat() {
    int pilihan;
    do {
        System.out.println("--- KELOLA ALAT GYM ---");
        System.out.println("1. Tambah Alat Cardio");
        System.out.println("2. Tambah Alat Beban");
        System.out.println("3. Tambah Alat Kalistenik");
        System.out.println("4. Lihat Semua Alat");
        System.out.println("5. Update Kondisi Alat");
        System.out.println("6. Hapus Alat");
        System.out.println("0. Kembali");
        System.out.print("Pilih Menu: ");
        pilihan = Integer.parseInt(sc.nextLine());
        
        switch (pilihan) {
            case 1: {
                System.out.print("ID Alat: "); String id = sc.nextLine();
                System.out.print("Nama Alat: "); String nama = sc.nextLine();
                System.out.print("Merek: "); String merek = sc.nextLine();
                System.out.print("Kondisi (Baik/Rusak): "); String kondisi = sc.nextLine();
                System.out.print("Kecepatan Maks (km/jam): "); double kecepatan = Double.parseDouble(sc.nextLine());
                System.out.print("Durasi Maks (menit): "); int durasi = Integer.parseInt(sc.nextLine());
                gym.tambahAlat(new CardioEquipment(id, nama, merek, kondisi, kecepatan, durasi));
                System.out.println("Alat Cardio Berhasil Ditambahkan.");
                break;
            }
            case 2: {
                System.out.print("ID Alat: "); String id = sc.nextLine();
                System.out.print("Nama Alat: "); String nama = sc.nextLine();
                System.out.print("Merek: "); String merek = sc.nextLine();
                System.out.print("Kondisi (Baik/Rusak): "); String kondisi= sc.nextLine();
                System.out.print("Beban Maks (kg): "); double beban = Double.parseDouble(sc.nextLine());
                System.out.print("Tipe Beban: "); String tipe = sc.nextLine();
                gym.tambahAlat(new WeightEquipment(id, nama, merek, kondisi, beban, tipe));
                System.out.println("Alat Beban Berhasil Ditambahkan.");
                break;
            }
            case 3: {
                System.out.print("ID Alat: "); String id = sc.nextLine();
                System.out.print("Nama Alat: "); String nama = sc.nextLine();
                System.out.print("Merek: "); String merek = sc.nextLine();
                System.out.print("Kondisi (Baik/Rusak): "); String kondisi= sc.nextLine();
                System.out.print("Kapasitas Beban Maks (kg): "); double kapasitas= Double.parseDouble(sc.nextLine());
                System.out.print("Jumlah Stasiun: "); int stasiun = Integer.parseInt(sc.nextLine());
                gym.tambahAlat(new CalisthenicsEquipment(id, nama, merek, kondisi, kapasitas, stasiun));
                System.out.println("Alat Kalistenik Berhasil Ditambahkan.");
                break;
            }
            case 4: {
                gym.tampilkanSemuaAlat();
                break;
            }
                
            case 5: {
                System.out.print("ID Alat: "); String id = sc.nextLine();
                System.out.print("Kondisi Baru (Baik/Rusak):: "); String kondisi = sc.nextLine();
                gym.updateKondisiAlat(id, kondisi);
                System.out.println("Kondisi Alat Berhasil Diupdate.");
                break;
            }
            case 6: {
                System.out.print("ID Alat yang akan dihapus: "); String id = sc.nextLine();
                gym.hapusAlat(id);
                System.out.println("Alat Berhasil Dihapus."); 
                break; 
            }
            case 0: break;
            default: System.out.println("Pilihan tidak valid, harus berupa angka (0-6).");
        }
    }
    while (pilihan != 0);
    }
}