package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        for(int i = 1; i< arr.length; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }

    }
}
