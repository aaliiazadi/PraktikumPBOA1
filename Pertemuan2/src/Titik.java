/*
Nama File : Titik.java 
Deskripsi : berisi atribut dan method dalam class titik
Pembuat : Fakhri Ali Azadi
Tanggal : 23/02/26 
*/

public class Titik {

    /* ATRIBUT */
    double absis;
    double ordinat;
    static int counterTitik = 0;  

    /* METHOD */

    /* Konstruktor default untuk membuat titik (0,0) */
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;  
    }

    /* Konstruktor dengan parameter */
    public Titik(double a, double o) {
        absis = a;
        ordinat = o;
        counterTitik++;  
    }

    /* Mengembalikan nilai absis */
    public double getAbsis() {
        return absis;
    }

    /* Mengembalikan nilai ordinat */
    public double getOrdinat() {
        return ordinat;
    }

    /* Mengeset nilai absis */
    public void setAbsis(double x) {
        absis = x;
    }

    /* Mengeset nilai ordinat */
    public void setOrdinat(double y) {
        ordinat = y;
    }

    /* Menggeser titik sejauh x dan y */
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    /* Mencetak koordinat titik */
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    /* Method static untuk mendapatkan jumlah objek */
    public static int getCounterTitik() {
        return counterTitik;
    }
}