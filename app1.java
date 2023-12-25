import java.applet.*;
import java.awt.*;
public class app1 extends Applet
{
public void paint(Graphics obj)
{
obj.drawRect(40,400,300,100);
obj.drawArc(10,20,400,430,510,450);
obj.fillArc(500,20,400,430,510,450);
obj.drawLine(200,100,40,100);
}
}
/*
<applet code="app1.class" height="1200" width="1200">
</applet>
*/
