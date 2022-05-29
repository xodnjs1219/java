class Animal{
    String name;
    int age;

    void printpet(){
        System.out.println("이름"+name);
        System.out.println("나이"+age);
    }
}

class dog extends Animal{
    String variety;

    void printpet(){
        super.printpet();
        System.out.println("종류"+variety);
    }
}
public class overriding {
    public static void main(String[] args){
        dog dog = new dog();
        dog.name="순심";
        dog.age=5;
        dog.variety="보더콜리";

        dog.printpet();
    }
}
