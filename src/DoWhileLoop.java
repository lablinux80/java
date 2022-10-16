public class DoWhileLoop {
    public static void main(String[] args) {

        // Do While Loop

        // Do While Loop adalah perulangan yang mirip dgn while
        // Perbandingan hanya pada pengecekan kondisi
        // Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop -
        // dilakukan setelah perulangan dilakukan.
        // Oleh karena itu dalam do while loop, mirip pasti sekali perulangan dilakukan walaupun kondisi tdk bernilai true.


        // Kode Do While Loop

        var counter = 1;

        do {
            System.out.println("Perulangan Ke-" + counter);
            counter++;
        }   while (counter <= 10);

    }
}
