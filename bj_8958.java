package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] x = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = br.readLine();
            String[] arr2 = arr[i].split("");
            int length = arr2.length;;

            int count = 0;

            for(int j = 0; j < length; j++){
                switch (arr2[j]){
                    case "O":
                        count++;
                        x[i] = x[i] + (1*count);
                        break;
                    case "X":
                        count = 0;
                        break;
                }
            }

            sb.append(x[i]).append('\n');
        }

        System.out.println(sb);

    }
}
