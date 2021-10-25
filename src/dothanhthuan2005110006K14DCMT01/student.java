package dothanhthuan2005110006K14DCMT01;

public class student {

    string name; 
    int age;

    student (){};

    student(string n, int a){
        name = n;
        age = a;
    }
    
    void inThongTin(){
        System.out.println("name: "+
        name + "age: "+ age);
    }
}
