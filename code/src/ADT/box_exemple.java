// berdasarkan referensi 2, pengenalan ADT.
// Abstract Data Type (ADT) adalah definisi TYPE dan sekumpulan PRIMITIF (operasi dasar) terhadap TYPE tersebut.
package ADT;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// MODULE ADT (SUPLIER / penyedia type dan primitif)
// Modul ADT biasanya dimanfaatkan oleh modul lain
// `Type` diterjemahkan menjadi type terdefinisi dalam bahasa yang bersangkutan, Contoh pada Java `class` dan pada rust `struct`
// pada contoh ini `type` ialah MyBox
class MyBox {

    // kompunen type
    String name;
    int id;

    // note: ADT merupakan konsep. OOP(Object Oriented Programming) merupakan implementasi konsep ATP, mengingat ini java maka akan menggunakan OOP dalam penjelasan ADT.
    // Primitif, dalam konteks prosedural, diterjemahkan menjadi fungsi atau prosedur. Primitif dikelompokkan menjadi:
    // Konstraktor / Kreator, pembentukan nilai type
    public MyBox(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Selector, mengakses kompunen type
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    // Prosedur, mengubah nilai
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void SetRandomeId() {
        Random rand = new Random();
        this.id = rand.nextInt();
    }

    // Operator relational
    public boolean is_name_same(MyBox other_box) {
        return this.name.equals(other_box.name);
    }

    public boolean is_id_same(MyBox other_box) {
        return this.id == other_box.id;
    }

    public boolean is_same(MyBox other_box) {
        return this.is_id_same(other_box) && this.is_name_same(other_box);
    }

    // Baca/Tulis, untuk interface dengan input/output device.
    public MyBox bacaBox() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("inputkan nama untuk box");

        String name;
        name = keyboard.nextLine();

        System.out.println("inputkan angka untuk id box");
        int id;
        while (true) {
            try {
                id = keyboard.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("err!, msg: mohon masukkan angka");
            }
        }
        keyboard.close();

        this.name = name;
        this.id = id;

        return this;
    }

    public void tulisBox() {
        System.out.println("nama box:\t" + this.name);
        System.out.println("id box:\t" + this.id);
    }

    // Destruktor/Dealokator
    // tidak digunakan

    // Konversi
    // tidak digunakan

    // Aritmatika
    // tidak digunakan
}

// CLIENT
public class box_exemple {

    public static void main(String[] args) {
        // Memanfaatkan langsung type
        MyBox my_box = new MyBox("box_abc", 123);
        // CLIENT dapat melakukan apapun pada `type` MyBox menggunakan `Primitif` yang disediakan
        // dalam penggunaan `type`, CLIENT hanya tahu fungsi secara "umum" namun pemahaman inti implementasi bagaimana fungsi tersebut terealisasi bukanlah tanggung jawab "CLIENT"
    }
}
