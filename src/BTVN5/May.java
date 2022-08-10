package BTVN5;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    public May(){

    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma may: ");
        this.maMay = scanner.nextLine();
        System.out.print("Nhap kieu may: ");
        this.kieuMay = scanner.nextLine();
        System.out.print("Nhap tinh trang: ");
        this.tinhTrang = scanner.nextLine();
    }
    public void display(){
        System.out.println("Ma may: "+maMay);
        System.out.println("Kieu may: "+kieuMay);
        System.out.println("Tinh trang: "+tinhTrang);
    }
}
