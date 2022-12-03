import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();

        int sum;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(dice1);
        list.add(dice2);
        list.add(dice3);

        if (dice1 == dice2){
            //첫번째와 두번째가 같다
            if (dice2 == dice3){
                //두번째와 세번째가 같다
                sum = 10000 + dice1 * 1000;

            }else {
                //두번째와 세번째가 다르다
                sum = 1000 + dice1 * 100;
            }
        }else {
            //첫번째와 두번째가 다르다
            if (dice1 == dice3){
                //첫번째수와 세번째가 같다
                sum = 1000 + dice1 * 100;
            }else if (dice2 == dice3){
                //두번째수와 세번째가 같다
                sum = 1000 + dice2 * 100;
            }else {
                //첫번째와 세번째가 다르다
                int max = Collections.max(list);
                sum = max * 100 ;
            }
        }

        System.out.println(sum);

    }
}
