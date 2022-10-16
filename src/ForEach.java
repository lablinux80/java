public class ForEach {
    public static void main(String[] args) {

        // For Each

        // Kadang kita biasa mengakses data array menggunakan perulangan
        // Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, -
        // lalu mengakses array menggunakan counter yg kita buat.
        // Namun untungnya, di Java terdpt perulangan for each, ygn bs digunakan untuk mengakses seluruh data di array secara otomatis.

        // Kode Tanpa For Each

        String[] array = {
                "Junius", "Firdania", "Alaric", "Gwyneth",
                "Istri", "Dan", "Anak-Anakku"
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("FOR EACH");

        for (var value : array) {
            System.out.println(value);
        }
    }
}
