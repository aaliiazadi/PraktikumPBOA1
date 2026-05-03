// NIM: 24060123140128
// Nama: NamaKamu
// Tanggal: 20 April 2026

public class nomor1 {
    public static void main(String[] args) {

//soal a

        int x = 65;

        char c = (char) x;
        double d = x;

        System.out.println("Char: " + c);
        System.out.println("Double: " + d);

//soal b

        double real = 65.8;
        int kembali = (int) real;

        System.out.println("Kembali ke int: " + kembali);

//soal c

        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);

        System.out.println("S: " + S);
        System.out.println("Z: " + Z);

//soal d

        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);

        System.out.println("R: " + R);
        System.out.println("D: " + D);

//soal e

        Integer A = Integer.parseInt(S);
        System.out.println("A: " + A);

//soal f
        String T = A.toString();
        System.out.println("T: " + T);
    }
}