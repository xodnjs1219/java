package team;

public class Circle {
    final double pi = 3.14;
    double rad;

    public void setRad(double r){
        rad = r;
    }

    public double getarea(){
        return rad*rad*pi;
    }
}
