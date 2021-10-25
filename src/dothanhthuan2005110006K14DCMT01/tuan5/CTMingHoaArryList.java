package dothanhthuan2005110006K14DCMT01.tuan5;

import java.util.ArrayList;

public class CTMingHoaArryList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add ("thuận");
        a.add (true);
        a.add (1);
        a.add (2.5);
        Integer x = (Integer)a.get(2);
        for(Object object: a){
            System.out.println(a);
            
        }
    }
}
