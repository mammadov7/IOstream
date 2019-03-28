package project;


import javax.swing.JPanel;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Panel extends JPanel{
    private List<Figure> circles = new LinkedList<Figure>();


    public void addCircle(Figure circle){
        circles.add(circle);
        this.repaint();
    }

    public void moveCircle(int x,int y){
        for (Figure c: circles){
            if(c.getX()>=x-10 && c.getX()<=x+10)
                if(c.getY()>=y-10 && c.getY()<=y+10){
                    c.setX(x); c.setY(y);
                    break;
                }
        }
        this.repaint();
    }

    public void removeCircle(int x,int y){
        for (Figure c: circles){
            if(c.getX()>=x-10 && c.getX()<=x+10)
                if(c.getY()>=y-10 && c.getY()<=y+10) {
                    circles.remove(c);
                    break;
                }
        }
        this.repaint();
    }

    public List<Figure> getList(){
        return circles;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
     /*   if(true)    for(Figure c: circles){ c.drawCircle(g); }
        else    for(Figure c: circles){ c.drawSquare(g); }*/
    }


}
