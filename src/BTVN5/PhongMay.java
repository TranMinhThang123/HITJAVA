package BTVN5;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x;
    private May y;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        this.maPhong = scanner.nextLine();
        System.out.print("Nhap ten phong: ");
        this.tenPhong = scanner.nextLine();
        System.out.print("Nhap dien tich: ");
        this.dienTich = scanner.nextInt();
        this.x = new QuanLy();
        this.y = new May();
        x.input();
        y.input();
    }
    public void display(){
        System.out.println("Ma phong :"+maPhong);
        System.out.println("Ten phong :"+tenPhong);
        System.out.println("Dien tich :"+dienTich);
        x.display();
        y.display();
    }
}
