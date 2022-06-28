import java.util.Random;

public class LoteriaCaixa {
    public static void main(String[] args) {
        Random rode = new Random();
        int R;
        for(int a = 0; a <20;a++){
            R = rode.nextInt(10);
            System.out.println(R);
        }
    }
}