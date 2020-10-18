package run;

import javax.swing.*;
import java.awt.*;
import display.*;
import render.LightRender;


public class TestLightRender extends JFrame {

    ScreenDisplay screen;

    public TestLightRender() throws HeadlessException {
        this.init();

    }

    private void init() {

        //=============================================
        //            WINDOW INIT
        //=============================================

        this.setPreferredSize(new Dimension(1000,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //=============================================
        //            PANEL INIT
        //=============================================

        this.screen = new ScreenDisplay();




        //=============================================
        //             INIT COMPONENTS
        //=============================================


        //this.screen.addShape(new shape.Line(500,300,500,100,screen));
        //this.screen.addShape(new shape.Line(300,300,300,550));
        this.screen.addShape(new shape.Rectange(100,200,100,200,screen));
        LightRender rd = new LightRender(300,300,300,10,screen);
        this.screen.addLigthPoint(rd);





        //=============================================
        //             ADDING COMPONENTS
        //=============================================
        this.add(this.screen);



        this.pack();
    }

    public static void main(String[] args){
        new TestLightRender().setVisible(true);

    }

}
