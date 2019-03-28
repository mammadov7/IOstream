package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JMenuBar{
    static boolean  Circle=true;
    static boolean Save=false;
    static boolean Reload =false;
    static Color color=Color.RED;
    public Menu() {
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("Exit")){
                        System.exit(0);
                }
                if(e.getActionCommand().equals("Save")){
                    Save=true;
                }
                if(e.getActionCommand().equals("Circle")){
                   Circle=true;
                 }
                if(e.getActionCommand().equals("Square")){
                    Circle=false;
                }
                if(e.getActionCommand().equals("Reload")){
                    Reload=true;
                }
                if(e.getActionCommand().equals("Red")){
                    color=Color.RED;
                }
                if(e.getActionCommand().equals("Green")){
                    color=Color.GREEN;
                }
                if(e.getActionCommand().equals("Blue")){
                    color=Color.BLUE;
                }
            }
        };
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuColor = new JMenu("Color");

        JMenuItem itmSave = new JMenuItem("Save");
        itmSave.addActionListener(action); menuFile.add(itmSave);
        JMenuItem itmReload = new JMenuItem("Reload");
        itmReload.addActionListener(action); menuFile.add(itmReload);
        JMenuItem itmExit = new JMenuItem("Exit");
        itmExit.addActionListener(action); menuFile.add(itmExit);
        JMenuItem itmCircle = new JMenuItem("Circle");
        itmCircle.addActionListener(action); menuEdit.add(itmCircle);
        JMenuItem itmSquare = new JMenuItem("Square");
        itmSquare.addActionListener(action); menuEdit.add(itmSquare);
        JMenuItem itmRed = new JMenuItem("Red");
        itmRed.addActionListener(action); menuColor.add(itmRed);
        JMenuItem itmGreen = new JMenuItem("Green");
        itmGreen.addActionListener(action); menuColor.add(itmGreen);
        JMenuItem itmBlue = new JMenuItem("Blue");
        itmBlue.addActionListener(action); menuColor.add(itmBlue);


        this.add(menuFile);
        this.add(menuEdit);
        this.add(menuColor);
    }

}
