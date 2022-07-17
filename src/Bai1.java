import java.util.Scanner;

public class Bai1 {
    public static void main(String arg[]){
        int date,month;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ngay sinh:");
        date = scan.nextInt();
        System.out.print("Nhap thang sinh:");
        month = scan.nextInt();
        switch (month){
            case 1:
                if(date>=1 && date<=19){
                    System.out.println("Ma Ket");
                }else{
                    System.out.println("Bao Binh");
                }
                break;
            case 2:
                if(date>=1 && date<=18 ){
                    System.out.println("Bao Binh");
                }else{
                    System.out.println("Song ngu");
                }
                break;
            case 3:
                if(date>=1 && date<=20){
                    System.out.println("Song ngu");
                }else{
                    System.out.println("Bach duong");
                }
                break;
            case 4:
                if(date>=1 && date<=20){
                    System.out.println("Bach duong");
                }else{
                    System.out.println("Kim nguu");
                }
                break;
            case 5:
                if(date>=1 && date<=20){
                    System.out.println("Kim nguu");
                }else{
                    System.out.println("Song tu");
                }
                break;
            case 6:
                if(date>=1 && date<=21){
                    System.out.println("Song tu");
                }else{
                    System.out.println("Cu giai");
                }
                break;
            case 7:
                if(date>=1 && date<=22){
                    System.out.println("Cu giai");
                }else{
                    System.out.println("Su tu");
                }
                break;
            case 8:
                if(date>=1 && date<=22){
                    System.out.println("Su tu");
                }else{
                    System.out.println("Xu nu");
                }
                break;
            case 9:
                if(date>=1 && date<=22){
                    System.out.println("Xu nu");
                }else{
                    System.out.println("Thien binh");
                }
                break;
            case 10:
                if(date>=1 && date<=23){
                    System.out.println("Thien binh");
                }else{
                    System.out.println("Bo cap");
                }
                break;
            case 11:
                if(date>=1 && date<=22){
                    System.out.println("Bo cap");
                }else{
                    System.out.println("Nhan ma");
                }
                break;
            case 12:
                if(date>=1 && date<=21){
                    System.out.println("Nhan Ma");
                }else{
                    System.out.println("Ma ket");
                }
                break;
            default:
                System.out.println("Ngay thang khong phu hop");
        }
    }
}
