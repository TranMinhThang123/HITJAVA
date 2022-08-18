package Buoi6;

public class Kysu extends CanBo{
    private String nganhDaoTao;

    public void input(int id, String hoten, String namsinh, String gioitinh, String Diachi,String nganhDaoTao) {
        super.input(id, hoten, namsinh, gioitinh, Diachi);
        this.nganhDaoTao = nganhDaoTao;
    }
    public void output(){
        super.output();
        System.out.print(String.format("%1$10s",nganhDaoTao));
    }
}
