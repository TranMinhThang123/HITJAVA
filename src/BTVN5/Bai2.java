package BTVN5;

import java.util.Scanner;

public class Bai2 {
    public static Student[] xoa(Student s[],int n,int i){
        for(int k=i;i<n-1;i++){
            String a[] = s[i+1].getAll();
            s[i] = new Student(a[0],a[1],a[2],a[3],a[4],a[5]);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        int n = Integer.parseInt(scan.nextLine());
        Student s[] = new Student[n];
        for (int i=0;i<n;i++) {
            s[i] = new Student();
            s[i].input();
        }
        for (int i=0;i<n;i++) {
            s[i].output();
        }
        System.out.println("Nhap id can tim: ");
        String id = scan.nextLine();
        for (int i=0;i<n;i++) {
            if (s[i].getId().compareTo(id) == 0) {
                s[i].output();
            }
        }
        for (int i=0;i<n;i++) {
            if (s[i].getProvince().compareTo("Thanh Hoa")==0) {
                s[i].changepv("Hai Phong");
            }
        }
        System.out.println("Nhap id can xoa: ");
        String xoa = scan.nextLine();
        for (int i=0;i<n;i++) {
            if(s[i].getId().compareTo(xoa)==0){
                xoa(s,n,i);
                n--;
            }
        }
        System.out.println("Sau khi xoa");
        for (int i=0;i<n;i++) {
            s[i].output();
        }
    }
}
