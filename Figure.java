package project;

import java.awt.*;

public class Figure {
    private int x;
    private int y;
    private int diameter;
    private Color color;
    private boolean isCircle=true;

    public Figure(int x, int y, int diameter, Color color,Boolean circ) {
        super();
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
        this.isCircle=circ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x){ this.x=x; }

    public int getY() {
        return y;
    }

    public void setY(int y){ this.y=y; }


    public int getDiameter() {
        return diameter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c){ this.color=c; }

    public void drawFigure(Graphics g){
        g.setColor(color);
       if(this.isCircle) g.fillOval(x,y,diameter,diameter);
       else  g.fillRect(x,y,diameter,diameter);
    }

    public void setCircle(Boolean t){
        this.isCircle=t;
    }
    public boolean getIsCircile(){
        return this.isCircle;
    }

}
