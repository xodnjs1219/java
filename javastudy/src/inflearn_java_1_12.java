////클래스 정의
//class npc{
//    //멤버변수
//    String name;
//    int hp;
//    //메서드
//    void say(){
//        System.out.print("안녕하세요");
//    }
//}
//
//public class inflearn_java_1 {
//    public static void main(String[] args){
//        npc saram1 = new npc(); //객체 생성 saram1이라는 객체변수에 주소가 담김
//        saram1.name = "경비";
//        saram1.hp = 100;
//        System.out.println(saram1.name+":"+saram1.hp);
//        saram1.say();
//    }
//}

////클래스에 메서드만 있는 경우
//class calc{
//    int add(int a, int b){
//        return a+b;
//    }
//}
//public class inflearn_java_1 {
//    public static void main(String[] args){
//        calc calc = new calc(); //객체생성
//        int add = calc.add(3, 9); //메서드 호출
//
//        System.out.println(add);
//    }
//}

//클래스에 변수만 있는경우
class Book{
    String title;
    System author;
    int price;
}
public class inflearn_java_1_12 {
    public static void main(String[] args) {
    Book book = new Book(); //객체생성
    book.title = "자바의 정석";
    book.author= "김태원";
    book.price = 10000; //멤버변수에 값을 저장
    }
}