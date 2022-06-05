import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> sampleDataList = new ArrayList<>(Arrays.asList(14, 23, 3, 9, 19, 20, 4, 81, 58));
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(insertionSort.sort(sampleDataList));

    }
}

//    SelectionSort selectionSort = new SelectionSort();
//    System.out.println(selectionSort.sort(sampleDataList));