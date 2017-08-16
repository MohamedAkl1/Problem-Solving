import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Mohamed Akl on 8/16/2017.
 */
public class Codeforces_441A {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int n = p.nextInt();
        int s = p.nextInt();

        p.nextLine();
        int total = 0;
        ArrayList<Integer> indexes = new ArrayList<>();
        String[] input;
        for(int i = 0;i < n;i++){
            input = p.nextLine().split(" ");
            for(int j = 1;j < input.length;j++){
                if(Integer.parseInt(input[j]) < s){
                    total++;
                    indexes.add(Integer.parseInt(input[0]));
                }
            }
        }
        Collections.sort(indexes);
        System.out.println(total);
        for(int i=0;i < indexes.size();i++){
            if(i != indexes.size()-1){
                System.out.print(indexes.get(i) + " ");
            }else{
                System.out.print(indexes.get(i));
            }
        }
    }
}
