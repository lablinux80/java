public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        //Tipe Data Bukan Primitif
        //Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. tipe data primitif tidak bs dirubah lagi.
        //Tipe data number, char, boolean adalah tipe data primitif. tipe data primitif selalu default value.
        //Tipe data String bukan tipe data primitif, tipe bukan primitif tidak memiliki default value dan bisa bernilai null.
        //Tipe data bukan premitif bisa memiliki method/function
        //Di Java, semua tipe data primitif memiliki reprentasi tipe data bukan premitif.

        //Representasi Tipe Data Primitif (1)
        //Tipe Data Primitif                Tipe Data Bukan Primitif
        //byte                              Byte
        //short                             Short
        //int                               Integer
        //long                              Long
        //float                             Float
        //double                            Double
        //char                              Character
        //boolean                           Boolean

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        //Conversion bukan premitif

        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        //Konversi Dari Tipe Primitif

        int age = 30;

        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteage = ageObject.byteValue();
        float iniFloat = ageObject.floatValue();


















    }

}
