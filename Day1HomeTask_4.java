package HomeTask.HomeTask;
import java.util.Scanner;

public class Day1HomeTask_4 {

    public static void selectionSort(int[] arr) {
//попарно сравнивает и сортирует до тех пор, пока не выведет в правильном порядке
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                }
            }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int a, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        a = in.nextInt();
        arr = new int[a];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * a);
        for (int i : arr)
            System.out.print(i + " ");

        System.out.print("\n");
        selectionSort(arr);
    }
}









