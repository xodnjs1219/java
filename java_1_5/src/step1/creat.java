package step1;
class Book{
    String title;
    int price;
    int num;
    Book(){
        title = "�ڹ��� ����";
        price = 10000;
    }
    Book(String title1, int price1){
        title = title1;
        price = price1;
    }

    void print(){
        System.out.println("å����:"+title);
        System.out.println("����:"+price);
        System.out.println("�ֹ�����:"+num);
    }
}

public class creat {
    public static void main(String[] args) {
    Book book1 = new Book();
    book1.num = 2;
    book1.print();

    Book book2 = new Book("�ȳ�", 15000);
    book2.num = 3;
    book2.print();
    }
}
