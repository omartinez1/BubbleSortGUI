import javax.swing.JFrame;
public class SortFrame 
{
//-----------------------------------------------------------------
// Creates and displays the temperature converter GUI.
//-----------------------------------------------------------------
public static void main(String[] args)
{
JFrame frame = new JFrame("Sort");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
SortFramePanel panel = new SortFramePanel();
frame.getContentPane().add(panel);
frame.pack();
frame.setVisible(true);
}



}
