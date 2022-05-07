package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_15702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int[] arr = new int[2];
        arr[0] = Integer.parseInt(n.split(" ")[0]); //문제 수
        arr[1] = Integer.parseInt(n.split(" ")[1]); //학생 수
        int[] arr2 = new int[arr[0]];
        String arr3 = br.readLine();

        for(int i =0; i < arr[0]; i++ ){
            arr2[i] = Integer.parseInt(arr3.split(" ")[i]);
        }// 점수 크기
        //System.out.println("1");
        String[][] point = new String[arr[1]][arr[0]+1];
        String[] arr4 = new String[arr[1]];

        for(int i = 0; i < arr[1]; i++){
            arr4[i] = br.readLine();
        }

        for(int i =0; i < arr[1]; i++ ){
            for(int j =0; j < arr[0]+1; j++){
                point[i][j] = arr4[i].split(" ")[j];
            }
        }
        //입력 다 담음
        int[] sum = new int[arr[1]];

        for(int i = 0; i < arr[1]; i++) {
            for (int j = 1; j < arr[0] + 1; j++) {
                if (point[i][j].equals("O")) {
                    sum[i] += arr2[j-1];
                    //System.out.println(sum[i]);
                } else {
                    sum[i] += 0;
                }
            }
        }
        //for(int i = 0; i < arr[0]; i++) {
        //if(point[0][1].equals("O")) {
        //    System.out.println(555);
        //}
        //}
        int max = sum[0];
        int index = 0;
        for(int i = 0; i < arr[1]; i++){
            if(max<sum[i]){
                max = sum[i];
                index = i;
            }else if(max == sum[i]){
                if(point[index][0].compareTo(point[i][0]) > 0){
                    index = i;
                    //max = sum[i];
                }
            }
        }

        System.out.println(point[index][0]+ " "+max);
        //System.out.println(max);
    }
}
