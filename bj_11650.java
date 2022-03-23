package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int[][] num1 = new int[input][2];
        for(int i = 0 ; i < input; i++){
                String[] num2 = br.readLine().split(" ");
                num1[i][0] = Integer.parseInt(num2[0]);
                num1[i][1] = Integer.parseInt(num2[1]);
        }
        //2차원 배열 정렬
        Arrays.sort(num1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){ //x좌표가 같으면
                    return o1[1] - o2[1]; //y좌표 비교
                }else {
                    return o1[0] - o2[0]; //x좌표가 다른경우
                }
            }
        });
        for(int i = 0; i < input; i++){
            System.out.println(num1[i][0] + " " + num1[i][1]);
        }

    }
}
