
package HomeWork.OneClass;
public class Circle implements Drawable, Colorable {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling color for the circle");
    }
}
