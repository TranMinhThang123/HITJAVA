package BTVN3;

import java.util.Scanner;

public class Bai2 {
    static String removeDigit(String s){
        String result = "";
        for(int j = 0;j<s.length();j++){
            if(!Character.isDigit((s.charAt(j)))){
                result+=s.charAt(j);
            }
        }
        return result;
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        s = s.replaceAll("\\s+"," ");
        System.out.println(s);
        String s1[] = removeDigit(s).trim().split(" ");
        for(int i=0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
        String result = "";
        for(int i = 0;i<s1.length;i++){
            result += s1[i].substring(0,1).toUpperCase()+s1[i].substring(1, s1[i].length()).toLowerCase()+" ";
        }
        System.out.println(result);
    }
}
