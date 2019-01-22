
package display;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Actionevent extends JFrame implements ActionListener{
 JPanel panel;
 JButton click;
 JLabel message;
 
 public Actionevent()
 {
     super("ACTION EVENT");
     click=new JButton("Click");
     message =new JLabel();
     panel =new JPanel();
     
     add(panel);
     panel.add(click);
     panel.add(message);
     
     setSize(400,400);
     setVisible(true);
     
     click.addActionListener(this);
 }

    public void actionPerformed(ActionEvent e) {
        message.setText("Welcome to event handling in java");
    }
    public static void main(String[]args){
       Actionevent ae = new Actionevent(); 
    }
}
