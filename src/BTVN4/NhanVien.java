package BTVN4;

public class NhanVien {
    static int manv;
    private int age;
    private String name;
    private String Add;
    private String Bophan;
    NhanVien(){
        manv+=1;
    }
    NhanVien(String name,int age,String add,String bophan){
        manv+=1;
        this.name = name;
        this.age = age;
        this.Add = add;
        this.Bophan = bophan;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setAdd(String add) {
        this.Add = add;
    }

    public String getAdd() {
        return Add;
    }

    public void setBophan(String bophan) {
        Bophan = bophan;
    }

    public String getBophan() {
        return Bophan;
    }
}
