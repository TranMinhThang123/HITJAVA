package BTVN4;

public class PTbac2 {
    private double a;
    private double b;
    private double c;
    public void nhap(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void xuat(){
        System.out.println(String.format("%sx^2+%sx+%s",String.valueOf(a),String.valueOf(b),String.valueOf(c)));
    }
    public void tinh(){
        if(a!=0){
            double delta = b*b-4*a*c;
            if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem phan biet ");
                System.out.println("x1 = "+(-b+Math.sqrt(delta))/(2*a));
                System.out.println("x1 = "+(-b-Math.sqrt(delta))/(2*a));
            } else if (delta<0) {
                System.out.println("Phuong trinh vo nghiem");
            }else {
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+-b/(2*a));
            }
        }else{
            if(b!=0){
                System.out.println("Phuong trinh co nghiem x = "+-c/b);
            }else if(b==0)
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }else{
                    System.out.println("Phuong trinh vo nghiem ");
                }
        }
    }
}
