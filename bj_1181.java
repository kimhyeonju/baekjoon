package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
            //System.out.println(input[i]);
        }
        Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2); //사전순으로 정의
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        System.out.println(input[0]); //첫번째 값 찍어주기
        for (int i = 1; i < n; i++) {
            if (!input[i].equals(input[i - 1]) ) { //"=="은 주소값 비교
                System.out.println(input[i]);      //"equals"은 객체 자체를 비교
            }
        }
    }
}
