import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by acer on 4/15/2017.
 */
public class Codeforces_313A {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        String in = p.nextLine();
        StringBuilder sb = new StringBuilder(in).deleteCharAt(in.length()-1);
        StringBuilder sb2 = new StringBuilder(in).deleteCharAt(in.length()-2);

        int n = Integer.parseInt(in);
        int n1 = Integer.parseInt(sb.toString());
        int n2 = Integer.parseInt(sb2.toString());
        if(n>n1 && n>n2)
            System.out.println(n);
        else if(n1> n2)
            System.out.println(n1);
        else
            System.out.println(n2);
    }
}
