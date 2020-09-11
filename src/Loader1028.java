public class Loader1028 {

    public static void main(String[] args) {
        int value = add(3, 4);
        int result = add(value, 10);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    /**
     * @author DKA
     * @param a
     * @param b
     * @return min of a,b
     */
    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
}

