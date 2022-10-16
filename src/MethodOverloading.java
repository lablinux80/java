public class MethodOverloading {
    public static void main(String[] args) {

        // Method Overloading

        // Method overloading adalah kemampuan membuat method dgn nama yg sama lebih dari sekali.
        // Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, apakah jumlah atau tipe data parameternya.
        // Jika ada yang sama, maka program Java akan error.

        // Kode Method Overloading

        sayHello();
        sayHello("Junius");
        sayHello("Junius", "Firdania");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}