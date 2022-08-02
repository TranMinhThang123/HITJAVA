package BTVN4;

public class HinhChuNhat {
    private double chieudai;
    private double chieurong;
    public void input(double cd,double cr){
        this.chieudai = cd;
        this.chieurong = cr;
    }
    public double dientich(){
        return chieurong*chieudai;
    }
    public double chuvi(){
        return 2*(chieudai+chieurong);
    }
    public void setChieurong(double cr){
        this.chieurong = cr;
    }
    public void setChieudai(double cd){
        this.chieudai = cd;
    }
    public double getChieudai(){
        return this.chieudai;
    }
    public double getChieurong(){
        return this.chieurong;
    }
}
