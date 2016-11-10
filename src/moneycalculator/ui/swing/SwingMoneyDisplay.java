package moneycalculator.ui.swing;

import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(amout());
        add(currency());
    }

    private JLabel amout() {
        return new JLabel("$");
        
    }

    private JLabel currency() {
        return new JLabel("500");
    }
    
}
