class Calc{
    int add(int a,int b){
        return a+b;
    }

    int add(int a){
        return a+a;
    }

    double add(double a, double b){
        return a+b;
    } //overloading
}
public class overload {
    public static void main(String[] args){
        Calc calc=new Calc();
        System.out.println(calc.add(5));
        System.out.println(calc.add(5,3));
        System.out.println(calc.add(5.5, 6.2));
    }
}
