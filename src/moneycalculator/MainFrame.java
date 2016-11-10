package moneycalculator;


import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class MainFrame extends JFrame{

    public MainFrame()  {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        this.setMenuBar(menubar());
        setVisible(true);
    }

    private MenuBar menubar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(calculate());
        return menuBar;
    }

    private Menu calculate() {
        Menu menu = new Menu("Calculate");
        menu.add(newExchange());
        return menu;
    }

    private MenuItem newExchange() {
        MenuItem menuItem = new MenuItem("New");
        menuItem.addActionListener(doNextExchange());
        return menuItem;
    }

    private ActionListener doNextExchange() {
        return new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("New ExchangeRate");
            }
        };
    }
}
