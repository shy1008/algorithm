import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList){
        for (int index = 0; index < arrayList.size() -1; index++) {
            for (int index2 = index + 1; index2 > 0; index2--) {
                if (arrayList.get(index2) < arrayList.get(index2-1)){
                    Collections.swap(arrayList,index2,index2-1);
                } else {
                    break;
                }
            }
        }

        return arrayList;
    }
}
