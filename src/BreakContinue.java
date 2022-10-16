public class BreakContinue {
    public static void main(String[] args) {

        // Break & Continue

        // Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dlm switch
        // Sama dgn pd perulangan, break jg digunakan untuk menghentikan seluruh perulangan.
        // Namun berbeda dgn continue, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya.


        // Kode Break
//        var counter = 1;
//        while (true) {      // true tersebut pengulangan tdk akan pernah berhenti
//            System.out.println("Perulangan Ke-" + counter);
//            counter++;

//            if(counter > 10){
//              break;
//            }

        // Kode Continue

        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 1) {
                continue;
            }
            System.out.println("Perulangan Ganjil Ke-" + counter);
        }
    }
}
