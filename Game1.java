import java.awt.*;
import java.awt.event.*;
class Game1 implements ActionListener
{
Frame fr;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5,b6;
Panel p;
Game1 ()
{
fr=new Frame();
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

b1=new Button("ADD");
b2=new Button("SUBTRACT");
b3=new Button("MULTIPLY");
b4=new Button("DIVISION");
b5=new Button("REMINDER");
b6=new Button("RESET");

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

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);

fr.add(p);
fr.setVisible(true);
}
public void actionPerformed(ActionEvent obj)
{

}
public static void main(String ak[])
{
new Game1();
}
}