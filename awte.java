import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
class awte implements ActionListener
{
Frame f;
Panel p;
TextField t1,t2,t3;
Label l1,l2,l3;
Button b1,b2;
awte()
{
f=new Frame();
f.setSize(200,200);
f.setLayout(null);
p=new Panel(new GridLayout(4,2));
p.setBounds(200,300,800,400);
t1=new TextField();
t2=new TextField();
t3=new TextField();
l1=new Label("Enter a No");
l2=new Label("Enter Mobile No");
l3=new Label("Password");
b1=new Button("Add");
b2=new Button("Reset");
p.add(l1);
p.add(t1);

p.add(l2);
p.add(t2);

p.add(l3);
p.add(t3);

p.add(b1);
p.add(b2);

f.add(p);
f.setVisible(true);

b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent obj)
{
if(obj.getSource()==b1)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
 c=a+b;
t3.setText(String.valueOf(c));
}
if(obj.getSource()==b2)
{
t1.setText(" ");
t2.setText(" ");
t3.setText(" ");
}
}
public static void main(String args[])
{
new awte();
}
}