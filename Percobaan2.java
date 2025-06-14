public class Percobaan2 {
    public static void main(String[] args) {
        int i = 0;
        String[] greetings = {
            "Saya Renaldi cahya kusuma",
            "Mahasiswa NusaPutra",
            "HELLO"
        };
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i = 0;
            }
        }
    }
}