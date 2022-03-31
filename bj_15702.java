package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_15702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(n.split(" ")[0]); //문제 수
        arr[1] = Integer.parseInt(n.split(" ")[1]); //학생 수
        int[] arr2 = new int[arr[0]];
        for(int i =0; i < arr[0]; i++ ){
            arr2[i] = Integer.parseInt(br.readLine().split("")[i]);
        }
        String[][] point = new String[arr[1]][arr[0]+1];
        for(int i =0; i < arr[0]; i++ ){
            point[i][]
        }
    }
}
