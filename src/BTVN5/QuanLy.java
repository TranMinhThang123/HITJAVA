package BTVN5;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;
    public QuanLy(){

    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap ma quan ly: ");
        this.maQL = scanner.nextLine();
    }
    public void display(){
        System.out.println("Ma quan ly: "+maQL);
        System.out.println("Ho ten: "+hoTen);
    }
}
