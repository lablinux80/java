public class RecursiveMethod {
    public static void main(String[] args) {

        // Recursive Method

        // Recursive method adalah kemampuan method memanggil method dirinya sendiri.
        // Kadang memang ada banya problem, yg lebih mudah diselesaikan menggunakan recursive method, seperti contoh kasus factorial.


        // Kode Factorial Loop

        System.out.println(factorialLoop( 10));
        System.out.println(factorialRecursive(10));

        loop(10000);

    }

        static int factorialLoop(int value) {
            var result = 1;

            for (var counter = 1; counter <= value; counter++) {
                result *= counter;
            }
            return result;
        }

        // kode Factorial Recursive

        static int factorialRecursive(int value) {
            if(value == 1) {
                return 1;
            } else {
                return value * factorialRecursive(value -1);
            }
        }

        static void loop(int value) {
            if(value == 0) {
                System.out.println("Selesai");
            }else {
                System.out.println("loop " + value);
                loop( value -1);
            }
        }
}

// Problem Dengan Recursive

// Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati.
// Jika recursive terlalu dalam, maka akan ada kemungkinan terjadi error StackOverflow, yaitu error dimn stack method terlalu banyak di Java.
// kenapa problem ini bisa terjadi? krn ketika kita memanggil method, Java akan menyimpannya dlm stack, jk method tersebut memanggil method lain -
// maka stack akan menumpuk terus, dan jk terlalu dalam, maka stack akan terlalu besar, dan bs menyebabkan error StackOverflow.