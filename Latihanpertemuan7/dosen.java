class dosen extends civitasakademika {
    String nip;

    dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    String getNomor() {
        return nip;
    }
}
