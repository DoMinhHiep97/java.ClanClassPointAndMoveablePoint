public class MoveablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    public void move(){
        setXY(getX()+getxSpeed(),getY()+getySpeed());
    }

//@Override
//public void setX(float x){
//        setX(getX()+getxSpeed());
//}
//@Override
//public void setY(float y){
//        setY(getY()+getySpeed());
//}
    @Override
    public String toString(){
        return "("+getX()+","+getY()+"),speed=("+getxSpeed()+","+getySpeed()+")";
    }

    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint();
        MoveablePoint moveablePoint1=new MoveablePoint(5.0f,5.0f);

        MoveablePoint moveablePoint2=new MoveablePoint(3.0f,3.0f,7.0f,7.0f);

        System.out.println(moveablePoint);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint2);
    }
}
