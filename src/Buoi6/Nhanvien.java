package Buoi6;

public class Nhanvien extends CanBo{
    private String Congviec;
    public void input(int id, String hoten, String namsinh, String gioitinh, String Diachi,String Congviec) {
        super.input(id, hoten, namsinh, gioitinh, Diachi);
        this.Congviec = Congviec;
    }
    public void output(){
        super.output();
        System.out.print(String.format("%1$10s",Congviec));
    }
}
