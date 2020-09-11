public class Example {
        public static void main(String[] args) throws Exception {
            int[] arr = {1, 22, 3, 34, 17};
            int summ = 0;
            for (int i : arr) {
                summ += i;
                System.out.println(i);
                System.out.println(summ);
            }
            System.out.println(summ / arr.length);
            System.out.println(arr.length);
        }
}
