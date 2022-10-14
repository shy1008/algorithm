import java.util.Scanner;

public class Main {
    public static int[] arr = new int[4001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 전구의 개수  ex 8
        int M = sc.nextInt();  // 명령어의 개수 ex 3

        for (int i = 1; i <= N; i++) {
            int s = sc.nextInt();
            arr[i] = s; // N개의 전구상태가 담은 배열 ex [0,0,0,0,0,0,0,0]
        }

//        System.out.println(N);
//        System.out.println(M);
//        System.out.println(Arrays.toString(arr));

        for (int j = 2; j < M+2; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 1){
                int i = b;
                int x = c;

                arr[i] = x;
            }else  {
                int l = b;
                int r = c;

                switch (a){
                    case 2:
                        for (int z = l; z <= r; z++) {
                            if (arr[z] == 0){
                                arr[z] = 1;
                            }else {
                                arr[z] = 0;
                            }
                        }
                        break;
                    case 3:
                        for (int z = l; z <= r; z++) {
                            arr[z] = 0;
                        }
                        break;
                    case 4:
                        for (int z = l; z <= r; z++) {
                            arr[z] = 1;
                        }
                        break;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
