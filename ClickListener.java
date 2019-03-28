package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.List;

public class ClickListener extends JPanel implements MouseListener, MouseMotionListener {

    private List<Figure> figures = new LinkedList<Figure>();
    CSVReader reader = new CSVReader("data.csv");
    int x,y;
    Menu menu = new Menu();
    public ClickListener(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void addFigure(Figure figure){
        figures.add(figure);
        this.repaint();
    }

    public void moveFigure(int x,int y){
        for (Figure c: figures){
            if(c.getX()>=x-10 && c.getX()<=x+10)
                if(c.getY()>=y-10 && c.getY()<=y+10){
                    c.setX(x); c.setY(y);
                    break;
                }
        }
        this.repaint();
    }

    public void removeFigure(int x,int y){
        for (Figure c: figures){
            if(c.getX()>=x-10 && c.getX()<=x+10)
                if(c.getY()>=y-10 && c.getY()<=y+10) {
                    figures.remove(c);
                    break;
                }
        }
        this.repaint();
    }

    public void loadData(){
        CSVReader r = new CSVReader("data.csv");
        r.importData();
        for(int i=0;i<r.getNumberOfEntries();i+=7) {
            boolean c = Boolean.parseBoolean(r.getEntry(i)); // for defining the shape of the figure
            int a = Integer.parseInt(r.getEntry(i+1)); // x,y coordinates
            int b = Integer.parseInt(r.getEntry(i+2));
            int dia = Integer.parseInt(r.getEntry(i+3));//diameter for circle or side of the square
            int red= Integer.parseInt(r.getEntry(i+4)); // rgb for loading the color
            int green= Integer.parseInt(r.getEntry(i+5));// of the figure
            int blue= Integer.parseInt(r.getEntry(i+6));
            addFigure(new Figure(a,b,dia,new Color(red,green,blue),c));
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        for(Figure c: figures ){
            c.drawFigure(g);
        }
        if(menu.Save){ reader.writeData(figures); menu.Save=false; }
        if(menu.Reload){ loadData(); menu.Reload=false; }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x=e.getX()-10; y=e.getY()-10;
        this.moveFigure(x,y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
        public void mouseClicked(MouseEvent e) {
        Figure figure = new Figure(e.getX()-10,e.getY()-10,
                20, menu.color ,menu.Circle);
        if(e.getClickCount() == 2){
            this.addFigure(figure);
        }
        else if(e.getClickCount() ==  1)
            this.removeFigure(e.getX()-10,e.getY()-10);
    }

    @Override
    public void mousePressed(MouseEvent e) {

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
}