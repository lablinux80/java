public class MethodParameter {
    public static void main(String[] args) {

        // Method Parameter

        // Kita bs mengirim informasi ke method yg ingin kita panggil
        // Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yg sudah kita buat.
        // Cara membuat parameter sama seperti cara membuat variabel
        // Parameter ditempatkan di dalam kurungm () di deklarasi method
        // Parameter bs lebih dari satu, jika lebih dari satu, harus dipisahkan menggunakan tanda koma ,

        // kode Method Parameter


        sayHello("Alaric", "Gwyneth");
    }
        static void sayHello(String firstName, String lastName) {
            System.out.println("Hello " + firstName + " " + lastName);
    }


}