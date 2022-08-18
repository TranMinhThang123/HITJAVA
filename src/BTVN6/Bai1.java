package BTVN6;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        QLCB a = new QLCB();
        Scanner scanner = new Scanner(System.in);
        int n;
        a:
            while(true) {
                System.out.println("Nhap lua chon:");
                System.out.println("1: Add 1 cán bộ vào List ");
                System.out.println("2: Hiển thị danh sách các cán bộ");
                System.out.println("3: Xóa 1 cán bộ theo id");
                System.out.println("4: Tìm kiếm 1 cán bộ theo id");
                System.out.println("5: Dừng chương trình");
                n = scanner.nextInt();
                switch (n){
                    case 1:
                        a.addCanBo();
                        break;
                    case 2:
                        a.show();
                        break;
                    case 3:
                        System.out.println("Nhap ID can xoa: ");
                        int id = scanner.nextInt();
                        a.delete(id);
                        break;
                    case 4:
                        System.out.print("Nhap ID can tim: ");
                        int id2 = scanner.nextInt();
                        a.find(id2);
                        break;
                    case 5:
                        break a;
                }
        }
    }
}
