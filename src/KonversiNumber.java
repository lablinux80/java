import java.io.OutputStream;

public class KonversiNumber {
    public static void main(String[] args) {

        //Konversi Tipe Data Number
        //Widening Casting (Otomatis) : byte -> short -> long -> float -> double
        //Narrowing Casting (Manual) : double -> float -> long -> int -> char -> short -> byte

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;                 //Saat melakukan konversi number secara manual harus di perhatikan akan bisa terjadi over flow number
        byte iniByte2 = (byte) iniInt2;


    }
}
