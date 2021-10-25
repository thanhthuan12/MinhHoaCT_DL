package dothanhthuan2005110006K14DCMT01.KiemTraGiuaKy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.InputMap;


public class apple {

    int id;
    float weight;
    String color;
    Scanner sc = new Scanner(System.in);
    static List<apple> apple = new ArrayList<>();
    public apple(int id; float weight, string color){
        id = id;
        weight = weight;
        color = color;

    }
    apple()
    {

    }
    public void Menu(){
        System.out.println(">>>>>>>>>>MENU<<<<<<<<<<");
        System.out.println(" tạo kho chứa apple ");
        System.out.println(" thêm apple vào kho ");
        System.out.println(" tìm apple theo màu sắc ");
        System.out.println(" in danh sách apple ");
        System.out.println(">>>>>>>>>>EXIT<<<<<<<<<<");

    }

    public Input(){

        System.out.println( "nhập id apple: ");
        System.out.println( "nhập weight apple");
        System.out.println( "nhập màu apple");
    }
    public viod displayapple(){

        System.out.println("apple");
        System.out.println("id apple","weight apple","color apple");
    }

    public void display(){
        for (apple : apple) {
            apple.displayapple();
                System.out.println(id,weight,color);
        }

    }
    public void addapple(){ 
        

        

    }


    
    
}
