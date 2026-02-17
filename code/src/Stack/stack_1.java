package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

// NOTE
// beradasarkan Refrensi 2 halaman 43.
// STACK / Tumpukan

// INTI UTAMA:
// 1. dititik beratkan pada element puncak
// Note: element adalah item di dalam sebuah stack
// 2. penyisipan(memasukkan element baru) dengan cara meletakkan element baru tersebut di atas element puncak sebelumnya, ini menyebabkan element puncak kini berubah.
// // contoh:   [a, b, c, d, e, f] <- top. element top adalah f.
// //           element z mau masuk
// //           [a, b, c, d, e, f, z] <- top. z diletakkan setelah element top sebelumnya(f), kini element top adalah z
// 3. TOP adalah satu satunya tempat terjadi situasi, konsep ini juga disebut LIFO(Last In First Out)

public class stack_1 {

    public static void main(String[] args) {
        // Alhamdulillah Java telah memberikan tipe data Stack<Integer>, jadi tidak perlu buat manual dengan Array.
        Stack<Integer> my_stack = new Stack<Integer>();

        // implementasi berdasarkan Implementasi Stack dengan Tabel pada referensi 2 halaman 44
        // yang mana cukup mirip dengan array.

        // Stack masihlah kosong dan nilai top ialah 0
        System.out.println("apakah stack kosong? " + my_stack.isEmpty());
        try {
            System.out.println("apa index top dari stack? " + my_stack.peek());
        } catch (EmptyStackException e) {
            // Note: Warning
            System.out.println(
                "saat mengechek nilai TOP dari stack namun stack tersebut kosong, di java akan error"
            );
            // Note: gunakan error hendling untuk konteks java, untuk bahasa lain? error handling nya juga beda.
        }

        // menambahkan element
        my_stack.push(10); // [10] <- top
        my_stack.push(25); // [10, 25] <- top
        my_stack.push(80); // [10, 25, 80] <- top
        // stack kini berisi 3 angka dengan bentuk kurang lebih " [10, 25, 80] <- top "
        // saat diperiksa menggunakana method sebelumnya:
        System.out.println("apakah stack kosong? " + my_stack.isEmpty());
        System.out.println("apa nilai top pada stack? " + my_stack.peek());

        // preidiksi awalnya adalah [10, 25, 80], mari check
        System.out.println("stack saat ini: " + my_stack);

        // mengeluarkan element dari stack juga dimulai dari top
        // Note method pop akan memberikan return berupa nilai dari element top itu sendiri sembari menghaspus element top dari stack
        System.out.println("element yang dihilangkan " + my_stack.pop()); // top berubah menjadi 25
        System.out.println("element yang dihilangkan " + my_stack.pop()); // top berubah menjadi 10
        System.out.println("element yang dihilangkan " + my_stack.pop()); // top berubah menjadi 0 (stack sudah kosong)

        // NOTE:    apa perbedaan pop dan peek? pop akan mengakses nilai top namun sekaligus mengambil/menghapusnya dari stack
        //          namun peek hanya akan melihat saja tanpa mengambil/menghapusnya dari stack
    }
}
