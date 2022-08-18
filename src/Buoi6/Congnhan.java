package Buoi6;

public class Congnhan extends CanBo{
    private String Bac;

    public void input(int id, String hoten, String namsinh, String gioitinh, String Diachi,String Bac) {
        super.input(id, hoten, namsinh, gioitinh, Diachi);
        this.Bac = Bac;
    }
    public void output(){
        super.output();
        System.out.print(String.format("%1$10s",Bac));
    }
}
