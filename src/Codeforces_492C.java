import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by acer on 4/17/2017.
 */
public class Codeforces_492C {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        String[] in = p.nextLine().trim().split(" ");
        int essays = 0;
        int sum = 0;
        int difference = 0;
        int average = 0;
        int n = Integer.parseInt(in[0]);
        int r = Integer.parseInt(in[1]);
        int avg = Integer.parseInt(in[2]);
        int[][] intgrades = new int[n][2];
        String[][] grades = new String[n][2];
        for(int i = 0;i < n;i++){
                grades[i] = p.nextLine().trim().split(" ");
                for(int j = 0;j < 2;j++){
                    intgrades[i][j] = Integer.parseInt(grades[i][j]);
                }
            sum += intgrades[i][0];
        }
        Arrays.sort(intgrades,Comparator.comparing(total->total[1]));
        average = sum/n;
        if(average < avg){
            for(int i = 0;i < n;i++){
                if(intgrades[i][0] == r){
                    continue;
                }else if(intgrades[i][0] < r){
                    difference = r - intgrades[i][0];
                    for(int m = 0;m < difference;m++){
                        essays +=intgrades[i][1];
                        sum += 1;
                        average = sum/n;
                        if(average >= avg){
                            break;
                        }
                    }
                    if(average >= avg){
                        break;
                    }
                }
            }
        }
        System.out.println(essays);
    }
}
