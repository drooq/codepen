public class Loader104 {
//         public static void main(String[] args) {
//            int i = 10;
//            do {i--;} while (i > 0);
//            System.out.println("Value i = " + i);
//        }
    public static void main(String[] args) {
//        int sum = 10;
//        for (int i = 10; i < 100; i = i + 10) {
//            System.out.println(sum);
//            sum += i;
//        }
//        System.out.println(sum);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//        int[] array = {1, 2, 3, 4}; //массив чисел
//        for (int value : array) {
//            System.out.println("Удвоенное значение из массива:" + value * 2);
//        }
//        int[] array = {4, 5, 8, 44, 90, 67, 3};
//        for (int i = 0; i < array.length; i++) { //индексы от нуля до длины массива — 1
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(array[i]); //обращение к элементу массива с индексом i
//        }
       int value = 0;
        int[] array = {13, 32, 39, 4, 55, 36, 7, 82, 99, 10};
        if (array[5] > 10) {
            array[5] = array[5] / 2;
            value = array[3] * 3;
            System.out.println(value +" "+array[3]+" "+array[5]);
        } else {
            array[5] = array[5] * 2;
            value = array[1];
        }
        value += array[5];
        System.out.println(value);
    }
    }