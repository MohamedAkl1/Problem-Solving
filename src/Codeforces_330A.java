import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Mohamed Akl on 6/25/2017.
 */
public class Codeforces_330A {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int r = p.nextInt();
        int c = p.nextInt();
        String[][] array = new String[r][c];
        ArrayList<Integer> sr = new ArrayList<>();
        ArrayList<Integer> sc = new ArrayList<>();
        int cells = 0;
        p.nextLine();
        for(int i = 0;i < r;i++){
            String[] a = p.nextLine().split("");
            for(int j = 0;j < c;j++){
                if(Objects.equals(a[j], "S")){
                    if(!sr.contains(i)){
                        sr.add(i);
                    }
                    if(!sc.contains(j)){
                        sc.add(j);
                    }

                }
                array[i][j] = a[j];
            }
        }
        
        int newR = r - sr.size();
        int newC = c - sc.size();
        cells = (newR*c) + ((newC*r)-(newR*newC));
        System.out.println(cells);
    }
}
