package render;

import util.Vector;

import java.awt.*;

public class LightRender {

    private int posX,posY,radius,points;
    Vector lightPoint;

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
     */
    public LightRender(int posX, int posY, int radius, int points) {
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
        this.points = points;
    }

    public void createLightPoint(){
        this.lightPoint = new Vector(posX,posY);




    }

    //==============================================================
    //                      GETTER / SETTER
    //==============================================================

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
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


    private Vector isStopAt(int size,Vector start,Vector end){


        return new Vector(1,1);


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
     * @param g the graphical solution to render it
     */
    public void render(Graphics g){

    }
}
