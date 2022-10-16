public class ForLoop {
    public static void main(String[] args) {

        // For Loop
        // For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        // Block kode yang terdapat di dalam for akan selalu diulang selama kondisi for terpenuhi

        // Sintak Perulangan For
        // for(init statement; kondisi; post statement){
        // block statement
        // }

        // Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        // Kondisi akan dilakukan pengecekan dalam setiap perulangan, jk true perulangan akan dilakukan, jk false perulangan akan berhenti
        // Post statement akan dieksekusi setiap kali diakhir perulangan
        // Init statement, kondisi dan post Statement tidak wajib diisi, jk kondisi tdk diisi, berarti kondisi selalu bernilai true

        // Kode Perulangan Tanpa Henti
        // for (;;){
        //    System.out.println("Perulangan");
        // }

        // Kode Perulangan Dengan Kondisi

        //var counter = 1;
        //for (; counter <= 10;){
        //    System.out.println("Perulangan Ke-" + counter );
        //    counter++;
        //}

        // Kode Perulangan Dengan Init Statement
        //for (var couter = 1; couter <= 10;){
        //    System.out.println("Perulangan Ke-" + couter);
        //    couter++;
        //}

        // Kode Perulangan Dengan Post Statement

        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan Ke-" + counter);
        }
    }
}
