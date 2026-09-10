package Lec08.rectangle;

public class rectangle {
private double length;
private double width ; 
    public rectangle (double length, double width ){
    this.length= length;
    this.width= width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width );
    }
    public void displayInfo(){
        System.out.println(length + " - " + width + " - ");
    }

}
