import java.awt.*;
import java.awt.event.*;

public class Maxof3 extends Frame implements ActionListener
{
 Label label1,label2,label3, result;
 TextField num1,num2,num3;
 Button findMax;
 
 Maxof3()
 {
  setLayout(new FlowLayout());
  
  label1=new Label("Enter first Number: ");
  num1 = new TextField(10); 
  label2=new Label("Enter second Number: ");
  num2 = new TextField(10);
  label3=new Label("Enter third Number: ");
  num3 = new TextField(10);
  findMax = new Button("Find Maximum");
  result = new Label("Result: ");
  add(label1); add(num1);
  add(label2); add(num2);
  add(label3); add(num3);
  add(findMax); add(result);
  
  findMax.addActionListener(this);
  
  setTitle("Max of three Numbers");
  setSize(300,200);
  setVisible(true);
  
  addWindowListener(new WindowAdapter()
  {
   public void windowClosing(WindowEvent we)
   {
    dispose();
   }
  });
 }
 
 public void actionPerformed(ActionEvent ae)
 {
  int a=Integer.parseInt(num1.getText());
  int b=Integer.parseInt(num2.getText());
  int c=Integer.parseInt(num3.getText());
  int max=Math.max(a,Math.max(b,c));
  result.setText("Result: Maximum is "+max);
 }
 
 public static void main(String[] args)
 {
  new Maxof3();
 }
}
    
    
    
    
    
    
    
