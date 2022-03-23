package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x){
            return this.y - o.y;
        }else {
            return this.x - o.x;
        }
    }

}

public class bj_11650_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n]; //객체배열 생성
        for(int i = 0; i < n; i++){
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            arr[i] = new Point(x,y); //메소드 만들고 x,y 인자로 받기
        }
        Arrays.sort(arr);

        for(int i =0; i<n; i++){
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
