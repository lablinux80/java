public class TipeDataVariable {
    public static void main(String[] args) {

        //Variable
        //Variable adalah tempat untuk menyimpan data.
        //Java adalah static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang sama,-
        // tidak bisa berubah-rubah tipe seperti di bahasa pemrograman PHP atau JavaScript.
        //Untuk membuat variable di Java tika tidak bisa menggunakan nama tipe data lalu diikuti dengan nama variablenya.
        //Nama variable tidak boleh mengandung whitespace (spasi, enter, tab) dan tidak boleh seluruhnya number.

        //String name;
        //name = "Alaric Maximiliano";

        //int age = 8;
        //String address = "Jembatan Tiga Raya";

        //System.out.println(name);
        //System.out.println(age);
        //System.out.println(address);

        //name = "Gwyneth Eugenia";
        //System.out.println(Name);



        //Kata Kunci Variable
        //Sejak versi Java 10, Java mendukung pembuatan variable dengan kata kunci var, sehingga kita tdk perlu menyebutkan tipe datanya.
        //Namun perlu diingat, saat kita menggunakan kata kunci var untuk membuat variable, kita hrs menginisial value atau nilai dari -
        //variable tersebut secara langsung.



        // var name; // error tidak di perblhkan penulisan seperti ini krn tdk ada value, penulisan benar yaitu ( van name= "xxxx";)

        //var firstName = "Junius";
        //var middleName = "Firdania";
        //var lastName = "Alaric Gwyneth"

        //var name = "Gwyneth Eugenia";

        //var age = 4;

        //var address = "Jembatan Tiga Raya";

        //System.out.println(name);
        //System.out.println(age);
        //System.out.println(address);


        //Kata Kunci final
        //Secara default, variable di Java bisa dirubah-rubah nilainya.
        //Jika kita ingin membuat sebuah variable yang datanya tidak boleh dirubah setelah pertama kali dibuat,-
        //kita bisa menggunakan kata kunci final.
        //istilah variable seperti ini, banyak juga yang menyebutkan konstan.

/**
        String name;
        name = "Junius";
        int age = 42;
        String address = "Jembatan Tiga Raya";

        // name = "Alaric" -> error krn sudah ada kata final tidak bs dirubah.

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
 */
        var fristName = "Junius"; // selalu inisialisasi datanya seperti code program
        var middleName = "Firdania";
        var lastName = "Alaric Gwyneth";

/**
 * Contoh penulisan yg salah
 *
 * var company;
 * company = "Programmer Zaman Now";
  */


    }
}
