package BTVN3;

import java.util.Scanner;

public class Bai1 {
    static int snn(int a[],int n){
        int nn = a[0];
        for(int i=1;i<n;i++){
            if(nn>a[i]){
                nn = a[i];
            }
        }
        return nn;
    }
    static void kiemtra(int a[],int n){
        for(int i=0;i<n;i++){
            if((float)Math.sqrt(a[i])==(int)Math.sqrt(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
    static boolean isPrime(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return a>=2;
    }
    static void snt(int a[],int n){
        for(int i=0;i<n;i++){
            if(isPrime(a[i])){
                System.out.print(a[i]+" ");
            }
        }
    }
    static int[] sapxep(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0&&i%2==0){
                sum+=a[i];
            }
        }
        System.out.println("Tong cac so le o vi tri chan la "+sum);
        int sonhonhat = snn(a,n);
        System.out.println("Vi tri cac so nho nhat la ");
        for(int i=0;i<n;i++){
            if(a[i] == sonhonhat){
                System.out.print(i+" ");
            }
        }
        System.out.print("\n");
        System.out.println("Cac so chinh phuong trong mang la");
        kiemtra(a,n);
        System.out.print("\n");
        System.out.println("Cac so nguyen to trong mang la");
        snt(a,n);
        System.out.print("\n");
        int b[] = sapxep(a,n);
        System.out.println("Mang sau khi sap xep la");
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
