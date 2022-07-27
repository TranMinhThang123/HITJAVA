package BTVN2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String arg[]){
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a = ");
        a = scan.nextInt();
        System.out.print("Nhap b = ");
        b = scan.nextInt();
        System.out.print("Nhap c = ");
        c = scan.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
                if(a==b||b==c||c==a){
                    System.out.println("Tam giac vuong can");
                }else{
                    System.out.println("Tam giac vuong");
                }
            }
        else{
                if(a==b&&b==c){
                    System.out.println("Tam giac deu");
                }else if(a==b||b==c||c==a){
                    System.out.println("Tam giac can");
                }else{
                    System.out.println("Tam giac thuong");
                }
            }
        }else{
            System.out.println("a,b,c khong phai 3 canh 1 tam giac ");
        }
    }
}
