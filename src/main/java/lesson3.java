import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        System.out.println("Work1: ");
        work1 ();
        System.out.println("\nWork2: ");
        work2 ();
        System.out.println("\nWork3: ");
        work3 ();
        System.out.println("\nWork4: ");
        work4();
        System.out.println("\nWork5: ");
        work5(4,3);
        System.out.println("\nWork6: ");
        work6();


    }

    public static void work1 () {
        int arr [] = {1,1,1,0,0,1,0,1,0,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 0) {
                arr [i] = 1;
            } else {
                arr [i] = 0;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void work2 () {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.print(Arrays.toString(arr));

    }

    public static void work3 () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void work4 () {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                if (i == j || i == x - 1) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void work5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    public static void work6 () {
        int[] arr = {5,7,2,3,8};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}



