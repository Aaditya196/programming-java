
package userInterface_design;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener {
    JButton button1,button2,button3;
    JLabel name;
    
    public Menu(){
    button1 = new JButton("Play Game");
    button2 = new JButton("View Instructions ");
    button3 = new JButton("Exit");
    name = new JLabel("Hangman");
    name.setFont(new Font ("Serif",Font.PLAIN,24));
    
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    
    setTitle("HANGMAN GAME ");
    setVisible(true);
    setSize(300,300);
    setResizable(true);
    }
    public void addComponent(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        c.gridx = 0;
        c.gridy =0 ;
        c.weighty = 0.1;
        c.anchor = c.CENTER;
        add(name , c);
        
        c.gridx = 0; 
        c.gridy = 1 ;
        c.fill = c.HORIZONTAL;
        add(button1 ,c);
        
        c.gridx =0;
        c.gridy = 2;
        c.fill = c.HORIZONTAL;
        add(button2 ,c);
        
        c.gridx = 0;
        c.gridy = 3 ;
        c.fill = c.HORIZONTAL;
        add(button3 ,c);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            gameWindow obj =new gameWindow();
            obj.startGame();
        }
        else if(e.getSource()==button2){
            JOptionPane.showMessageDialog(this, "1.You can guess the word by clicking the character from virtual keypad. \n 2. You can select a maximum of 5 incorrect letters. \n 3. The incorrect guess will be highlighted with red color and the correct one will be highlighted with green color.","Instructions",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else if(e.getSource()==button3){
            System.exit(0);
        }
    }
    
}
