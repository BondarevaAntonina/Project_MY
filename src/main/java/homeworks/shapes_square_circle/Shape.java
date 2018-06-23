package homeworks.shapes_square_circle;

/**
 * Please create an abstarct class Shape and two subclasses Square and Circle. Replace code in method drawShape()
 * according to principles of polymorphism. Please propose the other solutions for improving quality of the code.
 */

public abstract class Shape {

    private ShareType shareType;

    //other fields


    public Shape(ShareType shareType) {
        this.shareType = shareType;
    }

    public ShareType getShareType() {
        return shareType;
    }

    public void drawSquare() {
        //Code for drawing square
    }

    public void drawCircle() {
        //Code for drawing square
    }

    public void drawShape() {
        if (getShareType() == ShareType.SQUARE) {
            drawSquare();
        } else {
            drawCircle();
        }
    }

}
