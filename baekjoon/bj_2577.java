package baekjoon;

import java.util.Scanner;

public class bj_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            int num1 = sc.nextInt();
            arr[i] = num1;
        }
        int[] count = new int[10];
        for(int i = 0; i < 10; i++){
            count[i] = 0;
        }
        String num2 = Integer.toString(arr[0] * arr[1] * arr[2]);
        String[] arr2 = num2.split("");
        for(int i = 0; i < arr2.length; i++){
            switch (arr2[i]){
                case "0": count[0]++; break;
                case "1": count[1]++; break;
                case "2": count[2]++; break;
                case "3": count[3]++; break;
                case "4": count[4]++; break;
                case "5": count[5]++; break;
                case "6": count[6]++; break;
                case "7": count[7]++; break;
                case "8": count[8]++; break;
                case "9": count[9]++; break;
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println(count[i]);
        }
    }
}
