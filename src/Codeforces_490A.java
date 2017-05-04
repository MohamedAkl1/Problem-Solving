import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by acer on 4/25/2017.
 */
public class Codeforces_490A {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        p.nextLine();
        String[] numbers = p.nextLine().trim().split(" ");
        List<Integer> ones = new ArrayList<>();
        List<Integer> twos = new ArrayList<>();
        List<Integer> threes = new ArrayList<>();
        for (int i = 0;i < n;i++){
            if(Integer.parseInt(numbers[i]) == 1){
                ones.add(i+1);
            }else if(Integer.parseInt(numbers[i]) == 2){
                twos.add(i+1);
            }else if(Integer.parseInt(numbers[i]) == 3){
                threes.add(i+1);
            }
        }
        int min = Math.min(ones.size(),twos.size());
        min = Math.min(min,threes.size());
        System.out.println(min);
        for(int k = 0;k < min;k++){
            System.out.println(ones.get(k) + " " + twos.get(k) + " " + threes.get(k));
        }
    }
}
