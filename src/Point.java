public class Point {
    private float x=0.0f;
    private float y=0.0f;

    public Point() {
    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
       this.x=x;
       this.y=y;

    }
    public float[] getXY(){
        return new float[]{x,y};
    }
    @Override
    public String toString(){
        return "("+getX()+","+getY()+")";
    }

    public static void main(String[] args) {
        Point point=new Point();
        System.out.println(point);
        Point point1=new Point(2.0f,3.0f);
        System.out.println(point1);
    }
}
