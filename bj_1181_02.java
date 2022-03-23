package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Word implements Comparable<Word>{
    String x;

    public Word(String x) {

        this.x = x;
    }

    @Override
    public int compareTo(Word o) {
        if (this.x.length() == o.x.length()) {
            return this.x.compareTo(o.x);
        } else {
            return this.x.length() - o.x.length();
        }
    }
}
public class bj_1181_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //String[] input = new String[n];
        Word[] word = new Word[n];
        for (int i = 0; i < n; i++) {
            String x = br.readLine();
            word[i] = new Word(x); //생성자 만들기
        }
        Arrays.sort(word);

        System.out.println(word[0].x); //".x" 주의! 안하면 주소값 나옴
        for (int i = 1; i < n; i++) {
            if(!word[i].x.equals(word[i-1].x)){
                System.out.println(word[i].x);
            }
        }
    }
}
