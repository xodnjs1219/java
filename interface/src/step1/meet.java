package step1;

interface Greet{
    void greet();
}

interface bye{
    void bye();
}

class morning implements Greet,bye {
    public void bye() {
        System.out.println("�ȳ��� �輼��");
    }

    public void greet(){
        System.out.println("�ȳ��ϼ���");
    }
}
public class meet {
    public static void  main(String[] args){
        morning morning = new morning();
        morning.greet();
    }
}
