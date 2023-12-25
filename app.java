import java.applet.*;
import java.awt.*;
public class app extends Applet
{
public void paint(Graphics obj)
{
obj.drawString("hello java",120,200);
obj.drawRect(10,10,300,120); 
}
}
/*
<html>
<body>
<applet code ="app.class"height="1200"width="900">
</applet>
</body>
</html>
*/