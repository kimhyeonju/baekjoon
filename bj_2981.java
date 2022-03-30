package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int a = arr[1] - arr[0];
        //int k = 0;
        for(int i = 2; i < n; i++){
            //k = gcd(a,arr[i] - arr[i-1]);
            a = gcd(a,arr[i] - arr[i-1]);
        }
        for(int i = 2; i <= a; i++){
            if(a%i == 0){
                System.out.print(i + " ");
            }
        }


    }
    static int gcd(int a, int b){
        while (b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}
