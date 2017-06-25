import java.util.Scanner;

/**
 * Created by acer on 6/25/2017.
 */
public class Codeforces_25A {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int[] a = new int[n];
        int even = 0;
        int odd = 0;
        for(int i = 0;i < n;i++){
            a[i] = p.nextInt();
            if(a[i]%2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        if(even>odd){
            for(int i = 0;i < n;i++){
                if(a[i]%2 != 0){
                    System.out.print(i+1);
                }
            }
        }
        else
            for(int i = 0;i < n;i++){
            if(a[i]%2 == 0){
                System.out.print(i+1);
            }
            }
    }
}
