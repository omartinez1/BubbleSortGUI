import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SortFramePanel extends JPanel
{
private JLabel inputLabel, outputLabel, resultLabel;
private JTextField field1, field2, field3, field4,field5;


//-----------------------------------------------------------------
// Constructor: Sets up the main GUI components.
//-----------------------------------------------------------------
public SortFramePanel()
{
setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));
JButton button1;
inputLabel = new JLabel("Enter five numbers to sort:");
outputLabel = new JLabel("Sorted Numbers: ");
resultLabel = new JLabel();
button1 = new JButton("Sort");
field1 = new JTextField(5);
field2 = new JTextField(5);
field3 = new JTextField(5);
field4 = new JTextField(5);
field5 = new JTextField(5);
add(inputLabel);
add(field1);
add(field2);
add(field3);
add(field4);
add(field5);
add(button1);
add(outputLabel);
add(resultLabel);
Button1Listener  button1Listener = new Button1Listener();
button1.addActionListener(button1Listener);
setPreferredSize(new Dimension(300, 300));
setBackground(Color.pink);
}
//*****************************************************************
// Represents an action listener 
//*****************************************************************


private class Button1Listener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        int a[] = new int[5];
        a[0] = Integer.parseInt(field1.getText());
        a[1] = Integer.parseInt(field2.getText());
        a[2] = Integer.parseInt(field3.getText());
        a[3] = Integer.parseInt(field4.getText());
        a[4] = Integer.parseInt(field5.getText());
        bubbleSort(a);
        String s = "";
        for(int i=0; i<a.length; i++){
            if(i == a.length-1){
                s = s + a[i];
            }
            else{
            s = s + a[i]+", ";
            }
        }
        resultLabel.setText(s);
    }
    
}

private static void bubbleSort(int[] a) {
    int n = a.length;
    int temp = 0;
   
    for(int i=0; i < n; i++){
         for(int j=1; j < (n-i); j++){
             if(a[j-1] > a[j]){
                temp = a[j-1];
                 a[j-1] = a[j];
                 a[j] = temp;
                }
         }
    }
}

}