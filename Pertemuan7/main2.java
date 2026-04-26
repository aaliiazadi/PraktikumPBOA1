// NIM: 24060123140128
// Nama: NamaKamu
// Tanggal: 20 April 2026

public class main2 {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "24060123140128";
        m1.nama = "Al";

        Mahasiswa m2 = new Mahasiswa("24060123140128", "Al", "Informatika");

        Mahasiswa m3 = new Mahasiswa(m2);

        m1.setProgramStudi();
        m2.setProgramStudi("Kedokteran");
        m3.setProgramStudi(m2);

        m1.tampil();
        m2.tampil();
        m3.tampil();
    }
}