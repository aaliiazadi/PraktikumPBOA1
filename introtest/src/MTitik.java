/*
Nama File : Titik.java 
Deskripsi : berisi atribut dan method dalam class titik
Pembuat : Fakhri Ali Azadi
Tanggal : 19/02/26 
*/

public class MTitik {

    public static void main(String[] args) {

        /* Membuat objek titik default */
        Titik T1 = new Titik();
        T1.printTitik();

        /* Mengubah nilai absis dan ordinat */
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();

        /* Menggeser titik */
        T1.geser(2, 5);
        T1.printTitik();

        /* Membuat objek dengan konstruktor parameter */
        Titik T2 = new Titik(10, 20);
        T2.printTitik();
    }
}
