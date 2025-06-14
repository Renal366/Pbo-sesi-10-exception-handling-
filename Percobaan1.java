public class Percobaan1 {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a [5] = 100; // Akan menyebabkan ArrayIndexOutOfBoundsException
            // Read from the array to avoid the warning
            System.out.println("Nilai elemen pertama: " + a[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi pelanggaran memory");
        }
    }
}