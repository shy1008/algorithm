import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public ArrayList<Integer> sort(ArrayList<Integer> arrayList) {
        Integer lowSelect;
        for (int standard = 0; standard < arrayList.size() - 1; standard++) {
            lowSelect = standard;
            for (int index = standard + 1; index < arrayList.size(); index++) {
                if (arrayList.get(lowSelect) > arrayList.get(index)) {
                    lowSelect = index;
                }
            }
            Collections.swap(arrayList, lowSelect, standard);
        }

        return arrayList;
    }
}
