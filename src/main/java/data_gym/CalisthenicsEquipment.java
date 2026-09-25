package data_gym;

public class CalisthenicsEquipment extends GymEquipment {
    private double kapasitasBebanMaks;
    private int jumlahStasiun;
    
    public CalisthenicsEquipment(String idAlat, String namaAlat, String merek, String kondisi, double kapasitasBebanMaks, int jumlahStasiun) {
        super(idAlat, namaAlat, merek, kondisi);
        this.kapasitasBebanMaks = kapasitasBebanMaks;
        this.jumlahStasiun = jumlahStasiun;
    }

    public double getKapasitasBebanMaks() {
        return kapasitasBebanMaks;
    }

    public int getJumlahStasiun() {
        return jumlahStasiun;
    }

    public void setKapasitasBebanMaks(double kapasitasBebanMaks) {
        this.kapasitasBebanMaks = kapasitasBebanMaks;
    }

    public void setJumlahStasiun(int jumlahStasiun) {
        this.jumlahStasiun = jumlahStasiun;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println(
            "ID: " + getIdAlat() + " | Nama: " + getNamaAlat() + " | Merek: " + getMerek()
            + " | Kondisi: " + getKondisi() + " | Tipe: Kalistenik"
            + " | Kapasitas Beban Maks: " + kapasitasBebanMaks + " kg"
            + " | Jumlah Stasiun: " + jumlahStasiun);
    }
}
