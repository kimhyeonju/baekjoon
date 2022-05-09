package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n-1];
        String str1 = br.readLine();
        int str1_len = str1.length();

        for(int i = 0; i < n-1; i++){
            arr[i] = br.readLine();
        }
        int[] len = new int[n-1];

        for(int i = 0; i < n-1; i++){
            len[i] = arr[i].length();
        }// 단어 길이 저장

        String[] word1 = new String[10];

        for(int i = 0; i < str1_len; i++){
            word1[i] = str1.split("")[i]; //첫번째 단어 한글자 씩 담음

        }

        String[] word2 = new String[10];
        int[] kk = new int[n-1];

        for(int r = 0; r < n-1; r++){
            int k = 0;
            for(int i = 0; i < arr[r].length(); i++){
                word2[i] = arr[r].split("")[i]; //단어 한글자 씩 담음
                for(int j = 0; j < str1_len; j++){
                    if(!word2[i].equals(word1[j])){
                        k++;
                    }
                }

            }
            kk[r] = k;

        }
        int p = 0;
        for(int r = 0; r < n-1; r++){
            if(kk[r] <= (str1_len*arr[r].length())-str1_len){
                p++;
            }
            //System.out.println(kk[r] + "^^");
            //System.out.println((str1_len*arr[r].length())-str1_len);
        }
        System.out.println(p);
    }
}
