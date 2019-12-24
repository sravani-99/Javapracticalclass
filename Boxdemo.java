class Box {
double width;
double height;
double depth;
double vol;
public double volume()
{
    vol=width*height*depth;
    return vol;
}
}
public class Boxdemo {
    public static void main(String[] args){
        Box b = new Box();
        b.height=10;
        b.width = 20;
        b.depth = 30;
        double b2=b.volume();
        System.out.println(b2);
    }
}