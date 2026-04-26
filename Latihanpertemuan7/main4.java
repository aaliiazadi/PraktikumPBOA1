class main4 {
    public static void main(String[] args) {

        seminar s = new seminar();

        // dosen
        dosen d1 = new dosen("Dr. Budi", "D001");
        dosen d2 = new dosen("Dr. Sari", "D002");

        // mahasiswa
        mahasiswa2 m1 = new mahasiswa2("Ani", "M001");
        mahasiswa2 m2 = new mahasiswa2("Budi", "M002");
        mahasiswa2 m3 = new mahasiswa2("Cici", "M003");
        mahasiswa2 m4 = new mahasiswa2("Dedi", "M004");
        mahasiswa2 m5 = new mahasiswa2("Eka", "M005");

        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);
        m4.setWali(d2);
        m5.setWali(d1);

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);

        System.out.println("Total peserta: " + s.countPeserta());
        System.out.println("Jumlah mahasiswa: " + s.countMahasiswa());

        System.out.println("\nDaftar Peserta:");
        s.tampilPeserta();

        System.out.println("\nData Mahasiswa:");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}