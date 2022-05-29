abstract class Animal{
    int age;
    abstract void cry();
}

class Dog extends Animal{
    void cry(){
        System.out.println("¸Û");

    }
}

class Cat extends Animal{
    void cry(){
        System.out.println("³É");

    }
}

public class abstracttest {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.cry();
    }
}
