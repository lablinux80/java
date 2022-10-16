public class Array {
    public static void main(String[] args) {

        //Tipe Data Array
        // Array adalah tipe data yg berisikan kumpulan data dgn tipe yg sama
        // Jumlah data di Array tdk bisa berubah setelah pertama kali dibuat

        // Cara Kerja Array

        // First Index (0)                         Element (at Index 8)
        // 0    1    2    3    4    5    6    7    8    9 --> Indices
        //<------------- Aray length is 10 ------------->

        // Deklarasi manual
        String [] stringsarray;
        stringsarray = new String[4];
        stringsarray[0] = "Junius";
        stringsarray[1] = "Firdania";
        stringsarray[2] = "Alaric";
        stringsarray[3] = "Gwyneth";

        System.out.println(stringsarray[0]);
        System.out.println(stringsarray[1]);
        System.out.println(stringsarray[2]);
        System.out.println(stringsarray[3]);

        // Deklarasi Initializer
        String[] namaNama = {
            "Junius", "Firdania", "Alaric", "Gwyneth"
        };
        namaNama[0] = null;



        int[] arrayInt = new int[]{
            10, 90, 80, 67, 29
        };
        System.out.println(arrayInt.length);


        long[] arrayLong = {
             10, 90, 80, 67, 29L
        };
        arrayLong[0] = 0; //menggubah data pertama
        System.out.println(arrayLong.length);



       /*
         Operasi di Array
         Operasi Array                Keterangan
         array[index]                 Mengambil data di array
         array[index] = value         Mengubah data di array
         array.length                 Mengambil panjang array
       */

        // Kode Array di dalam Array
        String[][] members = {
                {"Junius", "Firdania", "Alaric", "Gwyneth"},
                {"Irwan", "Lautensius"},
                {"MJ", "SC",},
        };

        //String[] member1 = members[0];
        //System.out.println(member1[1]);

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);
        System.out.println(members[2][1]);

    }
}
