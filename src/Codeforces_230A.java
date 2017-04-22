import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by acer on 4/18/2017.
 */
public class Codeforces_230A {
    public static void main(String[] arg){
        int check = 1;
        int temp;
        Scanner p = new Scanner(System.in);
        String[] in = p.nextLine().trim().split(" ");
        int s = Integer.parseInt(in[0]);
        int n = Integer.parseInt(in[1]);
        String[][] dragons = new String[n][2];
        int[][] intdragons = new int[n][2];
        for(int i = 0;i < n;i++){
            dragons[i] = p.nextLine().split(" ");
            for(int j = 0;j < 2;j++){
                intdragons[i][j] = Integer.parseInt(dragons[i][j]);
            }
        }

        Arrays.sort(intdragons, new Comparator<int[]>() {
            @Override
            public int compare(int[] int1, int[] int2)
            {
                Integer number1 = int1[0];
                Integer number2 = int2[0];
                return number1.compareTo(number2);
            }
        });

        for(int i = 0;i<n;i++){
            if(s>intdragons[i][0]){
                s+=intdragons[i][1];
            }else{
                check = 0;
                break;
            }
        }
        if(check == 1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
