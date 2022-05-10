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
        //int[] len = new int[n-1];

        //for(int i = 0; i < n-1; i++){
        //    len[i] = arr[i].length();
        //}// 단어 길이 저장



        int r=0;

        for(int i = 0; i < n-1; i++){

            char[] word1 = str1.toCharArray();
            char[] word2 = arr[i].toCharArray(); // 나머지 단어 하나씩 담음

            int count = 0;

            for(int j = 0; j < arr[i].length(); j++){
                for(int k = 0; k < str1_len; k++){
                    if(word2[j] == word1[k]){
                        word2[j] = '1';
                        word1[k] = '0';
                        count++;
                    }
                }
            }
            if(str1_len == arr[i].length() && (str1_len == count || str1_len-1== count) ){
                r++; // 길이가 같음
            }else if(str1_len - 1 == arr[i].length() && count == arr[i].length()){
                r++; //길이가 첫 단어가 한글자 더 길때
            }else if(str1_len + 1 == arr[i].length() && count == arr[i].length()){
                r++;
            }
        }
        System.out.println(r);




    }
}
