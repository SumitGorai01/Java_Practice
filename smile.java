import java.applet.*;
import java.awt.*;
import java.awt.Color;
public class smile extends Applet
{
public void init()
{
setForeground(Color.orange);
setBackground(Color.white);
}
public void paint(Graphics obj)
{
obj.setColor(Color.yellow);
obj.drawArc(600,10,700,700,700,700);
obj.fillArc(600,10,700,700,700,700);
obj.setColor(Color.black);
obj.drawArc(730,200,120,120,240,370);
obj.fillArc(730,200,120,120,240,370);
obj.drawArc(1060,200,120,120,240,370);
obj.fillArc(1060,200,120,120,240,370);
obj.setColor(Color.green);
obj.drawArc(750,500,400,100,170,400);
obj.fillArc(750,500,400,100,170,400);
obj.setColor(Color.white);
obj.drawArc(755,200,70,70,240,370);
obj.fillArc(755,200,70,70,240,370);
obj.drawArc(1085,200,70,70,240,370);
obj.fillArc(1085,200,70,70,240,370);
obj.setColor(Color.red);
obj.drawArc(920,370,70,70,240,370);
obj.fillArc(920,370,70,70,240,370);
}
}
/*
<html>
<body>
<applet code="smile.class"height="2000" width="2200">
</applet>
</body>
</html>
*/
