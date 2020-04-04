package HomeTask.HomeTask;

class Day1HomeTask5_1 {

    public static void main(String[] args) {
        int[] addNum = {5, 45, -147};
        int newArr= addNum.length;
        int[] a = {1, 3, 67, 8, 9, 77, 444, 88, -5, 8, 3};
        int[] b = new int[a.length + newArr];
        System.out.print("Array before: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            b[i + newArr] = a[i];
            a[i] = b[i];
        }
        System.out.println();
        System.arraycopy(addNum, 0, a, 0, newArr);
        System.out.print("Array after: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}