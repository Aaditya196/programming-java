
package display;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class joptionPane extends JFrame {
    
    public joptionPane()
    {
        setVisible(false);
        setSize(400,400);
        JOptionPane.showConfirmDialog( this,"Do you really need to save it ?","Confirmation Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        
    }
    public static void main(String[]args)
    {
    joptionPane jo =new joptionPane();
}
}
