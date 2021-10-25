package dothanhthuan2005110006K14DCMT01.tuan5;

public class Ctminhhoa {
    public static void main(String[] args){
    int[]arr = {3 , 5 , 7 , 9};

    int newElement = 8;

    int n = arr.length;

    int []newarr = new int[n + 1];

    for(int i = 0; i < n; i++){
        newarr[i] = arr[i];
    }

    System.out.println("In mảng cũ");

    for (int x : arr) {
        System.out.println(x);
    }

    newarr[n] = newElement;
    System.out.println("In mảng mới");
    for (int x : newarr) {
        System.out.println(x);
    }
    



    }

    
        
    
    
}
