package render;

import display.ScreenDisplay;
import shape.Line;
import style.StyleScreen;
import util.Vector;

import java.awt.*;
import java.util.ArrayList;

public class LightRender {

    private int radius,points;
    Vector lightPoint;
    ArrayList<Vector> castRay;
    ScreenDisplay screen;

    //==============================================================
    //                      CONSTRUCTOR
    //==============================================================

    /**
     * create an Light render to cast shadow around the light point.
     *
     *
     * @param posX the x position of the light source.
     * @param posY the y position of the light source.
     * @param radius the radius (rayon) of the llight source.
     * @param points the number of points that the light will cast.
     * @param screen the place where the light point is drawn
     */
    public LightRender(int posX, int posY, int radius, int points, ScreenDisplay screen) {
        this.radius = radius;
        this.points = points;
        this.lightPoint = new Vector(posX,posY);
        this.castRay = new ArrayList<>();
        this.screen = screen;
    }

    //==============================================================
    //                      GETTER / SETTER
    //==============================================================

    public int getPosX() {
        return (int) lightPoint.x;
    }

    public void setPosX(int posX) {
        this.lightPoint.x = posX;
    }

    public int getPosY() {
        return (int) lightPoint.y;
    }

    public void setPosY(int posY) {
        this.lightPoint.y = posY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    //==============================================================
    //                         RAY CAST CACLULATE
    //==============================================================


    private void updateCast(){

        for (double angle = 0; angle <= 360; angle += (360/getPoints())) {

            int x = (int) (lightPoint.x + getRadius()*Math.sin(angle));
            int y = (int) (lightPoint.y + getRadius()*Math.cos(angle));

            for(shape.Shape shape : screen.getShapeList()){
                for(int i = 0;i<shape.pointsList.size()-1;i++){

                    this.castRay.add(correctedPoint(lightPoint,new Vector(x,y),shape.pointsList.get(i),shape.pointsList.get(i+1)));
                }

            }


        }

    }


    private Vector correctedPoint(Vector pt1,Vector pt2,Vector pt3, Vector pt4){


        double t = ( (pt1.x - pt3.x)*(pt3.y - pt4.y) - (pt1.y - pt3.y)*(pt3.x - pt4.x) )/(  (pt1.x - pt2.x)*(pt3.y - pt4.y) - (pt1.y - pt2.y)*(pt3.x - pt4.x)  );

        double u = -( (pt1.x - pt2.x)*(pt1.y - pt3.y) - (pt1.y - pt2.y)*(pt1.x - pt3.x) )/(  (pt1.x - pt2.x)*(pt3.y - pt4.y) - (pt1.y - pt2.y)*(pt3.x - pt4.x)  );

        ;

        if(t >= 0 && t<=1) return new Vector(pt1.x + t*(pt2.x - pt1.x), pt1.y + t*(pt2.y - pt1.y));
        //if(0.0 <= u && u <= 1.0)return  new Vector(pt3.x + t*(pt4.x - pt3.x), pt3.y + t*(pt4.y - pt3.y));
        return pt2;
    }















    //==============================================================
    //                          DISPLAY
    //==============================================================


    /**
     * update the position of the light point
     *
     * @param x the new x position
     * @param y the new y position
     */
    public void update(int x,int y){
        this.setPosX(x);
        this.setPosY(y);
    }

    /**
     * display the render of the light source
     * lead by the environment
     *
     * @param g2 the graphical solution to render
     */
    public void render(Graphics2D g2){

        updateCast();
        g2.setColor(StyleScreen.LIGHT);
        g2.setStroke(new BasicStroke(3));
        for(Vector ray : castRay){
            g2.drawLine((int)lightPoint.x,(int)lightPoint.y,(int)ray.x,(int)ray.y);
        }


    }
}
