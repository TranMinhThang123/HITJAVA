package BTVN6;

public class CanBo {
    private int id;
    private String hoten;
    private String namsinh;
    private String gioitinh;
    private String Diachi;
    public CanBo(){

    }
   public int getId(){
        return id;
    }
    public void input(int id,String hoten,String namsinh,String gioitinh,String Diachi){
            this.id = id;
            this.hoten = hoten;
            this.namsinh = namsinh;
            this.gioitinh = gioitinh;
            this.Diachi = Diachi;

    }
    public void output(){
        System.out.println(String.format("%1$1s %2$30s %3$30s %4$30s %5$30s",String.valueOf(id),hoten,namsinh,gioitinh,Diachi));
    }
}
