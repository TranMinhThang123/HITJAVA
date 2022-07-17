import java.util.Scanner;

public class Bai3 {
    public static void main(String arg[]){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int sum = n+1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i*i==n){
                    sum+=i;
                }else{
                    sum+=i+n/i;
                }
            }
        }
        System.out.println("Sum = "+sum);
    }
}
