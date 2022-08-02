package BTVN4;

public class Employee {
    String id;
    String name;
    int age;
    int workingDays;
    double salary;
    final int  PRICE = 50;
    Employee(){

    }
    Employee(String id,String name,int age,int workingDays){
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int getWorkingDays() {
        return workingDays;
    }
    public int getSalary(){
        return workingDays*PRICE;
    }
    public void input(String id,String name,int age,int workingDays){
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    public void output(){
        System.out.println("ID :"+this.id);
        System.out.println("Name :"+this.name);
        System.out.println("Age :"+this.age);
        System.out.println("Working Days :"+this.workingDays);
        System.out.println("Salary :"+this.getSalary());
    }
}
