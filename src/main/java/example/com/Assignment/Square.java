package example.com.Assignment;

public class Square implements Quadrilateral {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;


    public Square(){

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public void Draw() {

        p1.printPoint();
        p2.printPoint();
        p3.printPoint();
        p4.printPoint();

    }
}
