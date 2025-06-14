public class Percobaan7 {
    public static void main(String[] args) {
        try {
            throw new Exception("Hallo Nama Saya Renaldi cahya kusuma");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("Saya ulangi" + e.toString());
            System.out.println("e.printStackTrace():");
        }
    }
}