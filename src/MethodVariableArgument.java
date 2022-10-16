public class MethodVariableArgument {
    public static void main(String[] args) {

        // Method Variable Argument

        // Kadang kita butuh mengirim data ke method sejumlah data yg tidak pasti.
        // Biasanya, agar bisa seperti ini, kita akan menggunakan array sebagai parameter di method tersebut.
        // Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yg berisi jumlah tdk tentu, bs nol atau lebih.
        // Parameter dgn tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter.

        int[] values = {80, 60, 60, 50, 80};
        sayCongrats("Junius", values);
        sayCongrats("Firdania", 80, 90, 78, 80);
        sayCongrats("Alaric", 80, 90, 78, 80);
        sayCongrats("Gwyneth", 80, 90, 78, 80);


    }
        static void sayCongrats(String name, int... values) {
            int total = 0;
            for (var value : values) {
                total += value;
            }
            var finalValue = total / values.length;

            if (finalValue >= 75) {
                System.out.println("Selamat " + name + ", Anda Lulus");
            } else {
                System.out.println("Maaf " + name + ", Anda Tidak Lulus");
            }
    }
}
