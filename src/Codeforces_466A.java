import java.util.Scanner;

/**
 * Created by acer on 4/15/2017.
 */
public class Codeforces_466A {
    static Scanner p = new Scanner(System.in);
    public static void main(String[] args) {
        String[] nmab = p.nextLine().split(" ");
        int mb = Integer.parseInt(nmab[1]) * Integer.parseInt(nmab[3]);
        int na = Integer.parseInt(nmab[0]) * Integer.parseInt(nmab[2]);
        int n = Integer.parseInt(nmab[0]);
        int m = Integer.parseInt(nmab[1]);
        int a = Integer.parseInt(nmab[2]);
        int b = Integer.parseInt(nmab[3]);
        if(b / m < a){
            if(m == n){
                System.out.println(b);
                System.exit(0);
            }else if(m < n){
                if((n % m) % 2 == 0 && b < a){
                    System.out.println(b*((n + m - 1) / m));
                    System.exit(0);
                }else{
                    if(b < a){
                        System.out.println(b*(n/m)+(b*(n%m)));
                        System.exit(0);
                    }else{
                        System.out.println((b*(n/m))+((n%m)*a));
                        System.exit(0);
                    }
                }

            }else{
                if(b > a && (n*a) < b){
                    System.out.println(n*a);
                    System.exit(0);
                }else{
                    System.out.println(b);
                }
            }
        }else{
            System.out.println(n*a);
            System.exit(0);
        }
    }
}
