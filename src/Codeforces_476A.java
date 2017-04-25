import java.util.Scanner;

/**
 * Created by acer on 4/22/2017.
 */
public class Codeforces_476A {
    public static void main(String[] ar){
        Scanner p = new Scanner(System.in);
        int moves=0;
        String[] input = p.nextLine().trim().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        if(n<m){
            System.out.println(-1);
            System.exit(0);
        }
        if(n%2 == 0){
            moves = n/2;
            if((n/2)%m == 0){
                System.out.println(n/2);
                System.exit(0);
            }else{
                    for(int i = 0;i<moves%m;i++){
                        moves++;
                        if(moves%m == 0){
                            System.out.println(moves);
                            System.exit(0);
                        }
                }
            }
        }else{
            moves = (n/2) +1;
            if((moves)%m == 0){
                System.out.println(moves);
                System.exit(0);
            }else{
                for(int i = 0;i<(moves%m);i++){
                    moves++;
                    if(moves%m == 0){
                        System.out.println(moves);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
