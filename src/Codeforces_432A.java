import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by acer on 6/25/2017.
 */
public class Codeforces_432A {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int k = p.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0;i < n;i++){
            a[i] = p.nextInt();
            if(a[i]+k <= 5){
                b.add(a[i]);
            }
        }
        System.out.print(b.size()/3);
    }
}
