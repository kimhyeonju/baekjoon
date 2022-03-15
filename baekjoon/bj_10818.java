package baekjoon;

import java.util.Scanner;

public class bj_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        //String num = sc.nextLine();
        //int count = Integer.parseInt(input);
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = sc.nextInt(); //string으로 받아서 공백으로 split해서 다시 int형으로 바꿔준다음 배열에 넣음
        }                           //공백기준으로 받은 정수들을 배열에 바로 넣음
        int num2 = arr[0];
        int num3 = arr[0];
        for(int i = 1; i < count; i++) {
            if(num2 <= arr[i]){
                num2 = arr[i];
            }if(arr[i] <= num3){
                num3 = arr[i];
            }
        }
        System.out.println(num3 +" "+num2);

    }
}
