package dothanhthuan2005110006K14DCMT01.tuan5;

java.util.Date ;
java.util.Scanner ;

 lớp  công cộng CrockerySet {

    int id;
    Tên chuỗi ;
    giá thả nổi ;
    Ngày tháng năm;

    CrockerySet tiếp theo;

    CrockerySet () {}

    CrockerySet ( int  _id , String  _name , float  _price , Date  _date ) {
        id = _id;
        tên = _name;
        price = _price;
        date = _date;
    }

    public  void  inThongTin () {
        Hệ thống . ra ngoài . println ( " Hàng hoá: CrockerySet " + " . Tên sản phẩm: " + tên + " . ID: " + id + " . Giá: " + giá + " . Ngày nhập: " + ngày);
    }

    public  void  nhapThongTin ( Đầu vào máy quét  ) {
        đầu vào . hàng tiếp theo();
        Hệ thống . ra ngoài . print ( " Nhập tên sản phẩm: " );
        tên = đầu vào . hàng tiếp theo();
        Hệ thống . ra ngoài . print ( " Nhập vào sản phẩm: " );
        giá cả = đầu vào . nextFloat ();
        date =  new  Date ();

    }

    public  String  GetName () {
        Hệ thống . ra ngoài . println (tên);
        trả lại tên;
    }


}
