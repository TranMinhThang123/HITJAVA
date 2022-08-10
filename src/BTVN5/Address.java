package BTVN5;

import java.util.Scanner;

public class Address {
    private String id;
    private String district;
    private String province;
    public Address(){

    }
    public Address(String a,String b,String c){
        id = a;
        district = b;
        province = c;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id address: ");
        id = scanner.nextLine();
        System.out.print("Nhap district: ");
        district = scanner.nextLine();
        System.out.print("Nhap province: ");
        province = scanner.nextLine();
    }
    public String getId(){
        return id;
    }
    public String getDistrict(){
        return district;
    }
    public String getPv(){
        return province;
    }
    public void changeProvince(String pv){
        this.province = pv;
    }
    public String output(){
        return (String.format("%1$1s %2$10s %3$10s",id,district,province));
    }
}
