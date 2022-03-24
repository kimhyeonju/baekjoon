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
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sortarr = new int[n];
        String input = br.readLine(); // 2 4 -10 4 -9
        for(int i = 0; i < n; i++){
            String[] arr2 = input.split(" ");
            arr[i] = Integer.parseInt(arr2[i]);
            sortarr[i] = Integer.parseInt(arr2[i]);
        }
        Arrays.sort(sortarr); //  -10 -9 2 4 4

        int idx = 0;
        for(int v: sortarr){
            if(!map.containsKey(v)){
                map.put(v,idx);
                idx++;
            }
        }
        for(int k: arr){
            System.out.print(map.get(k) + " ");
        }
    }
}
