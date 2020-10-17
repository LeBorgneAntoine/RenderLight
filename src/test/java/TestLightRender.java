import javax.swing.*;
import java.awt.*;

public class TestLightRender extends JFrame {


    public TestLightRender() throws HeadlessException {
        this.init();
    }

    private void init() {

        //=============================================
        //            WINDOW INIT
        //=============================================

        this.setPreferredSize(new Dimension(800,800));

        //=============================================
        //            PANEL INIT
        //=============================================






        this.pack();
    }

    public static void main(String[] args){
        new TestLightRender().setVisible(true);
    }

}
