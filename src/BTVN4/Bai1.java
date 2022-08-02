package BTVN4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String arg[]){
        HinhChuNhat a = new HinhChuNhat();
        HinhChuNhat b = new HinhChuNhat();
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap chieu dai va chieu rong cua a:");
        a.input(scan.nextDouble(),scan.nextDouble());
        System.out.println("Nhap chieu dai cua b :");
        b.setChieudai(scan.nextDouble());
        System.out.println("Nhap chieu rong cua b :");
        b.setChieurong(scan.nextDouble());
        System.out.println("Chieu dai chua a = "+a.getChieudai());
        System.out.println("Chieu rong cua a = "+a.getChieurong());
        System.out.println("Dien tich cua a = "+a.dientich());
        System.out.println("Chu vi cua a = "+a.chuvi());
        System.out.println("Chieu dai cua b = "+b.getChieudai());
        System.out.println("Chieu rong cua b = "+b.getChieurong());
        System.out.println("Dien tich cua b = "+b.dientich());
        System.out.println("Chu vi cua b = "+b.chuvi());
        if(a.dientich()>b.dientich()){
            System.out.println("A co dien tich lon hon");
        }else {
            System.out.println("B co dien tich lon hon");
        }
    }
}
