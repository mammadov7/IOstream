/*package project;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;

public class Test extends Applet implements MouseListener, MouseMotionListener {
    int x,y;
    private List<Figure> circles = new LinkedList<Figure>();
    private List<Figure> squares = new LinkedList<Figure>();
    CheckboxGroup figureType;
    public void init(){
        setBackground(Color.white);
        figureType=new CheckboxGroup();
        add(new Checkbox("Circle",figureType,true));
        add(new Checkbox("Square",figureType,false));
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        if(figureType.getSelectedCheckbox().getLabel().equals("Circle"))
            for (Figure c: circles){
                c.drawCircle(g,true);
            }
        else
            for (Figure s: squares){
             //   s.drawSquare(g);
            }
    }

    public void addFigure(Figure figure){
        if(figureType.getSelectedCheckbox().getLabel().equals("Circle"))
            circles.add(figure);
        else
            squares.add(figure);
        this.repaint();

    }

    public void removeFigure(int x,int y){
        if(figureType.getSelectedCheckbox().getLabel().equals("Circle"))
            for (Figure c: circles){
            if(c.getX()>=x-2 && c.getX()<=x+2)
                if(c.getY()>=y-2 && c.getY()<=y+2) {
                    circles.remove(c);
                    break;
                }
            }
        else
            for (Figure s: squares) {
                if (s.getX() >= x - 2 && s.getX() <= x + 2)
                    if (s.getY() >= y - 2 && s.getY() <= y + 2) {
                        squares.remove(s);
                        break;
                    }
            }
        this.repaint();
    }

    public void changeColor(int x,int y){
        if(figureType.getSelectedCheckbox().getLabel().equals("Circle"))
            for (Figure c: circles){
                if(c.getX()>=x-2 && c.getX()<=x+2)
                    if(c.getY()>=y-2 && c.getY()<=y+2) {
                        c.setColor(Color.BLUE);
                        break;
                    }
            }
        else
            for (Figure s: squares) {
                if (s.getX() >= x - 2 && s.getX() <= x + 2)
                    if (s.getY() >= y - 2 && s.getY() <= y + 2) {
                        s.setColor(Color.BLUE);
                        break;
                    }
            }
        this.repaint();
    }

    public void moveFigure(int x,int y){
        if(figureType.getSelectedCheckbox().getLabel().equals("Circle"))
            for (Figure c: circles){
                if(c.getX()>=x-5 && c.getX()<=x+5)
                    if(c.getY()>=y-5 && c.getY()<=y+5){
                        c.setX(x); c.setY(y);
                          break;
                    }
            }
        else
            for (Figure s: squares){
                if(s.getX()>=x-5 && s.getX()<=x+5)
                    if(s.getY()>=y-5 && s.getY()<=y+5){
                        s.setX(x); s.setY(y);
                        break;
                    }
            }
        this.repaint();
    }

    public void saveData(){
        CSVReader r = new CSVReader("data.csv");
            r.writeData("Circle", circles);
    }

    public void loadData(){
        CSVReader r = new CSVReader("data.csv");
        r.importData();
        for(int i=0;i<r.getNumberOfEntries();i+=5) {
            int a = Integer.parseInt(r.getEntry(i+1));
            int b = Integer.parseInt(r.getEntry(i+2));
            int dia = Integer.parseInt(r.getEntry(i+3));
            addFigure(new Figure(a,b,dia,Color.BLUE));
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX(); y=e.getY();
        Figure f = new Figure(x,y,20,Color.red);
        if(e.getClickCount() == 2){
           addFigure(f);
        }
        else if(e.getClickCount()==1)
            removeFigure(x,y);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x=e.getX(); y=e.getY();
        moveFigure(x,y);
    }


    @Override
    public void mousePressed(MouseEvent e) {
       // x=e.getX(); y=e.getY();
       // changeColor(x,y);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
*/