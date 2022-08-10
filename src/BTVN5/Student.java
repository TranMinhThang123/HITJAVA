package BTVN5;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String age;
    private Address add;
    public Student(){

    }
    public Student(String a,String b,String c,String d,String e,String f){
        id = a;
        name = b;
        age = c;
        add = new Address(d,e,f);
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = scanner.nextLine();
        System.out.print("Nhap name: ");
        name = scanner.nextLine();
        System.out.print("Nhap age: ");
        add = new Address();
        age = scanner.nextLine();
        add.input();
    }
    public String  getId(){
        return id;
    }
    public String getProvince(){
        return add.getPv();
    }
    public void changepv(String pv){
        add.changeProvince(pv);
    }
    public String[] getAll(){
        String a[] = new String[6];
        a[0] = id;
        a[1] = name;
        a[2] = age;
        a[3] = add.getId();
        a[4] = add.getDistrict();
        a[5] = add.getPv();
        return a;
    }
    public void output(){
        System.out.println(String.format("%1$1s %2$10s %3$10s %4$10s",id,name,age,add.output()));
    }
}
