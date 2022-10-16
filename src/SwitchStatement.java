import java.sql.SQLOutput;

public class SwitchStatement {
    public static void main(String[] args) {

        // Switch Statement
        // Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
        // Switch adalah statement percabangan yg sama dgn If, namun lebih sederhana cara pembuatannya
        // Kondisi di Switch statement hanya untuk perbandingan ==

        // Kode : Switch Statement

      //  var nilai = "E";
      //  switch (nilai){
      //      case "A":
      //          System.out.println("Anda Lulus Terbaik Baik");
      //          break; // Menghentikan nilai case
      //      case "B":
      //      case "C":
      //          System.out.println("Anda Lulus");
      //          break;
      //      case "D":
      //          System.out.println("Anda Tidak Lulus");
      //          break;
      //      default:
      //          System.out.println("Anda Bisa Ulang di Semester Berikut");

        // Switch Lambda tanda -> {}
        // Di Java 14, diperkenalkan switch expression dengan lambda
        // Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break

      //  var nilai = "C";

        //switch (nilai) {
        //    case "A" -> System.out.println("Anda Lulus Terbaik Baik");
        //    case "B", "C" -> System.out.println("Anda Lulus");
        //    case "D" -> System.out.println("Anda Tidak Lulus");
        //    default -> {
        //        System.out.println("Anda Bisa Ulang di Semester Berikut");
        //    }

        // Kata Kunci Yield
        // Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan katak kunci yield untuk menggembalikan nilai pada switch statement
        // Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement

        var nilai ="E";
        String ucapan = switch (nilai){
            case "A":
                yield "Anda Lulus Terbaik Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Anda Bisa Ulang di Semester Berikut";
        };
        System.out.println(ucapan);
    }
}
