package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(gcd(a,b));
        System.out.println((a*b) / gcd(a,b));


    }
    public static int gcd(int a, int b){
        int temp;
        while (b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}
