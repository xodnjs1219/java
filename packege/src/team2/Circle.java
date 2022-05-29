package team2;

public class Circle {
    final double pi = 3.14;
    double rad;

    public void setRad(double r){
        rad = r;
    }

    public double premiter(){
        return rad*2*pi;
    }
}
