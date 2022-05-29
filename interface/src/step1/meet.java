package step1;

interface Greet{
    void greet();
}

interface bye{
    void bye();
}

class morning implements Greet,bye {
    public void bye() {
        System.out.println("안녕히 계세요");
    }

    public void greet(){
        System.out.println("안녕하세요");
    }
}
public class meet {
    public static void  main(String[] args){
        morning morning = new morning();
        morning.greet();
    }
}
