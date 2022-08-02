package BTVN4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String arg[]){
        PTbac2 a = new PTbac2();
        double x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap a = ");
        x = scan.nextDouble();
        System.out.print("Nhap b = ");
        y = scan.nextDouble();
        System.out.print("Nhap c = ");
        z = scan.nextDouble();
        a.nhap(x,y,z);
        a.xuat();
        a.tinh();
    }
}
