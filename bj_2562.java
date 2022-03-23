package baekjoon;

import java.util.Scanner;

public class bj_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9;i++){
            int num = sc.nextInt();

            arr[i] = num;
        }
        int a = arr[0];
        int b = arr[0];
        int index = 0;
        for(int i = 1; i < 9;i++){
            if(a <= arr[i]){
                a = arr[i];
                index = i;
            }
        }
        System.out.println(a);
        System.out.println(index + 1);
    }
}
