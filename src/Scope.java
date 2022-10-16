public class Scope {
    public static void main(String[] args) {

        // Scope

        // Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat.
        // Hal ini disbut scope
        // Contoh, jika sebuah variable dibuat di method, maka hanya bs diakses di method tersebut, atau jk dibuat didlm block, mk hanya -
        // bs diakses didlm block tersebut.

        sayHello("Junius");
        sayHello("Firdania");
        sayHello("Alaric");
        sayHello("Gwyneth");
        sayHello("");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }


        System.out.println(hello);
        // System.out.println(hi); // error hanya bs di akses dlm block yg sama
    }



}
