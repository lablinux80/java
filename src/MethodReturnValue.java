public class MethodReturnValue {
    public static void main(String[] args) {

        // Method Return Value

        // Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah -
        // method menghasilkan nilai.
        // Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dgn tipe data yg dihasilkan.
        // Dan di dlm block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu -
        // diikuti dgn data yg sesuai dgn tipe data yg sudah kita deklarasikan di method.
        // Di Java, kita hanya  bs menghasilkan 1 data di sebuah method, tidak bisa dari satu.

        // Kode Method Return Value

        var a = 100;
        var b = 200;
        var c = sum(a, b);

        System.out.println(c);
    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;



    }
}
