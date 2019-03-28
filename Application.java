package project;

import javax.swing.*;
import java.awt.*;

public class Application {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        Menu menu = new Menu();
        window.setJMenuBar(menu);
        window.add(new ClickListener());
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setVisible(true);
    }
}
