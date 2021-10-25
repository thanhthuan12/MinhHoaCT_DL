package dothanhthuan2005110006K14DCMT01.tuan5;



public class QLSV {
    public static void main(String[] args) {
        
    
     ArrayList = new ArrayList <> ();

    private String hoTen;
    riêng Double diemTB;

    menu  () {
        System.out.println ("1 >> Nhập danh sách sinh viên.");
        System.out.println ("2 >> xuat danh sách sinh viên đã nhập.");
        System.out.println ("3 >> xuat danh sách sinh viên theo khoảng điểm.");
        System.out.println ("4 >> Tìm sinh viên theo họ tên.");
        System.out.println ("5 >> Tìm và sửa sinh viên theo tên của họ.");
        System.out.println ("6 >> Tìm và xóa sinh viên theo tên của họ");
        System.out.println ("7 >> thoat.");

    }
    public void nhap () {
        Đầu vào máy quét = Máy quét mới (System.in);
        System.out.print ("Nhập họ và tên:");
        hoTen = input.nextLine ();
        list.add (hoTen);
        System.out.println ("Nhập điểm trung bình:");
        diemTB = input.nextDouble ();
        input.nextLine ();
        list.add (diemTB);
    }
    public void xuat () {
        System.out.println (">>>>>>>>>> DANH SÁCH SINH VIÊN <<<<<<<<<<");
        System.out.println ("");
       for (Đối tượng đối tượng: danh sách) {
        System.out.println ("Họ và tên:" + hoTen);
        System.out.println ("Điểm trung bình:" + diemTB);
           
       }
    }
}
    
}
