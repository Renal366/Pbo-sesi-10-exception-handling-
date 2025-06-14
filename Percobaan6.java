public class Percobaan6 {
    static void demo() {
        NullPointerException t = new NullPointerException("Coba Throw");
        throw t;
    }

    public static void main(String[] args) {
        try {
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException e) {
            System.out.println("Ada pesan error: " + e);
        }
    }
}