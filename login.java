import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class login extends Applet
{
TextField t1;
JPasswordField t2;
Label l1,l2;
Button b1,b2;
Panel p;
public void init()
{
p=new Panel(new GridLayout(3,2));
t1=new TextField();
t2=new JPasswordField();
l1=new Label("username");
l2=new Label("password");
b1=new Button("Login");
b2=new Button("Reset");
p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(b1);
p.add(b2);
add(p);
}
}
/*
<applet code="login.class"height="2000"width="2000">
</applet>
*/



