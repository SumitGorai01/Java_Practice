import java.awt.*;
import java.awt.event.*;
class mobile extends WindowAdapter implements ActionListener
{
Frame fr;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5,b6;
Panel p;
Font f;
mobile ()
{
fr=new Frame();
f= new Font("Monospaced", Font.ITALIC, 30);
fr.setSize(2000,2000);
fr.setLayout(null);
p=new Panel(new GridLayout(6,2));
p.setBounds(500,200,1000,600);
l1=new Label("ENTER 1ST NO.");
l2=new Label("ENTER 2ND NO.");
l3=new Label("RESULT");

t1=new TextField();
t2=new TextField();
t3=new TextField();

b1=new Button("ADD (+)");
b2=new Button("SUBTRACT (-)");
b3=new Button("MULTIPLY (X)");
b4=new Button("DIVISION (/)");
b5=new Button("REMINDER (%)");
b6=new Button("RESET (AC)");

p.add(l1);
p.add(t1);

p.add(l2);
p.add(t2);

p.add(l3);
p.add(t3);

p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
l1.setFont(f);
l2.setFont(f);
l3.setFont(f);
t1.setFont(f);
t2.setFont(f);
t3.setFont(f);
b1.setFont(f);
b2.setFont(f);
b3.setFont(f);
b4.setFont(f);
b5.setFont(f);
b6.setFont(f);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
fr.addWindowListener(this);
fr.add(p);
fr.setVisible(true);
}
public void windowClosing (WindowEvent e) 
{    
fr.dispose();    
}    
public void actionPerformed(ActionEvent obj)
{
if(obj.getSource()==b1)
{
int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x+y;
t3.setText(String.valueOf(z));
}
if(obj.getSource()==b2)
{
int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x-y;
t3.setText(String.valueOf(z));
}
if(obj.getSource()==b3)
{
int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x*y;
t3.setText(String.valueOf(z));
}
if(obj.getSource()==b4)
{
int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x/y;
t3.setText(String.valueOf(z));
}
if(obj.getSource()==b5)
{
int x,y,z;
x=Integer.parseInt(t1.getText());
y=Integer.parseInt(t2.getText());
z=x%y;
t3.setText(String.valueOf(z));
}
if(obj.getSource()==b6)
{
t1.setText("");
t2.setText("");
t3.setText("");
}
}
public static void main(String ak[])
{
new mobile();
}
}