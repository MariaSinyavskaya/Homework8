import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        int [] intArray = new int [] {1, 2, 3};
        // Другой вариант:
        // int [] intArray = new int [3];
        // intArray [0] = 1;
        // intArray [1] = 2;
        // intArray [2] = 3;
        float [] floatArray = {1.57f, 7.654f, 9.986f};
        char [] charArray = new char [] {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        System.out.println("======================================================================");
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int [] intArray = new int [] {1, 2, 3};
        float [] floatArray = {1.57f, 7.654f, 9.986f};
        char [] charArray = new char [] {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        int i;
        for (i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                System.out.println(intArray[i]);
                break;
            }
            System.out.print(intArray[i] + ", ");
        }
        for (i = 0; i < floatArray.length; i++) {
            if (i == floatArray.length - 1) {
                System.out.println(floatArray[i]);
                break;
            }
            System.out.print(floatArray[i] + ", ");
        }
        for (i = 0; i < charArray.length; i++) {
            if (i == charArray.length - 1) {
                System.out.println(charArray[i]);
                break;
            }
            System.out.print(charArray[i] + ", ");
        }
        System.out.println("======================================================================");
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int [] intArray = new int [] {1, 2, 3};
        float [] floatArray = {1.57f, 7.654f, 9.986f};
        char [] charArray = new char [] {'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        int i;
        for (i = intArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(intArray[i]);
                break;
            }
            System.out.print(intArray[i] + ", ");
        }
        for (i = floatArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(floatArray[i]);
                break;
            }
            System.out.print(floatArray[i] + ", ");
        }
        for (i = charArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(charArray[i]);
                break;
            }
            System.out.print(charArray[i] + ", ");
        }
        System.out.println("======================================================================");
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int [] intArray = new int [] {1, 2, 3};
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i]++;
            }
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println("======================================================================");
    }
}