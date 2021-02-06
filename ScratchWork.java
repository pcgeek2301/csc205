import java.util.Random;
public class ScratchWork {
    public static void main(String[] args) {
        long seed = 5;
        Random obj = new Random(seed);
            
        System.out.print(obj.nextInt(10));

    }
}