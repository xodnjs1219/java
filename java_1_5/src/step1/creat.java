package step1;
class Book{
    String title;
    int price;
    int num;
    Book(){
        title = "자바의 정석";
        price = 10000;
    }
    Book(String title1, int price1){
        title = title1;
        price = price1;
    }

    void print(){
        System.out.println("책제목:"+title);
        System.out.println("가격:"+price);
        System.out.println("주문수량:"+num);
    }
}

public class creat {
    public static void main(String[] args) {
    Book book1 = new Book();
    book1.num = 2;
    book1.print();

    Book book2 = new Book("안녕", 15000);
    book2.num = 3;
    book2.print();
    }
}
