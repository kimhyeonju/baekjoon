package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            str[i][0] = input[0];
            str[i][1] = input[1];
        }
        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);//오름차순
                return Integer.parseInt(o2[0]) - Integer.parseInt(o1[0]);//내림차순
            } // 같으면 0 , o1이 앞에 오게하려면 음수, o1이 뒤에 오게하려면 양수
        });   //o1이 기준
        for(int i = 0; i < n; i++){
            System.out.println(str[i][0] + " " + str[i][1]);
        }
    }
}
