class MyException extends Exception {
    private String Teks;
    MyException(String s) {
        Teks = "Benarkan diksi Nama : " + s;
        System.out.println(Teks);
    }
}

public class Percobaan12 {
    static void tampil(String s) throws Exception {
        System.out.println("Tampilkan");
        if (s.equals("Renaldi Cahya Kusuma")) {
            throw new MyException(s);
        }
        System.out.println("Renaldi cahya");
    }
    
    public static void main(String[] args) throws Exception {
        try {
            tampil("all");
            tampil("Renaldi Cahya Kusuma");
        } catch (MyException s ) {
            System.out.println("Nama telah di benarkan");
        }
    }
}