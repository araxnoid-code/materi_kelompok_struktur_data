package Stack;

import java.util.Stack;

class TumpukanPiring {

    private Stack<String> tumpukan;

    public TumpukanPiring() {
        this.tumpukan = new Stack<String>();
    }

    public void MasukkanPiring(String piring) {
        this.tumpukan.push(piring);
    }

    public String AmbilPiring() {
        return this.tumpukan.pop();
    }
}

public class mainTumpukanPiring {

    public static void main(String[] args) {
        // construktor
        TumpukanPiring MytumpukanPiring = new TumpukanPiring();

        // setter
        MytumpukanPiring.MasukkanPiring("piring 1");
        MytumpukanPiring.MasukkanPiring("piring 2");
        MytumpukanPiring.MasukkanPiring("piring 3");

        // getter
        String piring_3 = MytumpukanPiring.AmbilPiring();
        String piring_2 = MytumpukanPiring.AmbilPiring();
        String piring_1 = MytumpukanPiring.AmbilPiring();
    }
}
