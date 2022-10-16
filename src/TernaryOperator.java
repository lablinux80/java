public class TernaryOperator {
    public static void main(String[] args) {

        // Ternary Operator
        // Ternary operator adalah operator sederhana if statement
        // Ternary operator terdiri dr kondisi yg dievaluasi, jk menghasilkan true nilai pertama diambil, jika false, maka nilai kedua diambil
        // Fungsi mengpersingkat pengguna if & else statement
/**
// Tanpa Ternary Operator
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silakan Dicoba Kembali";
        }
        System.out.println(ucapan);
*/

// Dengan Ternary Operator
        var nilai = 70;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silakan Dicoba Kembali";
        System.out.println(ucapan);

    }
}
