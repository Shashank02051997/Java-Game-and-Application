//Color Changer
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="vyon100" width=600 height=600>
 </applet>
 */
public class Color_Changer extends Applet implements AdjustmentListener
{ Scrollbar hsb1,hsb2,hsb3;
  int v1,v2,v3;
  public void init()
  { setLayout(null);
    hsb1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
    hsb2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
    hsb3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,255);
    add(hsb1);add(hsb2);add(hsb3);
    hsb1.addAdjustmentListener(this);
    hsb2.addAdjustmentListener(this);
    hsb3.addAdjustmentListener(this);
    hsb1.setBounds(10,30,800,30);
    hsb2.setBounds(10,90,800,30);
    hsb3.setBounds(10,150,800,30);
  }
  public void adjustmentValueChanged(AdjustmentEvent ae)
  { repaint();
  }
  public void paint(Graphics g)
  { setSize(830,400);
    g.drawString("Red Color",10,20);
    g.drawString("Green Color",10,80);
    g.drawString("Blue Color",10,140);
    g.drawString("Color Output",10,205);
    v1=hsb1.getValue();
    v2=hsb2.getValue();
    v3=hsb3.getValue();
    Color c=new Color(v1,v2,v3);
    g.setColor(c);
    g.fillRect(10,220,800,150);
    showStatus("RED COLOR="+v1+"    GREEN COLOR="+v2+"    BLUE COLOR="+v3);
  }
}
