package ss6.bai_tap.Moveable_point;

public class MoveablePoint extends Point{
    private float xspeed =  0.0f ;
    private float yspeed = 0.0f ;

    public MoveablePoint() {

    }

    public MoveablePoint(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MoveablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed ;
    }
    public float[] getSpeed() {
        float[] array = {xspeed,yspeed} ;
        return array ;
    }

    public MoveablePoint move() {
        this.setX(this.getX() + xspeed);
        this.setY(this.getY() + yspeed) ;
        return this ;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xspeed=" + xspeed +
                ", yspeed=" + yspeed +" "
                + super.toString() +
                '}';
    }
}
