package ThucHanh;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

    private static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMinIndex = i;
            double currentMin = list[i];
            for (int j = i+1; j < list.length; j++) {
                if (list[currentMinIndex]>list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
                if (currentMinIndex != i){
                    list[currentMinIndex] = list[i];
                    list[i] =currentMin;
                }
            }
        }
    }

    private static void selectionSort1(double[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[min]>list[j]){
                    min = j;
                }
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }
}
