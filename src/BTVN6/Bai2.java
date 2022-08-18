package BTVN6;

import java.util.*;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap so phuong tien: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Phuongtien> a = new ArrayList<Phuongtien>();
        for(int i=0;i<n;i++){
            Phuongtien pt = new Phuongtien();
            pt.input();
            a.add(pt);
        }
        aa:
        while (true){
            int o = scanner.nextInt();
            switch (o){
                case 1:
                    System.out.println("Bang ke khai ban dau");
                    for(int i=0;i<a.size();i++){
                        a.get(i).output();
                    }
                    break;
                case 2:
                    Collections.sort(a, new Comparator<Phuongtien>() {
                        @Override
                        public int compare(Phuongtien o1, Phuongtien o2) {
                            return o1.getThue()>o2.getThue()?-1:1;
                        }
                    });
                    System.out.println("Bang ke khai sau khi sap xep tien thue giam dan");
                    for(int i=0;i<a.size();i++){
                        a.get(i).output();
                    }
                    break;
                case 3:
                    Collections.sort(a, new Comparator<Phuongtien>() {
                        @Override
                        public int compare(Phuongtien o1, Phuongtien o2) {
                            return o1.getThue()<o2.getThue()?-1:1;
                        }
                    });
                    System.out.println("Bang ke khai sau khi sap xep tri gia thue tang dan");
                    for(int i=0;i<a.size();i++){
                        a.get(i).output();
                    }
                    break;
                case 4:
                    break aa;
            }
        }
    }
}
