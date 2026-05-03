public class ExceptionOnArray {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};

        try {
            System.out.println("Akses elemen ke-5: " + angka[4]);
            System.out.println("Akses elemen ke-6: " + angka[5]); // ERROR di sini
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi kesalahan: " + e);
        }

        System.out.println("Program tetap berjalan setelah exception.");
    }
}