class seminar {
    civitasakademika[] peserta = new civitasakademika[100];
    int banyakpeserta = 0;

    void registrasi(civitasakademika c) {
        peserta[banyakpeserta] = c;
        banyakpeserta++;
    }

    int countPeserta() {
        return banyakpeserta;
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(peserta[i].getNomor() + " | " + peserta[i].nama);
        }
    }

    int countMahasiswa() {
        int jumlah = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (peserta[i] instanceof mahasiswa2) {
                jumlah++;
            }
        }
        return jumlah;
    }
}