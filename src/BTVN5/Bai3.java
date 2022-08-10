package BTVN5;

public class Bai3 {
    public static Boolean isPrime(int n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>=2;
    }
    public static Boolean isPrime(long n){
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return n>=2;
    }
    public static Boolean isPrime(float n){
        return false;
    }
    public static Boolean isPrime(double n){
        return false;
    }
}
