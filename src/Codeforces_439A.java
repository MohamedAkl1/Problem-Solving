import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by acer on 5/5/2017.
 */
public class Codeforces_439A {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String[] line1 = p.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int d = Integer.parseInt(line1[1]);
        String[] line2 = p.nextLine().split(" ");
        int[] x = new int[line2.length];
        int sum = 0;
        int restdur = (n-1)*10;
        int jokes = restdur/5;
        for(int i = 0;i < line2.length;i++){
            x[i] = Integer.parseInt(line2[i]);
            sum += x[i];
        }
        if(sum+restdur <= d){
            System.out.print(jokes + (d-sum-restdur)/5);
            System.exit(0);
        }else{
            System.out.println(-1);
            System.exit(0);
        }



    }
}
