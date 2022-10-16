public class OperasiBoolean {
    public static void main(String[] args) {

        // Operasi Boolean
        // Operasi      Keterangan
        // &&           Dan
        // ||           Atau
        // !            Kebalikan

        // Operasi && (end)
        // Nilai 1  Operator    Nilai 2     Hasil
        // true     &&          true        true
        // true     &&          false       false
        // false    &&          true        false
        // false    &&          false       false

        // Operasi || (or)
        // Nilai 1  Operator    Nilai 2     Hasil
        // true     ||          true        true
        // true     ||          false       true
        // false    ||          true        true
        // false    ||          false       false

        // Operasi ! Kebalikan
        // Operator     Nilai 2     Hasil
        // !            true        false
        // !            false       true

        // Kode Operasi Boolean

        var absen = 75;      // hasil nilai false karena nilaAbsen 70 dan nilaiakhir 80 maka nilai lulus adalah false
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

















    }
}
