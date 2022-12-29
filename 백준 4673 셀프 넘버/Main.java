
public class Main {
    public static void main(String[] args) {

        boolean[] checkArr = new boolean[10001];

        for (int i = 1; i < checkArr.length; i++) {
            int n = selfNumber(i);

            if (n < 10001){
                checkArr[n] = true;
            }
        }

        for (int i = 1; i < checkArr.length; i++) {
            if (!checkArr[i]){
                System.out.println(i);
            }
        }

    }

    static int selfNumber(int num) {
        int sum = num;

        while (num != 0){
            sum = sum + (num % 10);
            num = num / 10 ;
        }

        return sum;
    }
}