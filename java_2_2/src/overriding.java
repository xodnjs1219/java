class Animal{
    String name;
    int age;

    void printpet(){
        System.out.println("�̸�"+name);
        System.out.println("����"+age);
    }
}

class dog extends Animal{
    String variety;

    void printpet(){
        super.printpet();
        System.out.println("����"+variety);
    }
}
public class overriding {
    public static void main(String[] args){
        dog dog = new dog();
        dog.name="����";
        dog.age=5;
        dog.variety="�����ݸ�";

        dog.printpet();
    }
}
