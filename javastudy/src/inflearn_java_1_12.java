////Ŭ���� ����
//class npc{
//    //�������
//    String name;
//    int hp;
//    //�޼���
//    void say(){
//        System.out.print("�ȳ��ϼ���");
//    }
//}
//
//public class inflearn_java_1 {
//    public static void main(String[] args){
//        npc saram1 = new npc(); //��ü ���� saram1�̶�� ��ü������ �ּҰ� ���
//        saram1.name = "���";
//        saram1.hp = 100;
//        System.out.println(saram1.name+":"+saram1.hp);
//        saram1.say();
//    }
//}

////Ŭ������ �޼��常 �ִ� ���
//class calc{
//    int add(int a, int b){
//        return a+b;
//    }
//}
//public class inflearn_java_1 {
//    public static void main(String[] args){
//        calc calc = new calc(); //��ü����
//        int add = calc.add(3, 9); //�޼��� ȣ��
//
//        System.out.println(add);
//    }
//}

//Ŭ������ ������ �ִ°��
class Book{
    String title;
    System author;
    int price;
}
public class inflearn_java_1_12 {
    public static void main(String[] args) {
    Book book = new Book(); //��ü����
    book.title = "�ڹ��� ����";
    book.author= "���¿�";
    book.price = 10000; //��������� ���� ����
    }
}