package operasional;

import java.util.ArrayList;
import data_gym.Member;
import data_gym.GymEquipment;

public class ManajemenGym {
    private ArrayList<Member> daftarMember;
    private ArrayList<GymEquipment> daftarAlat;
    
    public ManajemenGym() {
        daftarMember = new ArrayList<Member>();
        daftarAlat = new ArrayList<GymEquipment>();
    }
    
    public void tambahMember(Member m) {
        daftarMember.add(m);
    }
    
    public void tampilkanSemuaMember() {
        if (daftarMember.isEmpty()) {
            System.out.println("Belum ada data member.");
            return;
        }
        System.out.println("=== DAFTAR MEMBER ===");
        for (Member m : daftarMember) {
            m.tampilkanInfo();
        }
    }
    
    public void updateStatusMember(String idMember, String statusBaru) {
        boolean ditemukan = false;
        for (Member m : daftarMember) {
            if (m.getIdMember().equalsIgnoreCase(idMember)) {
                m.setStatus(statusBaru);
                ditemukan = true;
                break;
            }
        }
    }
    
    public void hapusMember(String idMember) {
        Member ditemukan = null;
        for (Member m : daftarMember) {
            if (m.getIdMember().equalsIgnoreCase(idMember)) {
                ditemukan = m;
                break;
            }
        }
        if (ditemukan != null) {
            daftarMember.remove(ditemukan);
        }
            else {
                System.out.println("Member dengan ID tersebut tidak ditemukan.");
            }
    }
    
    public void tambahAlat(GymEquipment a) {
        daftarAlat.add(a);
    }
    
    public void tampilkanSemuaAlat() {
        if (daftarAlat.isEmpty()) {
            System.out.println("Belum ada data alat.");
            return;
        }
        System.out.println("=== DAFTAR ALAT GYM ===");
        for (GymEquipment a : daftarAlat) {
            a.tampilkanInfo();
        }
    }
    
    public void updateKondisiAlat(String idAlat, String kondisiBaru) {
        boolean ditemukan = false;
        for (GymEquipment a : daftarAlat) {
            if (a.getIdAlat().equalsIgnoreCase(idAlat)) {
                a.setKondisi(kondisiBaru);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Alat dengan ID tersebut tidak ditemukan.");
        }
    }
    
    public void hapusAlat(String idAlat) {
        GymEquipment ditemukan = null;
        for (GymEquipment a : daftarAlat) {
            if (a.getIdAlat().equalsIgnoreCase(idAlat)) {
                ditemukan = a;
                break;
            }
        }
        if (ditemukan != null) {
            daftarAlat.remove(ditemukan);
        }
        else {
            System.out.println("Alat dengan ID tersebut tidak ditemukan.");
        }
    }
    
    public ArrayList<Member> getDaftarMember() {
        return daftarMember;
    }
    
    public ArrayList<GymEquipment> getDaftarAlat() {
        return daftarAlat;
    }
}