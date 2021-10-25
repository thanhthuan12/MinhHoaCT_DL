package dothanhthuan2005110006K14DCMT01;

public class Dog {
    string name;
    int size;
    string color;
    public Dog(){}
    public Dog(int s){
        size = s;
    }
    public Dog(int s, string c){
        size = s;
        color = c;
    }
    void inThongTin(){
        System.out.println("size = " + size + " " +"color = " + color);
    }


    
}
