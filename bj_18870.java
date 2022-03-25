package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class bj_18870 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sortarr = new int[n];
        String input = br.readLine(); // 2 4 -10 4 -9
        String[] arr2 = input.split(" ");

        for(int i = 0; i < n; i++){
            arr[i] = sortarr[i] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(sortarr); //  -10 -9 2 4 4

        int idx = 0;
        for(int v: sortarr){
            if(!map.containsKey(v)){ //원소가 중복되지 않을때
                map.put(v,idx); // -10 -9 2 4
                idx++;          //   0  1 2 3
            }
        }

        for(int k: arr){                        //2 4 -10 4 -9
            sb.append(map.get(k)).append(" "); //2 3  0  3  1
        }
        System.out.println(sb);
    }
}
