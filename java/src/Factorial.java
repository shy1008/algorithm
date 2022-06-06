import java.util.ArrayList;

public class Factorial {
    public int fac (Integer n) {
        if (n <= 1){
            return 1;
        } else {
            return n * fac(n -1);
        }
    }

    public int totalSum (ArrayList<Integer> arrayList){
        if (arrayList.size() <= 0){
            return  0;
        }
        return arrayList.get(0) + totalSum(new ArrayList<>(arrayList.subList(1,arrayList.size())));
    }

}
