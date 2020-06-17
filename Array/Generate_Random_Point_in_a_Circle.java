class Solution {

    Random rand;
    double r;
    double x,y;
    public Solution(double radius, double x_center, double y_center) {
        r=radius;
        x=x_center;
        y=y_center;
        rand=new Random();
    }
    
    public double[] randPoint() {
        double x1=0;
        double y1=0;
        do{
            x1=-r+2*r*Math.random();
            y1=-r+2*r*Math.random();
        }while(x1*x1+y1*y1>r*r);
        return new double[]{x+x1,y+y1};
    }
}