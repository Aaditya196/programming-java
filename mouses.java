
package innerClasses;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;

public class mouses extends JFrame implements MouseMotionListener {
            JLabel position;
            int x, y;
            
              public mouses() {
                position = new JLabel();
                  setVisible(true);
                setSize(300,300);
                setTitle("FRAME & MOUSE ");
                setLayout(new FlowLayout());
                add(position);
                addMouseMotionListener(this);
               
        }
    @Override
    public void mouseDragged(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        position.setText("Mouse cursor is at " +x +" " +y);
    }
    

    
    @Override
    public void mouseMoved(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        position.setText("Mouse cursor is at " +x +" " +y);
    }
     
   public static void main(String[]args){
       mouses m =new mouses();
       m.mouseMoved(null);
       m.mouseDragged(null);
       
   }
    
}
