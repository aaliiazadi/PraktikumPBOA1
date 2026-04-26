// NIM: 24060123140128
// Nama: NamaKamu
// Tanggal: 20 April 2026

class Mahasiswa {
    String nim, nama, prodi;

    Mahasiswa() {
        nim = "-999";
        nama = "n/a";
        prodi = "n/a";
    }

    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    Mahasiswa(Mahasiswa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.prodi = m.prodi;
    }

    void setProgramStudi() {
        prodi = "Kosong";
    }

    void setProgramStudi(String p) {
        prodi = p;
    }

    void setProgramStudi(Mahasiswa m) {
        prodi = m.prodi;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + prodi);
    }
}