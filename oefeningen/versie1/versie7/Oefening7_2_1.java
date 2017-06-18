

package oefeningen.versie1.versie7;

public class Oefening7_2_1 {
    private int x = 0;
    private int y = 0;
    private int myPointX = 0;
    private int myPointY = 0;

    public Oefening7_2_1() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMyPointX() {
        return myPointX;
    }

    public void setMyPointX() {
        this.myPointX = myPointX;
    }

    public int getMyPointY() {
        return myPointY;
    }

    public void setMyPointY() {
        this.myPointY = myPointY;
    }

    public Oefening7_2_1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "X value: " + x + "\nY value: " + y;
    }
    public void distance(int x, int y) {

        x = this.x - x;
        if(x < 0) {
           x = Math.abs(x);
        }
        y = this.y - y;
        if(y < 0) {
            y = Math.abs(y);
        }

        System.out.println("X value distance: " + this.x + "\nY value distance: " + this.y);
    }

    public void distanceOverload(int x, int y, int myPointX, int myPointY) {
        this.x = x;
        this.y = y;
        this.myPointX = myPointX;
        this.myPointY = myPointY;

        int distanceX = x - myPointX;
        if(distanceX < 0) {
            distanceX = Math.abs(distanceX);
        }
        int distanceY = y - myPointY;
        if(distanceY < 0) {
            distanceY = Math.abs(distanceY);
        }

        int totalDistance = distanceX - distanceY;
        if(totalDistance < 0) {
            totalDistance = Math.abs(totalDistance);
        }
        System.out.println("distanceX: " + distanceX +
                "\ndistanceY: " + distanceY + "\ntotalDistance " + totalDistance);
    }


}