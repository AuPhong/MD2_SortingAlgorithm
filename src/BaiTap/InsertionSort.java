package BaiTap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 4, 5, 6, 8, 2, 3};
        insertionSort(arr);
        for (int element : arr) {
            System.out.print(element + "\t");
        }
    }

    private static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int temp = arr[i];
//            int j = i-1;
//            while (j >=0 && arr[j]>temp){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = temp;
//        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
