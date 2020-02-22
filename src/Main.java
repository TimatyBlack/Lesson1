import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.File;
import java.util.stream.IntStream;

public class Main {

        public static void main(String[] args) {
            long i = 2;
            recursionFunc(i);
            // part 1

//        int i = 1;
//
//        for (int j = 1; j <= 10; j++) {
//            System.out.print(j);
//        }
//        System.out.println();
//        while (i <= 10) {
//            System.out.print(i);
//            i++;
//        }
//        System.out.println();
//        i = 0;
//        do {
//            i++;
//            System.out.print(i);
//        } while (i < 10);


            //part 2

//        Scanner sc = new Scanner(System.in);
//        String enter = sc.nextLine();
//        int sum = 0, num = 0;
//        boolean isFinished = false;
//
//        while (!isFinished) {
//            if (enter.equals("stop")) {
//                System.out.println(sum);
//                isFinished = true;
//            } else {
//                try {
//                    num = Integer.valueOf(enter);
//                } catch (Exception e) {
//                    System.out.println("Error(!" + e.getMessage() + ").");
//                }
//                sum += num;
//                enter = sc.nextLine();
//            }
//        }

            //part 3

//        boolean isEven;
//        for (int i = 0; i <= 100; i++) {
//            isEven = i % 2 == 0 ? true : false;
//            if (isEven) {
//                System.out.print(i + " ");
//            }
//        }

            //part 4

//        int[] array = new int[100];
//        int[] array1 = new int[100];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//            System.out.print(array[i] + " ");
//        }
//        array1 = array;
//        array1[10] = 20;
//        System.out.println(array[10] + " " + array1[10]);

            //part 5

        }
        public static void recursionFunc(long i){

            System.out.println((long)Math.pow(i, 2));
            try {
                Thread.sleep(100);
            } catch (Exception e){}
            recursionFunc((long)i+1);
        }
    }
