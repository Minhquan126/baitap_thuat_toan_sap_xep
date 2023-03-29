import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    static  int[] list = {5,2,6,4,3,1};
    public static void main(String[] args) {

        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length - 1; i++) {
            List<Integer> checkList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {

                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                checkList.add(list[j]);
                System.out.println(" Lan lap cua i " + j + ":" + checkList.get(j));
            }
            }
    }
}
