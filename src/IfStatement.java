public class IfStatement {
    public static void main(String[] args) {

        // If Statement
        // Dalam Java, if adalah salah satu kata kunci yg digunakan untuk pencabangan
        // Percabangan artinya bs mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        // Hampir di semua bahasa pemrograman mendukung if experssion (ekspresi)

        // Else Statement
        // Block if akan dieksekusi ketika kondisi if bernilai true
        // Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
        // Hal ini bs dilakukan menggunakan else expression

        // Else If Statement
        // Kadang dalam If, kita membutuhkan membuat beberapa kondisi
        // Kasus seperti ini, di Java kita bs menggunakan Else If expression
        // Else if di Java bisa lebih dari satu


        // Kode : If Statement

        var nilai = 80;
        var abesn = 75;

        if (nilai >= 65 && abesn >= 65) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Anda Belum Lulus");
        } if (nilai >= 80 && abesn >= 80) {
           System.out.println("Nilai Anda A");
        } else if(nilai >= 70 && abesn >= 70){
           System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && abesn >= 60){
           System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && abesn >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}