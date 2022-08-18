package Buoi6;

import java.util.Scanner;

public class Phuongtien {
    private String tenchuxe;
    private String loaixe;
    private float dungtich;
    private float trigia;
    private float thue;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        this.tenchuxe = scanner.nextLine();
        System.out.print("Nhap loai xe: ");
        this.loaixe = scanner.nextLine();
        System.out.print("Nhap dung tich xe: ");
        this.dungtich = scanner.nextFloat();
        System.out.print("Nhap tri gia xe: ");
        this.trigia = scanner.nextFloat();
        if(dungtich<100){
            thue = trigia/100*2;
        }else if(dungtich>=100&&dungtich<=200){
            thue = trigia*6/100;
        }else {
            thue = trigia/10;
        }
    }
    public float getTrigia(){
        return trigia;
    }

    public float getThue() {
        return thue;
    }

    public void output(){
        System.out.println(String.format("%1$1s %2$10s %3$10s %4$10s %5$10s",tenchuxe,loaixe,dungtich,trigia,thue));
    }
}
