package CSC120;
public class TesterForAssignment11 {
    public static void main(String[] args) {
        boolean[][] array = {
                            {false, false, false, false},
                            {false, false, false, true},
                            {false, false, true, false},
                            {false, false, true, true},
                            {false, true, false, false},
                            {false, true, false, true},
                            {false, true, true, false},
                            {false, true, true, true},
                            {true, false, false, false},
                            {true, false, false, true},
                            {true, false, true, false},
                            {true, false, true, true},
                            {true, true, false, false},
                            {true, true, false, true},
                            {true, true, true, false},
                            {true, true, true, true}
                        };

        for(int i = 0; i < 16; i++) {
            boolean r = f(array[i][0], array[i][1], array[i][2], array[i][3]);
            System.out.println(r);
        }                
    }

    public static boolean f(boolean a, boolean b, boolean c, boolean d) {
        return ((!a) && (b) && (!c)) || ((a) && (!c) && (!d)) || ((a) && (!b) && (c)) || ((!a) && (c) && (!d));
    }
}