package moneycalculator;


import java.awt.*;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame{
    
    private int index = 0;

    public MainFrame()  {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        setMenuBar(menubar());
        setLayout(new BorderLayout());
        add(label(), BorderLayout.NORTH);
        add(label(), BorderLayout.SOUTH);
        add(label(), BorderLayout.WEST);
        add(label(), BorderLayout.EAST);
        add(moneyDisplay());
        
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

    private JPanel label(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(new JLabel("A" + index++));
        return panel;
    }

    private SwingMoneyDisplay moneyDisplay(){
        SwingMoneyDisplay swingMoneyDisplay = new SwingMoneyDisplay();
        return swingMoneyDisplay;
    }
}
