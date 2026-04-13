// -- Mouse double click event handling -- //

import javax.swing.*; 
import java.awt.event.*; 

public class Mouse_Double_Click extends JFrame implements MouseListener { 
    JLabel label; 
    public Mouse_Double_Click() { 
        label = new JLabel("Double click anywhere", JLabel.CENTER); 
        add(label); 
        addMouseListener(this); 
        setTitle("Double Click Detection"); 
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
    } 
    
    public void mouseClicked(MouseEvent e) { 
        if (e.getClickCount() == 2) { 
            label.setText("Double Click Detected!"); 
        } 
    } 
    
    public void mousePressed(MouseEvent e) {} 
    public void mouseReleased(MouseEvent e) {} 
    public void mouseEntered(MouseEvent e) {} 
    public void mouseExited(MouseEvent e) {}
    
    public static void main(String[] args) {
        new Mouse_Double_Click(); 
    } 
} 
