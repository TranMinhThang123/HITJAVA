package BTVN6;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> listCanBo = new ArrayList<CanBo>();
    private static ArrayList<Integer> listId = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    private boolean check(ArrayList<Integer> listId,int id){
        for(Integer i:listId){
            if (id==i){
                return false;
            }
        }
        return true;
    }
    public void addCanBo(){
        CanBo a = new CanBo();
        System.out.println("Nhap thong tin can bo");
        System.out.print("Nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        if(check(listId,id)){
            System.out.print("Nhap ho va ten: ");
            String name = scanner.nextLine();
            System.out.print("Nhap nam sinh: ");
            String nam = scanner.nextLine();
            System.out.print("Nhap gioi tinh: ");
            String sex = scanner.nextLine();
            System.out.print("Nhap dia chi: ");
            String add = scanner.nextLine();
            a.input(id,name,nam,sex,add);
            QLCB.listId.add(a.getId());
            listCanBo.add(a);
        }else{
            System.out.println("ID khong hop le");
        }
    }
    public void show(){
        System.out.println(String.format("%1$1s %2$30s %3$30s %4$30s %5$30s","ID","Ho va ten","Nam sinh","Gioi tinh","Dia chi"));
        for(CanBo i:listCanBo){
            i.output();
        }
    }
    public void delete(int id){
        for(int i=0;i<listCanBo.size();i++){
            if(listCanBo.get(i).getId() == id){
                listCanBo.remove(i);
            }
        }
    }
    public void find(int id){
        for(int i=0;i<listCanBo.size();i++){
            if(listCanBo.get(i).getId() == id){
                listCanBo.get(i).output();
            }
        }
    }
}
