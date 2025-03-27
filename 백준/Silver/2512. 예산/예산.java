import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[][] arr = new int[N][2];
        int sum=0;
        int bigNum=0;
        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            sum+=arr[i][0];
            if(bigNum<arr[i][0]) bigNum=arr[i][0];
        }


        double CityValue = Integer.parseInt(br.readLine());

        double avg = (double) CityValue / N;


        if(avg<1) {
            avg=0;
        }

        double add = 0.0;
        double avgUpNum = 0.0;
        Arrays.sort(arr, (a, b) -> Integer.compare(b[0], a[0]));

        while(avg >= 1) {
            add = 0.0;
            avgUpNum = 0.0;

            for (int i = 0; i < N; i++) {
                if (arr[i][0] > avg) {
                    avgUpNum++;
                }
                if (arr[i][0] <= avg && arr[i][1]==0) {
                    add += arr[i][0];
                    arr[i][1]=1;
                }
            }


            CityValue = CityValue - add;

            avg = CityValue / avgUpNum;

            if(add == 0) {
                break;
            }
            if(avgUpNum == 1) {
                break;
            }
        }


        if(arr[0][0] <= CityValue/avgUpNum) {
            System.out.println(arr[0][0]);
        }
        else if(avg == 0) {
            System.out.println(0);
        }
        else {
            System.out.println((int)Math.floor(avg));
        }
    }
}
