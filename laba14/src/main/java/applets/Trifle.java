package applets;

import java.applet.Applet;
import java.awt.*;

public class Trifle extends Applet {
    String lighthouse = "";

    public void init() {
        setBackground(Color.black);
        setForeground(Color.white);
        lighthouse += "--init--";
    }

    public void start(){
        lighthouse += "--start--";
    }

    public void stop(){
        lighthouse += "--stop--";
    }

    public void destroy(){
        lighthouse += "--destroy--";
    }

    public void paint(Graphics g){
        lighthouse += "--paint--";
        g.drawString(lighthouse,10,50);
    }
}
