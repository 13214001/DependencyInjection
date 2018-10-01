package example.com.Assignment;

public class Point {


    private String x;
    private String y;

    public Point(){

    }

    

    public void setX(String x) {
        this.x = x;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

	public void printPoint() {
		// TODO Auto-generated method stub
		System.out.println(x+" "+y);
	}
}
