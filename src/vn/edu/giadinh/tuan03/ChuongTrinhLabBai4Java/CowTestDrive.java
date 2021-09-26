package vn.edu.giadinh.tuan03.ChuongTrinhLabBai4Java;

public class CowTestDrive {
    public static void main(String[] args) {
        cow cow;
        // cow = new Cow();
        cow = new cow(15);
        System.out.println(" weight: " + cow.weight);


        cow = new cow(5);
        System.out.println("weight: " + cow.weight);

        cow = new  cow(25.5, "tây Ban Nha ", "đen");

        System.out.println(" weight: " + cow.wight + " breed " + cow.breed
            + " color" + cow.color);


            // cow.weight


        
    }
    
}
