import java.util.Scanner;

/**
 * Created by acer on 6/25/2017.
 */
public class Codeforces_510A {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String[] numbers = p.nextLine().split(" ");
        int row = Integer.parseInt(numbers[0]);
        int column = Integer.parseInt(numbers[1]);
        for(int i = 1;i <= row;i++){
            for(int j = 0;j < column;j++){
                if(i%2 != 0){
                    System.out.print("#");
                }else if((i%2 == 0) && j == column-1 && i%4 != 0){
                    System.out.print("#");
                }else if(i%2 == 0 && j == 0 && i%4 == 0){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
