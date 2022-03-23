package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int day = 0;
        int day2 = 0;
        if( x != 1 ){
        for(int i = 0; i < x-1 ; i++){
            day += month[i];
            day2 = (day+y) % 7;
        }
        }else{
            day2 = y % 7;
        }
        switch (day2){
            case 0 : System.out.println("SUN"); break;
            case 1 : System.out.println("MON"); break;
            case 2 : System.out.println("TUE");break;
            case 3 : System.out.println("WED");break;
            case 4 : System.out.println("THU");break;
            case 5 : System.out.println("FRI");break;
            case 6 : System.out.println("SAT");break;

        }
    }
}
