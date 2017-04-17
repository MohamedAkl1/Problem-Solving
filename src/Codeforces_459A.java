import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

/**
 * Created by acer on 4/15/2017.
 */
public class Codeforces_459A {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        String[] n = p.nextLine().split(" ");
        double x3 = 0,x4 = 0,y3 = 0,y4 = 0;
        int x1 = Integer.parseInt(n[0]);
        int y1 = Integer.parseInt(n[1]);
        int x2 = Integer.parseInt(n[2]);
        int y2 = Integer.parseInt(n[3]);
        double side;
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        int intdistance = (int) Math.round(distance/Math.sqrt(2));
        double dada = distance/Math.sqrt(2);
        if(dada-0.99999999999999 == (int) dada)
            dada = (int) Math.round(dada);
        if(dada-0.9999999999999996 == (int)dada){
            dada = (int) Math.round(dada);
        }
        if(dada ==(int) Math.round(distance/Math.sqrt(2)) ){
            side = dada;
            if(x2>x1){
                x3 = x2-side;
                y3 = y2;
                x4 = x1+side;
                y4 = y1;
                if(Math.abs(x2-x3) != side || Math.abs(y3-y1) != side || Math.abs(x4-x1) != side || Math.abs(y2-y4) != side){
                    System.out.println(-1);
                    System.exit(0);
                }
            }else if(x2<x1){
                x3 = x2+side;
                y3 = y2;
                x4 = x1-side;
                y4 = y1;
                if(Math.abs(x2-x3) != side || Math.abs(y3-y1) != side || Math.abs(x1-x4) != side || Math.abs(y2-y4) != side){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }else if(x1 == x2){
                side = y2-y1;
                x3 = x2+side;
                y3 = y2;
                x4 = x1+side;
                y4 = y1;
        }else if(y1 == y2){
            side = x2-x1;
            x3 = x2;
            y3 = y2-side;
            x4 = x1;
            y4 = y1-side;
        }else{
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println((int) x3+" "+(int)y3+" "+(int)x4+" "+(int)y4);

    }
}
