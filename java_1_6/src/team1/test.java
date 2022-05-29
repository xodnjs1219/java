package team1;

import team2.java2;

public class test {
    public int num1;
    private int num2;
    protected int num3;
    int num4;

    public void test1(){System.out.println("test1");}
    private void test2(){System.out.println("test2");}
    protected void test3(){System.out.println("test3");}
    void test4(){System.out.println("test4");}

    public static void main(String[] args){
        test at = new test();
        at.num1 = 1;
        at.num2 = 2;
        at.num3 = 3;
        at.num4 = 4;

        java ac1 = new java();
        ac1.num1 = 1;
        //ac1.num2 = 2; //private이라 접근 불가능
        ac1.num3 = 3;
        ac1.num4 = 4;

        java2 ac2= new java2();
        ac2.num1 = 1;
//      ac2.num2 = 2;
//      ac2.num3 = 3;
//      ac2.num4 = 4;
    }
}
