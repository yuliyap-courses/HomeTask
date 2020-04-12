package HomeTask.HomeTask.DAY1;

import java.util.Scanner;
import java.util.Arrays;

public class Day1HomeTask_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
        int a = in.nextInt();
        int[] arr = new int[a];
            for (int i = 0; i < arr.length; i++)
                arr[i] = (int) (Math.random() * a);
            for (int i : arr) System.out.print(i + " ");

            System.out.print("\n");

            for (int i = 0; i<arr.length /2; i++){
                int temp = arr[i];
                arr[i] = arr[arr.length - i -1];
                arr[arr.length -i - 1] = temp;

            }
            System.out.print(Arrays.toString(arr));
        }

    }