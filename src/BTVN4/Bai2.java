package BTVN4;
import java.util.Scanner;

public class Bai2 {
    public static void main(String arg[]){
        Scanner scan  =new Scanner(System.in);
        System.out.println(String.format("%1$25s %2$2s %3$2s %4$2s %5$2s ","THONG", "TIN","CAC","NHAN","VIEN"));
        System.out.println(String.format("%1$1s %2$10s %3$10s %4$10s %5$10s","Manv","Tennv","Tuoi","Diachi","BoPhan"));
        String b[] = new String[5];
        for(int i=0;i<5;i++){
            NhanVien a = new NhanVien();
            System.out.print("Nhap ten nhan vien :");
            a.setName(scan.nextLine());
            System.out.print("Nhap tuoi nhan vien :");
            a.setAge(Integer.parseInt(scan.nextLine()));
            System.out.print("Nhap dia chi nhan vien :");
            a.setAdd(scan.nextLine());
            System.out.print("Nhap bo phan nhan vien :");
            a.setBophan(scan.nextLine());
            b[i] = String.format("%1$1s %2$10s %3$10s %4$10s %5$10s",NhanVien.manv,a.getName(),a.getAge(),a.getAdd(),a.getBophan());
        }
        System.out.println(String.format("%1$25s %2$2s %3$2s %4$2s %5$2s ","THONG", "TIN","CAC","NHAN","VIEN"));
        System.out.println(String.format("%1$1s %2$10s %3$10s %4$10s %5$10s","Manv","Tennv","Tuoi","Diachi","BoPhan"));
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }
    }
}
