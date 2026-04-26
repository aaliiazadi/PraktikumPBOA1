class mahasiswa2 extends civitasakademika {
    String nim;
    dosen dosenwali;

    mahasiswa2(String nama, String nim) {
        super(nama);
        this.nim = nim;
    }

    void setWali(dosen d) {
        dosenwali = d;
    }

    String getNomor() {
        return nim;
    }

    void tampilDataMahasiswa() {
        System.out.println(nim + " | " + nama + " | Wali: " + dosenwali.nama);
    }
}
